package com.day23;

import java.util.ArrayList;



public class Buyer {
	private int myMoney;
	private int point;
	
	//������ ��ǰ�� ������ �÷��� �߰�
	private ArrayList<Product> list = new ArrayList<Product>(50);   
	
	public Buyer(int money) {
		this.myMoney=money;
	}
	
	//���� �޼���

	public void buy(Product p) {
		if(myMoney < p.getPrice()) {
			System.out.println("�ܾ��� �����Ͽ� ������ ������ �� �����ϴ�.");
			return;
		}
		
		//�ܰ�� �ٰ�, ����Ʈ�� �þ��.
		myMoney -= p.getPrice();
		point+= p.getPoint();
		//������ ��ǰ�� �÷��ǿ� ����
		list.add(p);
		
		System.out.println(p+ " ��(��) �����Ͽ����ϴ�.");
	}
	
	public void summary() {
		//������ ��ǰ��� ��ǰ ������ �հ� ���ϱ�
		int sum=0;
		String itemList="";
		
		if(list.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�");
			return;			
		}
		
		for(int i=0;i<list.size();i++) {
			Product p = list.get(i);
			sum+=p.getPrice();
			itemList+=p;
			if(i<list.size()-1) {
				itemList+=",";
			}
		}
		System.out.println("�����Ͻ� ������ �� �ݾ��� " + sum + "�Դϴ�");
		System.out.println("�����Ͻ� ��ǰ�� "+ itemList + "�Դϴ�.");
	}
	
	
	public void showInfo() {
		System.out.println("���� �ܰ� " + myMoney);
		System.out.println("���ʽ� ����Ʈ " + point+"\n");
	}
	
	public void refund(Product p) {
		//boolean remove(Object o)	
		if(list.remove(p)) {
			myMoney+=p.getPrice();
			point-=p.getPoint();
			System.out.println(p+"�� ��ǰ�ϼ̽��ϴ�.");
		}else {
			System.out.println("������ ��ǰ �� �ش� ��ǰ�� �����ϴ�");
		}
	}

}
