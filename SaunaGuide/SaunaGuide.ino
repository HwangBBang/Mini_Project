#include <TimerOne.h>
#include <Servo.h>
#include <DHT.h>
#define DHTPIN 4
#define DHTTYPE DHT11
#include <hd44780.h>
#include <Wire.h>
#include <hd44780ioClass/hd44780_I2Cexp.h> 
hd44780_I2Cexp lcd;
Servo arrow;
DHT dht(DHTPIN, DHTTYPE);
float t,h;
int rLed = 13;
int gLed = 8;
int yLed = 7;
unsigned long preTime= 0;
int rledState = LOW; int gledState = LOW; int yledState = LOW;
//가변저항의 값에 따라 모드를 고르는 기능 
int modeSet=A0;
//가변저항의 값을 읽어 들여온 mode 변수 
int mode=analogRead(modeSet);

void mode1(){
  lcd.setCursor(0,1);
  lcd.print("Temp:");
  lcd.print(t);
  delay(100);
}
void mode2(){
  lcd.setCursor(0,1);
  lcd.print("Hum:");
  lcd.print(h);
  delay(100);
}
void Dht(){ //1초마다 인터럽  
  float t = dht.readTemperature();
  float h = dht.readHumidity(); }

void setup() {

  Serial.begin(9600);
  Timer1.initialize(1000000);
  Timer1.attachInterrupt(Dht);
  pinMode(yLed,OUTPUT);pinMode(gLed,OUTPUT); pinMode(rLed,OUTPUT); 
  pinMode(modeSet,INPUT); 
  arrow.attach(9);
  dht.begin();
  lcd.begin(16,2); 
}

void loop(){
    unsigned long curTime = millis();
    if(curTime- preTime >=1000){
    preTime = curTime;
    rledState = !rledState;
    digitalWrite(rLed,rledState);
}
//모드 측정
  mode=analogRead(modeSet);
  Serial.println(mode);
  if( (0<=mode) && (mode<500) ){
    lcd. clear();
  
    lcd.setCursor(0,0);
    lcd.print("Mode 1.Value:");
    lcd.print(mode);
     
    mode1();
    
    yledState = HIGH;
    gledState = LOW;
    digitalWrite(yLed,yledState);
    digitalWrite(gLed,gledState);
    arrow.write(90);
    delay(10);
}
//아닐경우, 가변 저항 값이 500<mode<1023 이면
  else{
    
      lcd. clear();
      lcd.setCursor(0,0);
      lcd.print("Mode 2.Value:");
      lcd.print(mode);
      mode2();
      yledState = LOW;
      gledState = HIGH;
      digitalWrite(yLed,yledState);
      digitalWrite(gLed,gledState);
      arrow.write(-90);
      delay(10);}
}
 
    
  }
