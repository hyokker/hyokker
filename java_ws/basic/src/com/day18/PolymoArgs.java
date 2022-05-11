package com.day18;

class Person {
	public String kind() {
		return "사람";
	}
};

class Student extends Person {
	public String kind() {
		return "학생";
	}
};

class Graduate extends Student {
	public String kind() {
		return "대학원생";
	}
};

class Assistant extends Person {
	public String kind() {
		return "조교";
	}
};

class Professor extends Person {
	public String kind() {
		return "교수";
	}
}//

public class PolymoArgs {
	/*
	public static void register(Student st) {
		System.out.println(st.kind()+ "이/가 등록합니다.");
	}
	public static void register(Graduate gr) {
		System.out.println(gr.kind() + "이/가 등록합니다.");
	}
	public static void register(Assistant a) {
		System.out.println(a.kind() + "이/가 등록합니다.");
	}
	*/

		public static void register(Person p) {
			//if(p instanceof Student || p instanceof
			//		Graduate|| p instanceof Assistant) {
			if(p instanceof Student || p instanceof Assistant) {
				//자식은 부모의 인스턴스이기도 하다 : 자신 instenceof 부모=> true
				System.out.println(p.kind()+ "이/가 등록합니다.");				
			}else {
			System.out.println(p.kind()+ "이/가 등록할 수 없습니다.");
		}
		}
	
	public static void main(String[] args) {
		register(new Student());
		register(new Graduate());
		register(new Assistant());
		
		Assistant a = new Assistant();
		register(a);
		
		
		register(new Professor());
	}

}
