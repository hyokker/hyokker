package com.day7;

public class ContinueTest2 {

	public static void main(String[] args) {
		/*
		 �̸� ���� �ݺ���
		 -���� �ݺ����� ��ø�Ǿ� ���� ��
		  �ݺ��� �տ� �̸�(Label)�� ���̰�,
		  break���� continue���� �̸�(Label)�� ������ �����ν� �ϳ� �̻��� �ݺ�����
		  ����ų� �ݺ��� �ǳ� �� �� �ִ�.
		 */
		//�ٱ� for ���� Loop1 �̶�� �̸��� �ٿ���
		Loop1: for(int i=2; i<=9; i++) {
			for(int j=1; j<=9 ; j++) {
				if(j==5) {
					break Loop1;
					//continue Loop1;
					//break;
					//continue;
				}
				
				System.out.println(i+"*"+j+"="+i*j);
		
			}//���� for
			
			System.out.println();
		}//�ٱ� for
		

	}

}
