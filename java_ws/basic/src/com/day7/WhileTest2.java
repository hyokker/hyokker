package com.day7;

public class WhileTest2 {

	public static void main(String[] args) {
		/*
		 while(���ǽ�){
		 	��ɹ�;
		 }
		 
		 �ʱⰪ; 
		 while(���ǽ�){
		 	��ɹ�;
		 	������;
		 }
		 
		 for(�ʱⰪ;���ǽ�;������){
		 	��ɹ�;
		 }
		 */
		
		for(int i=0;i<3;i++) {
			System.out.println(i);
		}
		System.out.println("\n====while�̿�=====");
		
		int k=0;//�ʱ��
		while (k<3) {//���ǽ��� �ַ� �޼ҵ带 �̿��Ѵ�.
			System.out.println("k ="+ k);//���
			
			k++;//������
		}//while
		
		/*
		 4
		 3
		 2
		 1
		 */
		for(int i=4;i>0;i--) {
			System.out.println(i);
		}//for
		for(int i=1;i<10;i+=2) {
			System.out.println(i);
		}//for
		
		int j=4;
		while(j>0) {
			System.out.println("j = " +j);
			j--;
		}//while
		
		k=1;
		while(k<10) {
			System.out.println("k = "+ k);
			k+=2;
		}
	}

}
