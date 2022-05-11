package com.day12;



/*
  ������� - private���� ����
  �޼��� - public ���� ����
  ��������� ���� �������ų� �����ϱ� ���ؼ� getter/setter ����� ���
 */
class Man{
	private int age; //20
	int height; //180
	
	public int getAge() { //�б�
		return age;
	}
	
	public void setAge(int p_age) { //����, ����
		age=p_age;
	}
}

public class ManTest {

	public static void main(String[] args) {
		Man m = new Man();
		m.height=180;
		//m.age=20; // error
		m.setAge(20); // setter �̿��ؼ� ���� ����

		System.out.println("Ű :" + m.height);
		//System.out.println("���� : " + m.age);//error
		System.out.println("���� : " + m.getAge()); //getter�� �̿��ؼ� ���� �о�´�.
	}

}
