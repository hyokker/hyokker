package com.day18;

public class ExamRobot {
	 // (1) action() �޼��带 �ۼ��Ͻÿ�.
	public static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot d = (DanceRobot)r;
			d.dance();
		}else if(r instanceof SingRobot) {
			SingRobot s = (SingRobot)r;
			s.sing();
		}else if(r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot)r;
			dr.draw();
		}
	}
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
		System.out.println("====Ȯ�� for ====");
		for(Robot r : arr) {
			action(r);
		}
		/*
		action(new DanceRobot());
		action(new SingRobot());
		action(new DrawRobot());
		*/
		} // main
}
	

	class Robot {
	}

	class DanceRobot extends Robot {
		void dance() {
			System.out.println("���� ��ϴ�.");
		}
	}

	class SingRobot extends Robot {
		void sing() {
			System.out.println("�뷡�� �մϴ�.");
		}
	}

	class DrawRobot extends Robot {
		void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
		}
	}