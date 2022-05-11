package com.day24;

class Person{
	public void showInfo() {
		System.out.println("this="+this);
	}
}
public class ObjectTest1 {

	public static void main(String[] args) {
		Person p = new Person();
		Person p2 = new Person();
		
		System.out.println(p.equals(p2));
		System.out.println(p.getClass());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(Integer.toHexString(p.hashCode()));
		
		System.out.println(p.getClass().getName());
		p.showInfo();
		
		p2=p;
		if(p.equals(p2)) {
			System.out.println("p�� p2�� �ּҴ� ����");
			
		}else {
			System.out.println("p�� p2�� �ּҰ� �ٸ���");
		}
		
		/*
		 toString() �޼����� ���
		 Ŭ������@16���� �ؽ��ڵ�
		 getClass().getName() + "@" + Integer.toHexString(hashCode)
		 */
	}

}
