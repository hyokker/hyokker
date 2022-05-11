package com.day25;

class Outer{
	class InstanceInner{
		int iv =100;
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv =300;
	}
	
	void method() {
		class LocalInner{
			int iv=400; //�ܺο��� ���� �Ұ�
		}
	}
}
public class InnerTest3 {
	public static void main(String[] args) {
		//
		System.out.println(Outer.StaticInner.cv);
		
		//[1] static ����Ŭ������ �ν��Ͻ� ����
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println(si.iv); 

		//[2] �ν��Ͻ� ���� Ŭ������ �ν��Ͻ� ����
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		System.out.println(ii.iv);
		
	}

}
