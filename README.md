## FarmingSpot <br />

<div align="center">
  <br />
  <h3>판타지 세계관 속 포션 제작을 위한, 가상의 재료 수집 게임</h3>
</div><br /><br /><br />

## 🎇게임 컨셉🎇 
<br />

   현실의 수집 방법과는 거리가 먼, 다양하고 특이한 포션의 재료를 '작은 세계'에서 수집하는 미니 게임, ARG,수집 장르.
 단순 애플리케이션 내의 요소에만 국한되지 않고, '기기의 볼륨 크기', '화면 밝기', '현실 시간' 등 다양한 요소 역시 아이템 획득 조건에 포함되도록 구현 예정이다. 현실과 메타-현실을 오가는 힐링 수집 게임. <br /><br /><br />

   ![image](https://github.com/user-attachments/assets/48edfa0e-4d85-4f68-ae86-a7298080f29f)
   <br /> ▲베이스 컬러, 디폴트 색감

## 🎇코어 메카닉🎇
<br />

   - 현실 세상의 '12시간'은 게임 내의 하루로 구분된다. (현실의 30분=게임 내의 한 시간, 현실의 한 시간=게임 내의 두 시간)

   -  게임 내의 시간, 05시부터 07시 59분 까지를 '새벽', 08시부터 11시 59분 까지를 '아침', 12시부터 17시 59분 까지를 '낮', 18시부터 18시 59분까지를 '황혼', 19시부터 21시 59분 까지를 저녁, 22시부터 04시 59분까지를 '밤'으로 정의한다.
       - 게임 내에 정의된 시간대에 따라, 각 아이템과 상호작용 시 얻을 수 있는 아이템이 달라진다.
        
   - 본 게임은 일종의, 실화 주장형 픽션 중 Alternate Reality Game(ARG)를 표방하며 현실의 요소(시간 등,)와의 상호작용성이 높다.
       - '상호 작용 조건' 중 '기기의 볼륨 크기'가 존재한다. 볼륨을 최대로 올려두었을 때&&특정 요소를 클릭하는 경우, 볼륨이 들리지 않을 때&&특정 요소와 어떠한 방식으로 상호작용 하는 경우에만 나오는 아이템이 존재한다.
       - 특정 시간 내에 게임을 실행하면 힌트 전화가 온다. 이 시간대는 '허구 시간'으로 정의한다. (현실의 시간대와 게임 내의 가상 시간대가 겹치는 시간대를 정의한다. 정확한 시간은 하단의 표 참고. 이 때에도 역시 이 시간대에만 나오는 고유 아이템이 존재한다.)
        
   - Farming Activity는 게임의 메인 뷰로, 각종 CustomView (Grass, Tree, Sky 등...) 들이 Activity가 불러질-작동 흐름 중 onResume()- 때마다 refresh된다. 타 Activity로 이동했다가 돌아왔을 때(ex-상점 페이지에서 본인 페이지로 돌아왔을 때) 등이 포함된다. 단, FarmActivity 상단의 '프로필 수정 버튼'(id: profilePicBtn), 도구 인벤토리 등을 클릭하였을 때에는 바뀌지 않는다.

   - 요소 파밍 시, '모든 조건이 충족'한다면 확률 계산을 진행한다. 모든 요소의 획득 확률은 기본적으로 50%이다, 획득한 아이템을 판 골드로 도구를 업그레이드 하고, 레벨을 올리는 것으로 획득 확률을 높이거나 줄일 수 있다.
       - '특정 시간대'에만 획득 확률을 증가시키는 것도 가능하다.

   - 얻은 아이템은 판매할 수 있다. 각 아이템의 도매가/소매가는 사전에 지정되어 있으며, 아이템으로 늘리거나 줄일 수 있다.

   - 판매한 아이템으로 '아이템 획득 확률', '판매 후 골드 증감 여부/확률', '힌트 전화 확률' 등을 상승시키는 스킬을 레벨업 할 수 있다.
       - 레벨업 시 소모하는 골드의 양은 지정해 둘 예정.
<br /><br />
<image src ="https://github.com/user-attachments/assets/e0da0d90-95ce-4c75-b37b-12bbf7b65f79">
▲특별 시간대 참고   <br /><br /><br />

## 🎇개발 범위🎇 <br /><br />

![쿨그레이 깔끔한 사업계획서 프레젠테이션](https://github.com/user-attachments/assets/71d3f645-6598-4b20-8405-fb56875501a8)  <br /><br />

  - '아이템 획득' 요소와 '도구에 의한 확률 업' 부분 구현에 신경쓸 예정.
  - 소스는 최대한 저작권 무료 이미지를 이용하되, AI는 사용하지 않는 방향으로 진행 예정이다. (본인의 개발 능력 향상 및 연습을 위함)
  - 유동적으로 양이 늘어갈 수 있는 '발견할 수 있는 아이템 종류', '도구', '프로필 이미지' 등은 최대 30개로 제한할 예정이다. function 개발에 초점을 맞추되 최대한 다양한 interactive 방식을 사용하도록 구현하고 싶다. (<a href = "https://source.android.com/docs/core/interaction?hl=ko">android developers</a> 참고하여 진행 예정)
 <br /><br /><br />



## 🎇예상 게임 실행 흐름🎇 <br /><br />

| 화면 | 설명 |
| ---- | ---- |
|![image](https://github.com/user-attachments/assets/12ab3ac1-3024-436f-b0de-32fa855c63d3)|Farming View에 대한 예시, 개발 중으로 화면은 추후 달라질 수 있음|

<br /><br />

| 화면 예시 | 설명 |
| -------- | ----- |
|![image](https://github.com/user-attachments/assets/6ee4d561-ce85-48e8-b6b8-469dd2edd28c)|- 본 화면은 기본적으로 ‘세로 사양’만을 지원하며, 화면의 최상단 1/7은 유저의 정보 중 프로필(1-1, ProfilePicView), 재화(골드, 보석 등... StatView)이 위치하도록 할 예정이다. 1-1은 가로의 1/3을, 재화 부분은 2/3을 차지한다. <br /><br /> - ProfilePicView 클릭 시 UID, 닉네임, 수집품 등 소소한 정보를 볼 수 있도록 구현할 예정이다. 별다른 애니메이션은 따로 없으나 클릭 시 (위 설명이 담긴) 타 Activity로 이동한다는 특징이 있다. <br /><br /> - StatView는 유저가 모은 재화를 보인다. 이 때, 1.2.1.1은 재화의 아이콘(상호작용 불가), 1.2.1.2는 유저의 재화 수준을 반영하여 보여주는 Custom TextView이다. <br /> <br />- BottomNavigationBarView:: 본 게임에서 타 페이지로 옮겨가도록 지원하는 내비게이션 바이다. 2.1은 Bool을 두어 값에 따라 다른 동작을 하도록 구현할 예정이며, 가로의 3/7을 차지한다. (중앙에 위치) 2.2 버튼은 네 개로 각각 가로 1/7정도의 자리를 차지한다. (가로가 짧은 직사각형 식) 구체화에 따라 내용이 달라지겠지만 각 버튼 클릭 시 타 Activity로 이동하도록 구현한다. <br /><br />- GatheringActivity:: 미니게임이 가능하도록 하는 Activity, 구체화에 따라 내용이 달라질 성 싶다. 일단은 비워둘 예정이다. 리얼 타임으로 3.2의 배경이 변화하며, 날씨에 따라 3.3과 3.1 (지상)의 형태와 나오는 것의 종류가 달라지도록 구현하고 싶다.|

  - 게임 실행 시 미니 게임이 가능한 'Farming Activity'가 제일 먼저 뜰 예정이다. onResume()타이밍에 CustomView 등의 위치, 등장 여부를 랜덤으로 결정하며, 이는 다시 onResume()이 될 때까지 바뀌지 않는다.
  - bottomNavigationBar를 이용해 다른 액티비티로 이동할 수 있다. 설정을 바꾸거나, 도구/아이템을 사거나 판매할 수 있다.
  - userActivity(Fragment)에서는 획득한 아이템을 확인할 수 있다. 각 아이템 클릭 시 아이템의 설명을 담은 모달이 출력된다.
  - 각 요소와 상호작용하여 아이템을 획득하면, 그것을 Store Activity에서 판매하거나 새 아이템을 구매한다.

  - 게임 레이아웃의 레퍼런스는 포켓몬 슬립에서 따왔다

| 화면 예시 | 설명 |
| -------- | ----- |
|![image](https://github.com/user-attachments/assets/ef61b974-e80a-421b-82d1-1f8363fd3f72)| '포켓몬 슬립'의 기본 화면, '포켓몬'들이 화면의, 제한된 화면 내의 랜덤한 곳에 생성된다.|
|![image](https://github.com/user-attachments/assets/67b1f92e-086d-4ae8-bd4f-b12e430a0b89)| 시간, 타이밍, 이벤트 여부에 따라 배경이나 브금이 바뀌는 모습도 보인다.|
|![image](https://github.com/user-attachments/assets/b825f458-f275-4df0-85b8-f09353a3aa3e)| 특정 버튼 클릭 시 소유한 포켓몬을 볼 수 있다. User Activity에서 아이템을 보일 때 이 화면을 레퍼런스로 삼을 예정이다.|




<br /><br /><br />
## 🎇개발 일정🎇 <br /><br />

 ![쿨그레이 깔끔한 사업계획서 프레젠테이션 (1)](https://github.com/user-attachments/assets/61711999-83bc-4bdc-8680-6d14d2ccd5ad)

  - 방법 자체는 애자일하게 진행 예정, 단 레벨 테이블/아이템 테이블 등은 첫 두 주차에 끝내둘 예정. 1주차와 2주차에는 뼈대 구현에 신경씀.
  - 3주차 부터는 function 구현에 신경 쓸 예정, real time/game 내 time에 따라 배경이 바뀌도록 구현, custom View는 3주차까지는 나타나지 않도록 할 예정. 3주차 시작 후 '랜덤한 범위 내에 customView가 등장하도록' 구현하고 기타 modal과 dialog를 구현할 예정
  - 아이템을 획득할 수 있도록 구현 (아이템 source 자체는 첫 세 주 내에 구현 완료 예정), 4~5주차에 확률에 따라 아이템을 획득할 수 있을지, 없을지가 달라지도록 구현)
  - onStart()시 도구 리스트를 받아와, 버튼 클릭 시 출력되도록 개발 예정. 요소에 따라 확률 보정이 생김.
  - 6주차에는 골드를 이용하여 아이템을 사고 파는 기능 구현에 신경쓸 예정
  - 7주차에, 개발 실력 부족으로 미처 개발하지 못한 것을 개발하고 테스트하는 시간 가질 예정



<div align="center"> <br />
  05월 12일 기준 진척 보고
</div> <br /><br />

##진척 보고

  | 당초 계획 | 진척 |
  | --------  | ---- |
  | ![쿨그레이 깔끔한 사업계획서 프레젠테이션](https://github.com/user-attachments/assets/b355ded6-11fa-4db4-a604-37b6a2e560c3) | ![쿨그레이 깔끔한 사업계획서 프레젠테이션 (2)](https://github.com/user-attachments/assets/4fc6a0e7-5b9c-4946-8b3e-f4d82d1e551d) |
  | ![쿨그레이 깔끔한 사업계획서 프레젠테이션 (1)](https://github.com/user-attachments/assets/9b37a898-a5f4-4f8d-9d10-daa7f62898ad) |  ![쿨그레이 깔끔한 사업계획서 프레젠테이션 (3)](https://github.com/user-attachments/assets/103f3635-eab3-4a04-b6f4-05477b15e7d6) | 

## ~~방탕한~~ 그래프
![image](https://github.com/user-attachments/assets/a9abcf8e-6038-49ea-a25e-db2c42940f4b)
>4월 첫째주 이후 예상 개발 진척을 따르지 못한 모습을 보임
  >> 이유는 다음과 같음::
>  > 졸업 발표와 시험 공부를 한다고 본 과목을 게을리함
>  > 리소스 제작과 게임 내 조건 구성에 시간을 쏟음 (둘 모두 commit으로 나타나지 않는 것임)
![image](https://github.com/user-attachments/assets/089136f7-8151-4cc9-a20d-d40a5ee5e789)

## 진행 상황 및 향후 방향
![쿨그레이 깔끔한 사업계획서 프레젠테이션 (4)](https://github.com/user-attachments/assets/e7da6a50-edc3-4064-8691-8cf0766b4d73)

##현재 구현 요소

|화면 |
|----|
|![image](https://github.com/user-attachments/assets/0f15cf38-784b-4c1a-8b32-d76d05113ba9)|
|![image](https://github.com/user-attachments/assets/1311259a-cb6c-439d-b356-cfde58f68c89)|
|![image](https://github.com/user-attachments/assets/71e69e3b-1e0d-436a-aef8-45c42087dad6)|

|클래스|
|-----|
|![image](https://github.com/user-attachments/assets/71f9433a-bb89-4c09-b1ff-b99a59af8652)|
|![image](https://github.com/user-attachments/assets/5f92eecf-f7c0-4477-99e3-09805cf80038) |


