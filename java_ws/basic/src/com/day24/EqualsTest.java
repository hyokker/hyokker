package com.day24;

class Person3{
	private long id;
	
	Person3(long id){
		this.id=id;
	}
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person3) {
			Person3 p=(Person3)obj;
			return id==p.id;
		}else {
			return false;
		}
	}
}
public class EqualsTest {

	public static void main(String[] args) {
		Person3 p1 =new Person3(9901071112222L);
		Person3 p2 =new Person3(9901071112222L);
	
	
		if(p1==p2) {
			System.out.println("p1,p2는 같은 주소");
		}else {
			System.out.println("p1,p2는 다른 주소");
		}
			
		if(p1.equals(p2)) {
			System.out.println("p1,p2는 같은 사람");
		}else {
			System.out.println("p1,p2는 다른 사람");
		}
	}

}
