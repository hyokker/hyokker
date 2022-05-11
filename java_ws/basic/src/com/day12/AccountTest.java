package com.day12;

/*
	������(Constructor)
	-��������� �ʱ�ȭ�� �������� ���ǵǴ� �޼���
	-��ü�� ������ �� �ڵ� ȣ��Ǿ� ���� ���� ����Ǵ� �޼���
	
	�����ڰ� �Ǳ� ���� ����
	- Ŭ������ �̸��� ������ �̸��� �޼���
	- �Ű������� ���� �� ������ ��ȯ���� ���� �� ����
	
	��ü ���� ���忡 ������ ȣ���ϴ� �κ��� ������
	Ŭ������ ������ = new Ŭ������();
	
	=> new �� ������ �κ��� ������ ȣ���ϴ� �κ�
	
	�⺻ ������ - �Ű������� ������ �ʴ� ������
	- Ŭ���� ���� �����ڰ� �ϳ��� ������ �����Ϸ��� �ڵ����� �⺻�����ڸ� �߰�����
	- ������ �ٸ� �����ڰ� ������ �����Ϸ��� ���� �⺻ �����ڰ� ��������� ����!!
	
	class Account{
		//������
		 Account(){
		 
		 }
	}
 */


class Account{
	//1.�������
	String accId;	//���¹�ȣ
	String name;	//�̸�
	int balance;	//�ܾ�
	
	//2.������ - ��������ʱ�ȭ
	Account(){
		
	}
	//=> �ٸ� �����ڸ� ������� ������, �⺻�����ڰ� �ڵ����� ��������� �����Ƿ� ���� ������ ��
	
	//�Ű������� �ִ� ������
	Account(String p_accId, String p_name, int p_balance){
		accId=p_accId;
		name=p_name;
		balance=p_balance;
	}
	
	//3.�޼���
	public void deposit(int money) {	//�Ա��ϴ�
		balance += money;
	}
	
	public void withdraw(int money) { 	//����ϴ�
		balance -= money;
	}
	
	public void showInfo() {
		System.out.println("���¹�ȣ : "+ accId);
		System.out.println("�̸� : " + name);
		System.out.println("�ܾ� : " + balance+"\n");
	}
}//

//Ŭ������ �ۼ��� ����, Ŭ�����κ��� ��ü�� �����Ͽ� ���
//��ü�� ����Ѵٴ� �� - ��ü�� ������ �ִ� �Ӽ��� ����� ����Ѵٴ� ��
public class AccountTest {
	public static void main(String[] args) {		
		Account acc2 = new Account();
		
		//������� ���
		acc2.accId="100-001-2000";
		acc2.name="ȫ�浿";
		acc2.balance=100000;
		
		//�޼��� ���
		acc2.withdraw(30000); // 30000�� ���
		acc2.showInfo();
		
		//�Ű����� �ִ� �����ڸ� �̿�
		Account acc = new Account("200-001-3000","�ڱ浿", 200000);
		acc.showInfo();
	}

}
