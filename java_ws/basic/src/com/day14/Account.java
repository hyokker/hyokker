package com.day14;

public class Account {
      //멤버 변수
      private String accId; //계좌번호
      private int balance; //잔액
      //생성자
      public Account(String accId, int balance){
         this.accId=accId;
         this.balance=balance;
      }
      //getter/setter
      public String getAccId(){
         return accId;
      }
      public void setAccId(String accId){
         this.accId=accId;
      }
      public int getBalance(){
         return balance;
      }
      public void setBalance(int balance){
         this.balance=balance;
      }

   //메서드
   public void deposit(int money){//입금
      balance += money;
   }
   public void withdraw(int money){//출금
      balance -= money;
   }
   //계좌정보를 출력하는 메서드
   public void display(){
      System.out.println("계좌번호 : " + accId);
      System.out.println("잔액 :" + balance);
   }
}
