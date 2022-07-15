## Arduino_MiniProject
---
# <가변저항을 이용한 기온 OR 습도 출력기 : 사우나 안내기 >  
가변저항 을 통해 모드1,2 을 결정할 수 있습니다.  
가변저항이 0부터499 일때,모드 1 501부터1023 일때 모드 2입니다.   (모드1:초록색LED/ 모드2:노란색LED)  
세 가지 방법으로 모드를 확인 할 수 있습니다.   
LCD ,LED ,서보모터 로확인 할 수 있습니다    
붉은색 LED는 1초마다 깜빡거리게 하였습니다. 이는 하드웨어가 잘 작동하고 있다는 것을 알리기 위함입니다.  
내부인터럽트를 이용하여 dht 의 값을 읽어오도록 하였습니다.  
사용소자:(I2CLCD,서보모터,DHT11,가변저항, LED3개, 220옴저항3개,10k옴저항1개,점 퍼선 ) 


#### I2C LCD  
GND - (-)  
VCC - (+)  
SDA - A4  
SCL – A5  
#### Servo  
GND – (-)  
VCC – (+)  
PWM-digital 9  
#### DHT11  
PIN1 - (+)  
PIN2 -digital 4 – 10k - (+)  
PIN4 - (-)  

#### 가변 저항
//0부터500 까지 기온 출력 (GLed ON YLed OFF)   
//500부터1023 까지 습도 출력 (GLed OFF YLed ON)  
PIN1- (-)   
PIN2- (A0)   
PIN3- (+)  


#### RLed
220저항 연결, (-), digital13    //프로그램이 진행을 알리는 LED , Mode 와 상관없이 1초 마다 ON, OFF     
#### Gled
220저항 연결 , (-), digital7    //Mode1 임을 나타내는 LED  
#### Yled
220저항 연결, (-), degital8     //Mode2 임을 나타내는 LED  
[YouTube: ArduinoSideProject](https://youtu.be/algwWWbDdPs)
---
