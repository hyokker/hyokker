package com.day19;

interface Tv2{
   void onTv();
}

interface Computer2{
   public void dataReceive();
}

// �������̽��� ���� ����� �����ϴ�
class IPTv2 implements Tv2, Computer2{
   public void dataReceive() {
      System.out.println("���� ������ ���� ��");
   }
   
   public void onTv() {
      System.out.println("TV���� ���");
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