package com.day25;

public class InnerTest5 {

		class instanceInner{
		}
		static class StaticInner{
			
		}
		
		static void staticMethod() {
			//static ����� static�� ���� ����
			//instanceInner obj1 = new instanceInner();// error
		
			StaticInner obj2= new StaticInner(); //����
			
		}
		void instanceMethod() {
			//�ν��Ͻ� �޼��忡���� �ν��Ͻ� ���, static ��� ��� ���� ����
			instanceInner obj1 = new instanceInner();//����
			StaticInner obj2= new StaticInner(); //����
			
			
		}

}
