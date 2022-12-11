
# 한류를 소개하는 프로그램
#### 202103769 황병훈 

## 설계 
데이터 수집 -> 배열 및 파일 자료

한류 지역 , 국가 별 현황 , 한류 정보 , 한류를 대표하는 요소 ..등등

<img width="735" alt="스크린샷 2022-12-11 오후 7 34 08" src="https://user-images.githubusercontent.com/96881651/206898750-248eb003-0f6c-4734-9e62-e97cedcf4a7c.png">


#### 한류의 종류 

+ 음악 ( k- pop )
    + 구조  
        Category Interface < - Menu Class  < - pop Class <br>
    + K-pop 의 특징 
    
      + 케이팝 아이돌 음악의 특징은 단순하고 경쾌한 리듬 과 비트감, 따라 부르기 쉬운 멜로디,<br>
      신선한 노랫말 , 멋진 댄스 실력으로 선보이는 군무를 통한 시각적인 요소 <br>
      
    +  HashMap <String, Object>  
    ( value[0] : 뮤지션의 대표 3곡 , value[1] : 뮤지션의 소속사 , value[2] : You Tube 구독자 수)  
        + key : BTS, value : (Dynamite, 불타오르네, Butter) ,HYBE ,7240 
        + key : 블랙핑크, value : (마지막처럼, How You Like That, 뚜두뚜두), YG, 7050
        + key : PSY, value : (강남스타일, That That, 예술이야), P-NATION, 1770
        + key : 트와이스, value : (TT, FANCY, CHEER UP), JYP, 1510
        + key : 빅뱅, value : (Still Life, Fantastic Baby, LOSER), YG, 1490

        
    + K-pop 을 대표하는 뮤지션
      + BTS, 블랙핑크, 싸이, EXO, 트와이스, 빅뱅

    + 뮤지션 ~> 대표 곡 추천 


+ 음식 ( 한식 )

    + 구조  
        Category Interface < - Menu Class  < - dining Class
        
    +  k-dining 특징  
       곡물을 활용한 음식이 다양하다.<br>
       곡물 음식으로는 죽, 국수, 만두, 수제비, 떡, 술 등이 있다.<br>
       조리법이 매우 다양하고 향신료를 많이 사용한다.<br>
       간장, 설탕, 파, 마늘, 깨소금, 참기름, 후춧가루, 고춧가루 등을 사용한 요리가 주축을 이루고 있다. <br>
   
    +  HashMap <String, Object>  
    ( value[0] : 레스토랑 이름, value[1] : 레스토랑 주소, value[2] : 레스토랑 평균 가격 )  
        + key : 이원일, value : 이원일의 식탁, 서울시 용산구 한남동 684-35,4
        + key : 심영순, value : 일상담미, 서울시 용산구 한남동 680-1,7
        + key : 유현수, value : 두레유, 서울시 종로구 가회동 16-12,3
        + key : 강민구, value : 밍글스, 서울특별시 강남구 선릉로 757 힐탑빌딩,15
        + key : 김훈이, value : 단지, 346 W 52nd St, New York, NY 10019 미국,7
        + key : 임정식, value : 정식당, 서울시 강남구 청담동 83-24, 16

+ 게임 ( 한국에서 출시한 게임 )  

    + 구조  
        Category Interface < - Menu Class  < - game Class  
        
    + 한국서 출시한 게임의 특징  
        광대한 게임 세계관과 온라인 서비스 이다.<br>
		한국 게임의 특징은 아니지만 한국 게이머들의 특징은 전세계적으로 유명하다.<br>
		한국 게이머들은 수준 높은 실력과 집중력으로 각 분야에서 기지를 발휘 하고 있다.<br>
        
    + 한국 게임을 대표하는 게임  
        List<String> gameList  
        배틀그라운드, 메이플스토리, 로스트 아크, 피파 온라인 시리즈  
    + 장르 -> 추천 게임  
    
    
프로젝트 설명 영상 :  https://youtu.be/6_G-VJs7NK8 



