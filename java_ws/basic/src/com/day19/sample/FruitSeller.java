package com.day19.sample;

//���� �Ǹ���
public class FruitSeller {
	private int numOfApple; // ��� ���� 30, 27
							// 20 18
	private int myMoney; // �Ǹż��� 0, 4500
						 //0, 2000
	private final int APPLE_PRICE; //��� �ϳ��� ���� 1500/ 1000
										
	
	FruitSeller(int numOfApple, int myMomey, int price){
		this.numOfApple=numOfApple;
		this.myMoney=myMomey;
		this.APPLE_PRICE=price; //final���- �����ڿ��� �� �ѹ� �ʱ�ȭ ����
		//==> �ν��Ͻ����� �ٸ� �� �Ҵ�
	
	}
	//��� �Ǹ� �޼���
	/*
	public int[] saleApple(int money) {
		int num=money/APPLE_PRICE; //3, 2
		int change=money%APPLE_PRICE; //�Ž�����
		
		numOfApple-=num; //3, 2
		myMoney+=(money-change); //4500, 2000
		
		int[] arr= new int[2];
		arr[0]=num; //�������
		arr[1]=change; //�Ž�����
		
		return arr;	//�����ڿ��� �� ��� ������ �Ž�����

		
		
	}
	*/
	public FruitResult saleApple(int money) {
		int num=money/APPLE_PRICE; //3, 2
		int change=money%APPLE_PRICE; //�Ž�����
		
		numOfApple-=num; //3, 2
		myMoney+=(money-change); //4500, 2000
		
		FruitResult result = new FruitResult(num, change);
		return result;

		
		
	}
/*
	public int saleApple(int money) {
		int num=money/APPLE_PRICE; //3, 2
		
		numOfApple-=num; //3, 2
		myMoney+=(money); //4500, 2000
		return num;	//�����ڿ��� �� ��� ������ �Ž�����
		
		
		
	}
	*/
	public void showResult() {
		System.out.println("\n=====�Ǹ��� ����=====");
		System.out.println("���� ��� : " + numOfApple);
		System.out.println("�Ǹż��� : " + myMoney+"\n");
	}

}
