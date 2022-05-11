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
			int iv=400; //외부에서 접근 불가
		}
	}
}
public class InnerTest3 {
	public static void main(String[] args) {
		//
		System.out.println(Outer.StaticInner.cv);
		
		//[1] static 내부클래스의 인스턴스 생성
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println(si.iv); 

		//[2] 인스턴스 내부 클래스의 인스턴스 생성
		Outer oc = new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		System.out.println(ii.iv);
		
	}

}
