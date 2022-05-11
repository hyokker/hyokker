package com.day23;

public class BuyerMain {

	public static void main(String[] args) {
		Buyer b = new Buyer(1000);
		
		//100������ TV ����
		Product tv= new TV(100);
		b.buy(tv);
		
		//200������ Computer ����
		b.buy(new Computer(200));
	
		//summary ȣ��
		b.summary();
		
		//������ TV��ǰ
		b.refund(tv);
		
		//summary ȣ��
		b.summary();
	
	}

}
