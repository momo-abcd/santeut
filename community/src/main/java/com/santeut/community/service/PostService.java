package com.santeut.community.service;

import com.santeut.community.common.exception.AccessDeniedException;
import com.santeut.community.common.exception.JpaQueryException;
import com.santeut.community.dto.request.PostCreateReqeustRequestDto;
import com.santeut.community.dto.request.PostUpdateReqeustRequestDto;
import com.santeut.community.feign.dto.CommentListFeignDto;
import com.santeut.community.dto.response.PostListResponseDto;
import com.santeut.community.dto.response.PostReadResponseDto;
import com.santeut.community.entity.PostEntity;
import com.santeut.community.feign.service.AuthServerService;
import com.santeut.community.feign.service.CommonServerService;
import com.santeut.community.repository.PostRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class PostService {
    private final PostRepository postRepository;
    private final AuthServerService authServerService;
    private final CommonServerService commonServerService;


    // 게시글 목록을 불러오는 Service
    public PostListResponseDto getPosts(char postType) {

        return new PostListResponseDto(postRepository.findAllByPostType(postType)
                .orElseThrow(() -> new JpaQueryException("게시글 목록 불러오는중 DB 오류 발생"))
                .stream()
                .map(post -> {
                            // 닉네임 받아오기 위한 feign 함수
                            String userNickName = authServerService.getNickname(post.getUserId());
                            // 좋아요 수 가져오기 위한 feign 함수
                            int likeCnt = commonServerService.getLikeCnt(post.getId(), post.getPostType());
                            // 댓글 수 가져오기 위한 feign 함수
                            int commentCnt = commonServerService.getCommentCnt(post.getId(), post.getPostType());
                            return PostListResponseDto.PostInfo.builder()
                                    .postId(post.getId())
                                    .postTitle(post.getPostTitle())
                                    .postContent(post.getPostContent())
                                    .likeCnt(likeCnt)
                                    .commentCnt(commentCnt)
                                    .createdAt(post.getCreatedAt())
                                    .postType(post.getPostType())
                                    .userNickname(userNickName)
                                    .hitCnt(post.getHitCnt())
                                    .build();
                        }
                )
                .collect(Collectors.toList()));
    }

    // 게시글 작성 (CREATE)
    public void createPost(PostCreateReqeustRequestDto postCreateReqeustRequestDto) {
        postRepository.save(PostEntity.builder()
                .userId(postCreateReqeustRequestDto.getUserId())
                .postType(postCreateReqeustRequestDto.getPostType())
                .postTitle(postCreateReqeustRequestDto.getPostTitle())
                .postContent(postCreateReqeustRequestDto.getPostContent())
                .userPartyId(postCreateReqeustRequestDto.getUserPartyId())
                .build()
        );
    }

    // 게시글 읽기 (READ)
    public PostReadResponseDto readPost(int postId, char postType) {

        PostEntity postEntity = postRepository.findByIdAndPostType(postId, postType).orElseThrow(() -> new JpaQueryException("게시글 디테일 읽기중 DB 오류 발생"));
        CommentListFeignDto commentListFeignDto = commonServerService.getCommentList(postId, postType);
        return PostReadResponseDto.builder()
                .postId(postEntity.getId())
                .postType(postEntity.getPostType())
                .postTitle(postEntity.getPostTitle())
                .postContent(postEntity.getPostContent())
                .userNickname(authServerService.getNickname(postEntity.getUserId()))
                .hitCnt(postEntity.getHitCnt())
                .commentList(commentListFeignDto.getCommentList())
                .createdAt(postEntity.getCreatedAt())
                .build();
    }

    // 게시글 수정 (UPDATE)
    public void updatePost(PostUpdateReqeustRequestDto postUpdateReqeustRequestDto, int postId, char postType) {
        // title, content 외의 부분은 그대로 저장을 해야 하므로 우선 게시글을 조회해서 PostEntity에 넣어줌
        PostEntity post = postRepository.findByIdAndPostType(postId, postType)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Post not found"));
        // 바뀐 제목과 본문을 저장해줌
        post.setPostTitle(postUpdateReqeustRequestDto.getPostTitle());
        post.setPostContent(postUpdateReqeustRequestDto.getPostContent());
        // jpa를 이용하여 실제로 저장함
        postRepository.save(post);
    }

    // 게시글 삭제 (DELETE)
    public void deletePost(int postId, char postType, int requestUserId) {
        PostEntity page = postRepository.findByIdAndPostType(postId, postType).orElseThrow(() -> new JpaQueryException("게시글 삭제 조회 중 오류 발생"));
        // 게시글의 유저ID와 요청한 유저의 ID가 일치하는지 확인 하는 로직
        if(page.getUserId() == requestUserId) {
            postRepository.deletePostDirectly(postId, LocalDateTime.now());
        }else {
            throw new AccessDeniedException("삭제할 권한이 없습니다.");
        }
    }
}
