package com.day20.sample;

public class Buyer {
	private int myMoney;
	private int point;
	
	//������ ��ǰ�� ������ �迭 �߰�
	private final int MAX_COUNT=10;
	private Product[] pdArr = new Product[MAX_COUNT];
	private int idx;
	
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
		//������ ��ǰ�� �迭�� ����
		pdArr[idx++] = p;
		
		System.out.println(p.findInfo()+ " ��(��) �����Ͽ����ϴ�.");
	}
	
	public void summary() {
		//������ ��ǰ��� ��ǰ ������ �հ� ���ϱ�
		int sum=0;
		String itemList="";
		
		for(int i=0;i<idx;i++) {
			//Product p = pdArr[i];
			sum+=pdArr[i].getPrice();
			itemList+=pdArr[i].findInfo();
			if(i<idx-1) {
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
	
	

}
