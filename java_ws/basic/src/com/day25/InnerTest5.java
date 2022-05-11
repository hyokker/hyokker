package com.day25;

public class InnerTest5 {

		class instanceInner{
		}
		static class StaticInner{
			
		}
		
		static void staticMethod() {
			//static 멤버는 static만 접근 가능
			//instanceInner obj1 = new instanceInner();// error
		
			StaticInner obj2= new StaticInner(); //가능
			
		}
		void instanceMethod() {
			//인스턴스 메서드에서는 인스턴스 멤버, static 멤버 모두 접근 가능
			instanceInner obj1 = new instanceInner();//가능
			StaticInner obj2= new StaticInner(); //가능
			
			
		}

}
