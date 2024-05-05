package com.santeut.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.santeut.data.apiservice.PostApiService
import com.santeut.data.model.request.CreatePostRequest
import com.santeut.data.model.response.PostResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor(
    private val postApiService: PostApiService
) : PostRepository {
    override suspend fun getPosts(postType: Char): List<PostResponse> {
        return try {
            val response = postApiService.getPosts(postType)
            if (response.isSuccessful) {
                response.body()?.data?.postList ?: emptyList()
            } else {
                Log.e(
                    "PostRepository",
                    "Error fetching posts: ${response.code()} - ${response.message()}"
                )
                emptyList()
            }
        } catch (e: Exception) {
            Log.e("PostRepository", "Network error: ${e.message}", e)
            emptyList()
        }
    }

    override suspend fun createPost(createPostRequest: CreatePostRequest): Flow<Unit> = flow {
        val response = postApiService.createPost(createPostRequest)
        if (response.status == "200") {
            emit(response.data)
        }
    }
}
