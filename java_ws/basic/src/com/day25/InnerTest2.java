package com.day25;

//static Ŭ������ �ܺ� Ŭ������ static ����� ������ �� �ִ�.
//�ܺ�Ŭ������ ���������� final�� ���� ����(���)�� ���ٰ����ϴ�.JDK8.0���ʹ� ���������� ���ٰ���
public class InnerTest2 {
	private int outerIv=0;
	static int outerCv=0;
	
	class InstanceInner{
		int iiv=outerIv;
		int iiv2=outerCv;
	}
	
	static class StaticInner{
		//int siv=outerIv; //error :static Ŭ������ �ܺ� Ŭ������ static ����� ������ �� �ִ�.
		static int scv=outerCv;
	}
	
	public void method() {
		int lv=0;
		final int LV=0;
		
		class LocalInner{
			int liv=outerIv;
			int liv2=outerCv;
			
			int liv3=lv; //JDK8.0���ʹ� ���������� ���ٰ���
			int liv4=LV;
		}
	}
	public static void main(String[] args) {

	}

}
