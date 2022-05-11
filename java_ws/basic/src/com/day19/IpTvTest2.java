package com.day19;

interface Tv2{
   void onTv();
}

interface Computer2{
   public void dataReceive();
}

// 인터페이스는 다중 상속이 가능하다
class IPTv2 implements Tv2, Computer2{
   public void dataReceive() {
      System.out.println("영상 데이터 수신 중");
   }
   
   public void onTv() {
      System.out.println("TV영상 출력");
   }
   
   public void powerOn() {
      dataReceive();
      onTv();
   }
}

public class IpTvTest2 {
   public static void main(String[] args) {
      IPTv obj = new IPTv();
      obj.powerOn();
      
   }

}