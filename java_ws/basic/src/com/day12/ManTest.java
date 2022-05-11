package com.day12;



/*
  멤버변수 - private으로 선언
  메서드 - public 으로 선언
  멤버변수의 값을 가져오거나 변경하기 위해서 getter/setter 만들어 사용
 */
class Man{
	private int age; //20
	int height; //180
	
	public int getAge() { //읽기
		return age;
	}
	
	public void setAge(int p_age) { //쓰기, 저장
		age=p_age;
	}
}

public class ManTest {

	public static void main(String[] args) {
		Man m = new Man();
		m.height=180;
		//m.age=20; // error
		m.setAge(20); // setter 이용해서 값을 저장

		System.out.println("키 :" + m.height);
		//System.out.println("나이 : " + m.age);//error
		System.out.println("나이 : " + m.getAge()); //getter을 이용해서 값을 읽어온다.
	}

}
