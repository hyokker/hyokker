package com.day15.sub;

/*
 �������̵�(overriding)
 -�θ� Ŭ�����κ��� ��ӹ��� �޼����� ������ �����ϴ� �� 
 -�޼��� ������
 */
class Point{
	protected int x;
	protected int y;
	
	
	public String findLocation() {
		String result="x"+x+", y="+y;
		return result;
	}
}
class Point3D extends Point{
	private int z;
	
	//�������̵� �޼���
	public String findLocation() {
		//String result="x="+x+", y="+y+", z="+z;
		//return result;
		
		String result=super.findLocation()+", z="+z; //�θ�޼��� ȣ��+�����߰�
		return result;
	}
	/*
	 �������̵� ����
	 - �޼����� ����δ� �θ��� �Ͱ� ������ ��ġ�ؾ� ��
	 (�޼����,�Ű�����,��ȯŸ���� ���ƾ���)
	 
	  
	 [1] ���� �����ڴ� �θ�޼��庸�� ���� ������ ������ �� ����
	 �θ� �޼��尡 protected���, �������̵� �޼���� protected�� public�̾�� ��
	 [2] �θ� Ŭ������ �޼��庸�� ���� ���� ���ܸ� ������ �� ����. 
	 */
}
public class PointTest {

	public static void main(String[] args) {
			Point p = new Point();
			String res=p.findLocation();
			System.out.println("2���� ��ǥ :" + res);
			
			Point3D p3= new Point3D();
			System.out.println("3���� ��ǥ :" + p3.findLocation());
			
			
	}

}
