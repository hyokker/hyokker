package com.day23;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet�� �����Ϸ��� Comparable<T> �������̽� ������ ���� ���ı����� �����ڰ� ���� �����ؾ� ��
class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return "Person[name]="+name+", age="+ age + "]";
	}

	@Override
	public int compareTo(Person p) {
		//���ı����� ���̷� ������
		if(this.age>p.age) {
			return 1; //�Ű����� p�� ���̰� �۴ٸ� ��� ��ȯ
		}else if(this.age<p.age) {
			return -1; //����
		}else {
			return 0; //0
		}
		
	}
	
}
public class ComparableTest1 {

	public static void main(String[] args) {
		TreeSet<Person> tset = new TreeSet<Person>();
		tset.add(new Person("ȫ�浿", 20));//���࿡��
		// ClassCastException: Person cannot be cast to class Comparable
		tset.add(new Person("�ڱ浿", 17));
		tset.add(new Person("��浿", 31));
		//TreeSet<E> �� Person�� �ν��Ͻ��� ����� ������ ������ ����� �ν��Ͻ����� �񱳸� ���ؼ�
		//compareTo() �޼��带 ����� ȣ���Ͽ�, �̶� ��ȯ�Ǵ� ���� ������� ������ ����
		
		Iterator<Person> iter=tset.iterator();
		while(iter.hasNext()) {
			Person p = iter.next();
			System.out.println(p);
		}
	
	}

}
