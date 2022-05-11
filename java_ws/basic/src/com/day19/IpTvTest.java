package com.day19;

class Tv{
   public void onTv() {
      System.out.println("TV���� ���");
   }
}

interface Computer{
   public void dataReceive();
}

// ��Ӱ� ������ ���ÿ� �� �� �ִ�
class IPTv extends Tv implements Computer{
   public void dataReceive() {
      System.out.println("���� ������ ���� ��");
   }
   
   public void powerOn() {
      dataReceive();
      onTv();
   }
}

public class IpTvTest {
   public static void main(String[] args) {
      IPTv obj = new IPTv();
      obj.powerOn();
      
   }

}