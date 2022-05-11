package com.day13.sub;

class StaticBlock{
	static int[] arr = new int [10];//����� �ʱ�ȭ = �� ����ϴ°�
	
	//static �ʱ�ȭ ��
	static {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10+1);
		}//for
	}
	
	/*
	 static �ʱ�ȭ ��(Ŭ���� �ʱ�ȭ ��)
	 -static������ ������ �ʱ�ȭ�� ����
	 -�ش� Ŭ������ �޸𸮿� �ε��� �� �ѹ��� �����
	  (�ش� Ŭ������ �޸𸮿� �ε��� �� static�������� �޸𸮿� ���������, �ٷ� static �ʱ�ȭ ���� 
	  ����Ǽ� static�������� �ʱ�ȭ�ϰ� ��)
	  
	  static{
	  
	  }
	  
	 */
}

public class StaticBlockTest {
	public static void main(String[] args) {
		for(int i=0;i<StaticBlock.arr.length;i++) {
			System.out.println(StaticBlock.arr[i]);
		}
	}

}
