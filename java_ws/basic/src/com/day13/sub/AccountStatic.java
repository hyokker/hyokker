package com.day13.sub;

class BankAccount{
	//1.�������
	//[1]�ν��Ͻ�����
	private int balance;

	//[2]static ����
	public static final double INTEREST_RATE=0.02;
	private static int totalBalance; //�� ����(��ü)�� ����


	//2.������
	public BankAccount(int balance) {
		this.balance=balance;
	}
	
	//3. getter/setter
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	
	public static int getTotalBalance() {
		return totalBalance;
	}
	
	public static void setTotalBalance(int totalBalance) {
		//static ������ this ���Ұ�
		//�׷��� Ŭ������.totalbalance ���
		BankAccount.totalBalance=totalBalance;
	
	}
	
	//4.�޼���
	public void findTotal() {
		totalBalance+=balance;
	}
	
	
}


public class AccountStatic {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount(100000);
		BankAccount acc2 = new BankAccount(100000);
	
		acc1.findTotal();
		acc2.findTotal();
		
		System.out.println("����1�� ���� : " + acc1.getBalance());
		System.out.println("����2�� ���� : " + acc2.getBalance());
		System.out.println("���� : " + BankAccount.INTEREST_RATE);
		System.out.println("�� ������ ������ �հ� : " + BankAccount.getTotalBalance());
	
	
	
	}

}
