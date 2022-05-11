package com.day19.sample;

// ���� ������
public class FruitBuyer {
   private int MyMoney; // ���� �� 10000, 5500, 3500
   private int numOfApple; // ������ ��� ���� 3, 5
   
   public FruitBuyer(int money) {
      this.MyMoney=money;
   }
   
   // ����� �����ϴ� �޼���
   // ����� �����ϴµ� �־ �ʿ��� �� - ���Ŵ��, ���űݾ� => �Ű������� ���޵Ǿ�� ��
   // seller ������, ��� 2000����ġ �ּ���
 /*  public void buyApple(FruitSeller seller, int money) {
	   if(MyMoney<money) {
		   System.out.println("�ܾ��� �����ؼ� ������ �� �����ϴ�.");
	   return;
	   }
		   int[] arr=seller.saleApple(money);
		   int num=arr[0];
		   int change=arr[1];
		   numOfApple+=num; //3, 2
		   MyMoney-=(money-change); //4500, 2000
		   
	   } */
   public void buyApple(FruitSeller seller, int money) {
	   if(MyMoney<money) {
		   System.out.println("�ܾ��� �����ؼ� ������ �� �����ϴ�.");
	   return;
	   }
	   FruitResult result=seller.saleApple(money);
		  
	   numOfApple+=result.getNum(); //3, 2
	   MyMoney-=(money-result.getChange()); //4500, 2000
	   
	   }
   		
      // buyer�� �����ϴ� ��ü�� ���� �����ϰ� ����� ��Եȴ�
      // seller�� �����ϴ� ��ü�� ����� �Ǹ��ϰ� ������ �����
   
   
   public void showResult() {
      System.out.println("\n=======������ ����========");
      System.out.println("���� �ܾ�:"+MyMoney);
      System.out.println("��� ����:"+numOfApple+"\n");
   }
}