package com.day18;

class Person {
	public String kind() {
		return "���";
	}
};

class Student extends Person {
	public String kind() {
		return "�л�";
	}
};

class Graduate extends Student {
	public String kind() {
		return "���п���";
	}
};

class Assistant extends Person {
	public String kind() {
		return "����";
	}
};

class Professor extends Person {
	public String kind() {
		return "����";
	}
}//

public class PolymoArgs {
	/*
	public static void register(Student st) {
		System.out.println(st.kind()+ "��/�� ����մϴ�.");
	}
	public static void register(Graduate gr) {
		System.out.println(gr.kind() + "��/�� ����մϴ�.");
	}
	public static void register(Assistant a) {
		System.out.println(a.kind() + "��/�� ����մϴ�.");
	}
	*/

		public static void register(Person p) {
			//if(p instanceof Student || p instanceof
			//		Graduate|| p instanceof Assistant) {
			if(p instanceof Student || p instanceof Assistant) {
				//�ڽ��� �θ��� �ν��Ͻ��̱⵵ �ϴ� : �ڽ� instenceof �θ�=> true
				System.out.println(p.kind()+ "��/�� ����մϴ�.");				
			}else {
			System.out.println(p.kind()+ "��/�� ����� �� �����ϴ�.");
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
