package com.day7;

public class ContinueTest1 {

	public static void main(String[] args) {
		/*
		  break - �ݺ����̳� switch ���� case�� ��� �� ���
		  continue - �ݺ����� ������ �� �κ��� �����ϰ�, �ݺ����� ���η� �����Ͽ� ���� ��Ʈ�� ����
		  			- ���� �ݺ���ġ�� �̵�.
		  			- �ݺ����� �ݺ��� �ѹ� �ǳʶٰ� ���� �ݺ��� ������ �� ���
		  			- �ݺ��� �ȿ����� ��� ����
		  return	- �޼����� ������ �����ϰ� ȣ������� ������
		 */
		
		for(int i=1;i<=10;i++) {
			if(i==5) continue;
			
			System.out.println("i = "+ i);
		}
		
		System.out.println("\n=============");
		
		for(int i=1; i<=10; i++) {
			if(i==5) break;
			
			System.out.println("i =" + i );
		}
		System.out.println("\n========��ø for =======");
		
		for(int i=0; i<3 ;i++) {
			for(int j=0;j<3;j++) {
				if(j==1) break;
				System.out.println("i ="+ i + ", j ="+ j);
			}
		}
		System.out.println("\n=====================");
		
		for(int i=0; i<3 ;i++) {
			for(int j=0;j<3;j++) {
				if(j==1) continue;
				System.out.println("i ="+ i + ", j ="+ j);
			}
		}
	}		
}
