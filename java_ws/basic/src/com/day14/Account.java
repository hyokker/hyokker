package com.day14;

public class Account {
      //��� ����
      private String accId; //���¹�ȣ
      private int balance; //�ܾ�
      //������
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

   //�޼���
   public void deposit(int money){//�Ա�
      balance += money;
   }
   public void withdraw(int money){//���
      balance -= money;
   }
   //���������� ����ϴ� �޼���
   public void display(){
      System.out.println("���¹�ȣ : " + accId);
      System.out.println("�ܾ� :" + balance);
   }
}
