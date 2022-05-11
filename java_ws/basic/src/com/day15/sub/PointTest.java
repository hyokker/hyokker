package com.day15.sub;

/*
 오버라이딩(overriding)
 -부모 클래스로부터 상속받은 메서드의 내용을 변경하는 것 
 -메서드 재정의
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
	
	//오버라이딩 메서드
	public String findLocation() {
		//String result="x="+x+", y="+y+", z="+z;
		//return result;
		
		String result=super.findLocation()+", z="+z; //부모메서드 호출+내용추가
		return result;
	}
	/*
	 오버라이딩 조건
	 - 메서드의 선언부는 부모의 것과 완전히 일치해야 함
	 (메서드명,매개변수,반환타입이 같아야함)
	 
	  
	 [1] 접근 제한자는 부모메서드보다 좁은 범위로 변경할 수 없다
	 부모 메서드가 protected라면, 오버라이딩 메서드는 protected나 public이어야 함
	 [2] 부모 클래스의 메서드보다 많은 수의 예외를 선언할 수 없다. 
	 */
}
public class PointTest {

	public static void main(String[] args) {
			Point p = new Point();
			String res=p.findLocation();
			System.out.println("2차원 좌표 :" + res);
			
			Point3D p3= new Point3D();
			System.out.println("3차원 좌표 :" + p3.findLocation());
			
			
	}

}
