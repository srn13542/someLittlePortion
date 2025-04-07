##FarmingSpot <br /><br />

<div align="center">
  <h3>판타지 세계관 속 포션 제작을 위한, 현실의 수집 방법과는 거리가 있는 환상의 재료 수집 게임</h3>
</div><br /><br /><br />

## 🎇게임 컨셉🎇 
<br />

   판타지 세계관 속 포션 제작을 위한, 현실의 수집 방법과는 거리가 있는 재료 수집 미니 게임, ARG,수집 장르를 모토로 잡는다. 천천히 아이템을 모아가는 힐링 게임을 표방하고 있다. 단순 애플리케이션 내의 요소에만 국한되지 않고, '기기의 볼륨 크기', '화면 밝기', '현실 시간' 등 다양한 요소 역시 아이템 획득 조건에 포함되도록 구현 예정이다. 현실과 메타-현실을 오가는 힐링 수집 게임. <br /><br /><br />

## 🎇코어 메카닉🎇
<br />

   1. 현실 세상의 '12시간'은 게임 내의 하루로 구분된다. (현실의 30분=게임 내의 한 시간, 현실의 한 시간=게임 내의 두 시간)
<br />
   2. 게임 내의 시간, 05시부터 07시 59분 까지를 '새벽', 08시부터 11시 59분 까지를 '아침', 12시부터 17시 59분 까지를 '낮', 18시부터 18시 59분까지를 '황혼', 19시부터 21시 59분 까지를 저녁, 22시부터 04시 59분까지를 '밤'으로 정의한다.
       2. 1. 게임 내에 정의된 시간대에 따라, 각 아이템과 상호작용 시 얻을 수 있는 아이템이 달라진다.
<br />
   3. 본 게임은 일종의, 실화 주장형 픽션 중 Alternate Reality Game(ARG)를 표방하며 현실의 요소(시간 등,)와의 상호작용성이 높다.
       3. 1. '상호 작용 조건' 중 '기기의 볼륨 크기'가 존재한다. 볼륨을 최대로 올려두었을 때&&특정 요소를 클릭하는 경우, 볼륨이 들리지 않을 때&&특정 요소와 어떠한 방식으로 상호작용 하는 경우에만 나오는 아이템이 존재한다.
       3. 2. 특정 시간 내에 게임을 실행하면 힌트 전화가 온다. 이 시간대는 '허구 시간'으로 정의한다. (현실의 시간대와 게임 내의 가상 시간대가 겹치는 시간대를 정의한다. 정확한 시간은 하단의 표 참고. 이 때에도 역시 이 시간대에만 나오는 고유 아이템이 존재한다.)
<br />
   4. Farming Activity는 게임의 메인 뷰로, 각종 CustomView (Grass, Tree, Sky 등...) 들이 Activity가 불러질-작동 흐름 중 onResume()- 때마다 refresh된다. 타 Activity로 이동했다가 돌아왔을 때(ex-상점 페이지에서 본인 페이지로 돌아왔을 때) 등이 포함된다. 단, FarmActivity 상단의 '프로필 수정 버튼'(id: profilePicBtn), 도구 인벤토리 등을 클릭하였을 때에는 바뀌지 않는다.
 <br />
   5. 요소 파밍 시, '모든 조건이 충족'한다면 확률 계산을 진행한다. 모든 요소의 획득 확률은 기본적으로 50%이다, 획득한 아이템을 판 골드로 도구를 업그레이드 하고, 레벨을 올리는 것으로 획득 확률을 높이거나 줄일 수 있다.
       5. 1. '특정 시간대'에만 획득 확률을 증가시키는 것도 가능하다.
<br />
   6. 얻은 아이템은 판매할 수 있다. 각 아이템의 도매가/소매가는 사전에 지정되어 있으며, 아이템으로 늘리거나 줄일 수 있다.
<br />
   7. 판매한 아이템으로 '아이템 획득 확률', '판매 후 골드 증감 여부/확률', '힌트 전화 확률' 등을 상승시키는 스킬을 레벨업 할 수 있다.
       7. 1. 레벨업 시 소모하는 골드의 양은 지정해 둘 예정.
<br /><br />
<image src ="https://github.com/user-attachments/assets/e0da0d90-95ce-4c75-b37b-12bbf7b65f79">
▲특별 시간대 참고   <br /><br /><br />

## 🎇개발 범위🎇 <br /><br />

![쿨그레이 깔끔한 사업계획서 프레젠테이션](https://github.com/user-attachments/assets/71d3f645-6598-4b20-8405-fb56875501a8)  <br /><br />

  1. 많은 기능 중 일부만 구현 예정, 후일 개발하고 싶던 아이디어에 대해 프로토 타입을 만드는 느낌을 생각 중이므로, '아이템 획득' 요소와 '도구에 의한 확률 업' 부분 구현에 신경쓰지 싶다.
<br />
  2.  소스는 최대한 저작권 무료 이미지를 이용하되, AI는 사용하지 않는 방향으로 진행 예정이다. (본인의 개발 능력 향상 및 연습을 위함)
< br />
  3.  유동적으로 양이 늘어갈 수 있는 '발견할 수 있는 아이템 종류', '도구', '프로필 이미지' 등은 최대 30개로 제한할 예정이다. function 개발에 초점을 맞추되 최대한 다양한 interactive 방식을 사용하도록 구현하고 싶다. (<a href = "https://source.android.com/docs/core/interaction?hl=ko">android developers</a> 참고하여 진행 예정)
 <br /><br /><br />



## 🎇예상 게임 실행 흐름🎇 <br /><br />

  



## 🎇개발 일정🎇 <br /><br />

 
