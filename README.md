# 🏔 산뜻

#### 등산 종합 서비스 앱

<br />

## 🕞 프로젝트 진행 기간
**2024.04.08 ~ 2024.05.20** (6주)

<br />

### 기획배경
등산은 가고 싶고, 위험할까 걱정이 되시나요?
'산뜻'에서 동호회 사람들과 함께 떠나보는 건 어떨까요?

회원들의 위치는 물론 위험 신호를 보내 위험한 상황에서 도움을 받을 수 있습니다!

<br />

## 💬 주요 기능
1. 등산 관련 정보 제공
    - 산, 코스, 날씨 정보

2. 등산 커뮤니티 기능
    - 동호회, 소모임
        - 지역별, 나이별, 성별 그룹으로 동호회 생성
        - 실제 산, 코스 정보를 선택하여 등산 일정 생성 및 관리
        - 회원관리, 채팅
    - 게시판
        - 동호회, 등산 Tip, 코스 공유

3. 등산 보조 기능
    - 사용자 간 실시간 위치 공유
    - 갤럭시 워치를 활용한 건강 데이터 측정
    - 경로 이탈 시 위험 신호
    - 신체 데이터를 활용한 위험 신호

4. 기타 기능
    - 사진 촬영으로 식물 정보 검색
    - 등산 기록, 랭킹


<br />

## 📱 서비스 화면

0. 로그인, 회원가입

0. 홈 화면

0. 커뮤니티 (게시판 * 4)

0. 마이 페이지 (*3)

0. 동호회 생성, 관리

0. 소모임 생성, 관리

0. 등산

0. 식물 검색

0. 

0. 


<br />

## 👩‍💻 개발 환경

<a name="item-three"></a>

|일정관리|형상관리|커뮤니케이션|디자인|
|:---:|:---:|:---:|:---:|
| ![JIRA](https://img.shields.io/badge/jira-0052CC?style=for-the-badge&logo=jirasoftware&logoColor=white) | ![GITLAB](https://img.shields.io/badge/gitlab-FC6D26?style=for-the-badge&logo=gitlab&logoColor=white) | ![EXCEL](https://img.shields.io/badge/googlesheets-34A853?style=for-the-badge&logo=notion&logoColor=white) | ![Figma](https://img.shields.io/badge/figma-%23F24E1E.svg?style=for-the-badge&logo=figma&logoColor=white) |


<br />


#### IDE

![Android Studio](https://img.shields.io/badge/android%20studio-346ac1?style=for-the-badge&logo=android%20studio&logoColor=white) ![IntelliJ](https://img.shields.io/badge/intellijidea-000000?style=for-the-badge&logo=intellijidea&logoColor=white)

<br />


#### Frontend
![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)  
![jetpack_compose](https://img.shields.io/badge/jetpack_compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white) ![coroutine](https://img.shields.io/badge/coroutine-8A9296?style=for-the-badge&logo=coroutine&logoColor=white)  
![okHttp](https://img.shields.io/badge/okHttp-009020?style=for-the-badge&logo=okHttp&logoColor=white) ![Retrofit](https://img.shields.io/badge/Retrofit-CC0000?style=for-the-badge&logo=Retrofit&logoColor=white)
![hilt](https://img.shields.io/badge/hilt-231F20?style=for-the-badge&logo=hilt&logoColor=white) ![ksp](https://img.shields.io/badge/ksp-ED8106?style=for-the-badge&logo=ksp&logoColor=white)  
![naver_map](https://img.shields.io/badge/naver_map-03C75A?style=for-the-badge&logo=naver&logoColor=white) ![google](https://img.shields.io/badge/google_map-4285F4?style=for-the-badge&logo=google&logoColor=white) ![Firebase](https://img.shields.io/badge/firebase-FFCA28?style=for-the-badge&logo=firebase&logoColor=white)

<br />


#### Backend

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)  
![SpringBoot](https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white) ![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens) ![SpringSecurity](https://img.shields.io/badge/springsecurity-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)  
![AmazonS3](https://img.shields.io/badge/AmazonS3-569A31?style=for-the-badge&logo=AmazonS3&logoColor=white) ![mysql](https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white) ![Redis](https://img.shields.io/badge/redis-DC382D?style=for-the-badge&logo=redis&logoColor=white) ![MongoDB](https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white)

<br />


#### DevOPS

![docker](https://img.shields.io/badge/docker-2496ED?style=for-the-badge&logo=docker&logoColor=white) ![Jenkins](https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=Jenkins&logoColor=white) ![nginx](https://img.shields.io/badge/nginx-009639?style=for-the-badge&logo=nginx&logoColor=white) ![amazonec2](https://img.shields.io/badge/amazonec2-FF9900?style=for-the-badge&logo=amazonec2&logoColor=white)

<br />

## 🏢 아키텍처
<img src="./documents/산뜻_아키텍처.png" style="background-color: white;">



## 📂 프로젝트 파일 구조

<details>
<summary><b>FrontEnd - Android</b></summary>

```
📦santeut
 ┣ 📂data
 ┃ ┣ 📂apiservice
 ┃ ┃ ┣ 📜AuthApiService.kt
 ┃ ┃ ┣ 📜CommonApiService.kt
 ┃ ┃ ┣ 📜GuildApiService.kt
 ┃ ┃ ┣ 📜HikingApiService.kt
 ┃ ┃ ┣ 📜MountainApiService.kt
 ┃ ┃ ┣ 📜PartyApiService.kt
 ┃ ┃ ┣ 📜PlantIdApi.kt
 ┃ ┃ ┣ 📜PostApiService.kt
 ┃ ┃ ┣ 📜UserApiService.kt
 ┃ ┃ ┗ 📜WeatherApi.kt
 ┃ ┣ 📂di
 ┃ ┃ ┣ 📜AppModule.kt
 ┃ ┃ ┣ 📜RemoteModule.kt
 ┃ ┃ ┣ 📜RepositoryModule.kt
 ┃ ┃ ┗ 📜WebSocketClient.kt
 ┃ ┣ 📂model
 ┃ ┃ ┣ 📂request
 ┃ ┃ ┃ ┣ 📜CreateCommentRequest.kt
 ┃ ┃ ┃ ┣ 📜CreatePartyRequest.kt
 ┃ ┃ ┃ ┣ 📜CreatePostRequest.kt
 ┃ ┃ ┃ ┣ 📜EndHikingRequest.kt
 ┃ ┃ ┃ ┣ 📜FCMTokenRequest.kt
 ┃ ┃ ┃ ┣ 📜GuildRequest.kt
 ┃ ┃ ┃ ┣ 📜LoginRequest.kt
 ┃ ┃ ┃ ┣ 📜PartyIdRequest.kt
 ┃ ┃ ┃ ┣ 📜PlantIdentificationRequest.kt
 ┃ ┃ ┃ ┣ 📜SignUpRequest.kt
 ┃ ┃ ┃ ┣ 📜StartHikingRequest.kt
 ┃ ┃ ┃ ┗ 📜WebSocketSendMessageRequest.kt
 ┃ ┃ ┣ 📂response
 ┃ ┃ ┃ ┣ 📜AllcourseResponse.kt
 ┃ ┃ ┃ ┣ 📜ChatResponse.kt
 ┃ ┃ ┃ ┣ 📜CommentResponse.kt
 ┃ ┃ ┃ ┣ 📜CoursePostDetailResponse.kt
 ┃ ┃ ┃ ┣ 📜GuildResponse.kt
 ┃ ┃ ┃ ┣ 📜HikingResponse.kt
 ┃ ┃ ┃ ┣ 📜LocationData.kt
 ┃ ┃ ┃ ┣ 📜LoginResponse.kt
 ┃ ┃ ┃ ┣ 📜MountainResponse.kt
 ┃ ┃ ┃ ┣ 📜MyCourseResponse.kt
 ┃ ┃ ┃ ┣ 📜MyProfileResponse.kt
 ┃ ┃ ┃ ┣ 📜PartyCourseResponse.kt
 ┃ ┃ ┃ ┣ 📜PartyResponse.kt
 ┃ ┃ ┃ ┣ 📜PostResponse.kt
 ┃ ┃ ┃ ┣ 📜ReadPostResponse.kt
 ┃ ┃ ┃ ┣ 📜UserLocationDataResponse.kt
 ┃ ┃ ┃ ┗ 📜WebSocketMessageResponse.kt
 ┃ ┃ ┣ 📜ApiResult.kt
 ┃ ┃ ┗ 📜CustomResponse.kt
 ┃ ┣ 📂repository
 ┃ ┃ ┣ 📜AuthRepository.kt
 ┃ ┃ ┣ 📜AuthRepositoryImpl.kt
 ┃ ┃ ┣ 📜CommonRepository.kt
 ┃ ┃ ┣ 📜CommonRepositoryImpl.kt
 ┃ ┃ ┣ 📜GuildRepository.kt
 ┃ ┃ ┣ 📜GuildRepositoryImpl.kt
 ┃ ┃ ┣ 📜HikingRepository.kt
 ┃ ┃ ┣ 📜HikingRepositoryImpl.kt
 ┃ ┃ ┣ 📜MountainRepository.kt
 ┃ ┃ ┣ 📜MountainRepositoryImpl.kt
 ┃ ┃ ┣ 📜PartyRepository.kt
 ┃ ┃ ┣ 📜PartyRepositoryImpl.kt
 ┃ ┃ ┣ 📜PostRepository.kt
 ┃ ┃ ┣ 📜PostRepositoryImpl.kt
 ┃ ┃ ┣ 📜UserRepository.kt
 ┃ ┃ ┗ 📜UserRepositoryImpl.kt
 ┃ ┗ 📂util
 ┃ ┃ ┣ 📜AuthInterceptor.kt
 ┃ ┃ ┣ 📜CameraX.kt
 ┃ ┃ ┣ 📜CameraXFactory.kt
 ┃ ┃ ┣ 📜CameraXImpl.kt
 ┃ ┃ ┣ 📜RecordingInfo.kt
 ┃ ┃ ┣ 📜RecordingState.kt
 ┃ ┃ ┗ 📜SharedPreferencesUtil.kt
 ┣ 📂designsystem
 ┃ ┗ 📂theme
 ┃ ┃ ┣ 📜Color.kt
 ┃ ┃ ┣ 📜Theme.kt
 ┃ ┃ ┣ 📜Type.kt
 ┃ ┃ ┗ 📜Typography.kt
 ┣ 📂domain
 ┃ ┗ 📂usecase
 ┃ ┃ ┣ 📜CommonUseCase.kt
 ┃ ┃ ┣ 📜FCMTokenUseCase.kt
 ┃ ┃ ┣ 📜GuildUseCase.kt
 ┃ ┃ ┣ 📜HikingUseCase.kt
 ┃ ┃ ┣ 📜LoginUseCase.kt
 ┃ ┃ ┣ 📜MountainUseCase.kt
 ┃ ┃ ┣ 📜PartyUseCase.kt
 ┃ ┃ ┣ 📜PostUseCase.kt
 ┃ ┃ ┣ 📜SignUpUseCase.kt
 ┃ ┃ ┗ 📜UserUseCase.kt
 ┣ 📂ui
 ┃ ┣ 📂chat
 ┃ ┃ ┣ 📜ChatListScreen.kt
 ┃ ┃ ┣ 📜ChatScreen.kt
 ┃ ┃ ┣ 📜ChatViewModel.kt
 ┃ ┃ ┗ 📜Message.kt
 ┃ ┣ 📂community
 ┃ ┃ ┣ 📂common
 ┃ ┃ ┃ ┣ 📜CommentScreen.kt
 ┃ ┃ ┃ ┗ 📜ReadPostScreen.kt
 ┃ ┃ ┣ 📂course
 ┃ ┃ ┃ ┣ 📜CreateCoursePostScreen.kt
 ┃ ┃ ┃ ┣ 📜FindHikingHistory.kt
 ┃ ┃ ┃ ┣ 📜PostCourseScreen.kt
 ┃ ┃ ┃ ┗ 📜ReadCoursePostScreen.kt
 ┃ ┃ ┣ 📂guild
 ┃ ┃ ┃ ┗ 📜JoinGuildScreen.kt
 ┃ ┃ ┣ 📂party
 ┃ ┃ ┃ ┗ 📜JoinPartyScreen.kt
 ┃ ┃ ┣ 📂tips
 ┃ ┃ ┃ ┣ 📜CreateTipPostScreen.kt
 ┃ ┃ ┃ ┗ 📜PostTipsScreen.kt
 ┃ ┃ ┣ 📜CommonViewModel.kt
 ┃ ┃ ┣ 📜CommunityScreen.kt
 ┃ ┃ ┗ 📜PostViewModel.kt
 ┃ ┣ 📂guild
 ┃ ┃ ┣ 📜CreateGuildPostScreen.kt
 ┃ ┃ ┣ 📜CreateGuildScreen.kt
 ┃ ┃ ┣ 📜GuildApplyListScreen.kt
 ┃ ┃ ┣ 📜GuildCommunityScreen.kt
 ┃ ┃ ┣ 📜GuildInfoScreen.kt
 ┃ ┃ ┣ 📜GuildMemberListScreen.kt
 ┃ ┃ ┣ 📜GuildPostDetailScreen.kt
 ┃ ┃ ┣ 📜GuildRankingScreen.kt
 ┃ ┃ ┣ 📜GuildScreen.kt
 ┃ ┃ ┣ 📜GuildViewModel.kt
 ┃ ┃ ┣ 📜MyGuildListScreen.kt
 ┃ ┃ ┣ 📜MyGuildScreen.kt
 ┃ ┃ ┗ 📜UpdateGuildScreen.kt
 ┃ ┣ 📂home
 ┃ ┃ ┣ 📜HomeScreen.kt
 ┃ ┃ ┗ 📜HomeViewModel.kt
 ┃ ┣ 📂landing
 ┃ ┃ ┣ 📜LandingScreen.kt
 ┃ ┃ ┣ 📜UserState.kt
 ┃ ┃ ┗ 📜UserViewModel.kt
 ┃ ┣ 📂login
 ┃ ┃ ┣ 📜LoginEvent.kt
 ┃ ┃ ┣ 📜LoginScreen.kt
 ┃ ┃ ┗ 📜LoginViewModel.kt
 ┃ ┣ 📂map
 ┃ ┃ ┣ 📜LocationModule.kt
 ┃ ┃ ┣ 📜MapScreen.kt
 ┃ ┃ ┣ 📜MapViewModel.kt
 ┃ ┃ ┣ 📜PlantViewModel.kt
 ┃ ┃ ┗ 📜SearchPlant.kt
 ┃ ┣ 📂mountain
 ┃ ┃ ┣ 📜MountainListScreen.kt
 ┃ ┃ ┣ 📜MountainScreen.kt
 ┃ ┃ ┗ 📜MountainViewModel.kt
 ┃ ┣ 📂mypage
 ┃ ┃ ┣ 📜MyHikingScreen.kt
 ┃ ┃ ┣ 📜MyPageScreen.kt
 ┃ ┃ ┣ 📜MyProfileScreen.kt
 ┃ ┃ ┣ 📜MyScheduleScreen.kt
 ┃ ┃ ┗ 📜UserViewModel.kt
 ┃ ┣ 📂navigation
 ┃ ┃ ┣ 📂bottom
 ┃ ┃ ┃ ┣ 📜BottomNavBar.kt
 ┃ ┃ ┃ ┣ 📜CommunityNavGraph.kt
 ┃ ┃ ┃ ┣ 📜GuildNavGraph.kt
 ┃ ┃ ┃ ┣ 📜HomeNavGraph.kt
 ┃ ┃ ┃ ┣ 📜MapNavGraph.kt
 ┃ ┃ ┃ ┣ 📜MountainNavGraph.kt
 ┃ ┃ ┃ ┗ 📜MyPageNavGraph.kt
 ┃ ┃ ┣ 📂top
 ┃ ┃ ┃ ┣ 📜TopBar.kt
 ┃ ┃ ┃ ┗ 📜TopNavGraph.kt
 ┃ ┃ ┣ 📜SanteutNavGraph.kt
 ┃ ┃ ┗ 📜UnAuthNavGraph.kt
 ┃ ┣ 📂noti
 ┃ ┃ ┗ 📜NotiScreen.kt
 ┃ ┣ 📂party
 ┃ ┃ ┣ 📜InputPartyInfoScreen.kt
 ┃ ┃ ┣ 📜MyPartyListScreen.kt
 ┃ ┃ ┣ 📜PartyViewModel.kt
 ┃ ┃ ┗ 📜SelectedMountain.kt
 ┃ ┣ 📂signup
 ┃ ┃ ┣ 📜SIgnUpEvent.kt
 ┃ ┃ ┣ 📜SignUpScreen.kt
 ┃ ┃ ┗ 📜SignUpViewModel.kt
 ┃ ┗ 📂wearable
 ┃ ┃ ┗ 📜WearableViewModel.kt
 ┣ 📜MainActivity.kt
 ┣ 📜MainApplication.kt
 ┣ 📜MyFirebaseMessagingService.kt
 ┗ 📜SanteutApp.kt
```

</details>

<details>
<summary><b>FrontEnd - Watch</b></summary>

```
📦santeut
 ┣ 📂data
 ┃ ┣ 📜ExerciseClientKtx.kt
 ┃ ┣ 📜ExerciseClientManager.kt
 ┃ ┗ 📜HealthServicesRepository.kt
 ┣ 📂design
 ┃ ┗ 📂theme
 ┃ ┃ ┗ 📜Theme.kt
 ┣ 📂di
 ┃ ┣ 📜BindService.kt
 ┃ ┣ 📜MainModule.kt
 ┃ ┗ 📜ServiceModule.kt
 ┣ 📂service
 ┃ ┣ 📜ExerciseLogger.kt
 ┃ ┣ 📜ExerciseNotificationManager.kt
 ┃ ┣ 📜ExerciseService.kt
 ┃ ┣ 📜ExerciseServiceMonitor.kt
 ┃ ┗ 📜ExerciseState.kt
 ┣ 📂ui
 ┃ ┣ 📂health
 ┃ ┃ ┣ 📜HealthScreen.kt
 ┃ ┃ ┣ 📜HealthScreenState.kt
 ┃ ┃ ┗ 📜HealthViewModel.kt
 ┃ ┣ 📂main
 ┃ ┃ ┣ 📜MainScreen.kt
 ┃ ┃ ┗ 📜MainViewModel.kt
 ┃ ┣ 📂map
 ┃ ┃ ┗ 📜MapScreen.kt
 ┃ ┣ 📜HealthDataViewModel.kt
 ┃ ┗ 📜WearableModule.kt
 ┣ 📜MainActivity.kt
 ┣ 📜MainApplication.kt
 ┗ 📜SanteutApp.kt
```

</details>

<details>
<summary><b>BackEnd</b></summary>

```

```

</details>

<br />

## 📑 프로젝트 산출물
- [아키텍처](./documents/산뜻_아키텍처.png)
- [ER Diagram](./documents/산뜻_ERD.png)
- [UCC](https://youtu.be/j2zv7wjKVw4)
- [포팅메뉴얼](./exec/)

<br />

## 👨‍👨‍👧👨‍👨‍👧 팀원
|FE/BE|BE/FE|BE|FE|BE|BE|FE|
|:---:|:---:|:---:|:---:|:---:|:---:|:---:|
|**박나린**|**김가영**|**김동우**|**김영대**|**양윤모**|**주혜련**|**최용훈**|
|<img src="./documents/member/박나린.jpg" style="height: 70px">|<img src="./documents/member/김가영.jpg" style="height: 70px">|<img src="./documents/member/김동우.jpg" style="height: 70px">|<img src="./documents/member/김영대.jpg" style="height: 70px">|<img src="./documents/member/양윤모.jpg" style="height: 70px">|<img src="./documents/member/주혜련.jpg" style="height: 70px">|<img src="./documents/member/최용훈.jpg" style="height: 70px">|
| DevOps <br/> UI/UX <br/> MSA 설계 | BackEnd | BackEnd | FrontEnd | BackEnd | BackEnd | FrontEnd |