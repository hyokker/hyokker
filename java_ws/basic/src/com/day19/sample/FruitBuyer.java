package com.day19.sample;

// 과일 구매자
public class FruitBuyer {
   private int MyMoney; // 남은 돈 10000, 5500, 3500
   private int numOfApple; // 구매한 사과 개수 3, 5
   
   public FruitBuyer(int money) {
      this.MyMoney=money;
   }
   
   // 사과를 구매하는 메서드
   // 사과를 구매하는데 있어서 필요한 것 - 구매대상, 구매금액 => 매개변수로 전달되어야 함
   // seller 아저씨, 사과 2000원어치 주세요
 /*  public void buyApple(FruitSeller seller, int money) {
	   if(MyMoney<money) {
		   System.out.println("잔액이 부족해서 구매할 수 없습니다.");
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
		   System.out.println("잔액이 부족해서 구매할 수 없습니다.");
	   return;
	   }
	   FruitResult result=seller.saleApple(money);
		  
	   numOfApple+=result.getNum(); //3, 2
	   MyMoney-=(money-result.getChange()); //4500, 2000
	   
	   }
   		
      // buyer가 참조하는 객체는 돈을 지불하고 사과를 얻게된다
      // seller가 참조하는 객체는 사과를 판매하고 수익이 생긴다
   
   
   public void showResult() {
      System.out.println("\n=======구매자 정보========");
      System.out.println("현재 잔액:"+MyMoney);
      System.out.println("사과 개수:"+numOfApple+"\n");
   }
}