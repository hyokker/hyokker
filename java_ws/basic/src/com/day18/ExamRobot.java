package com.day18;

public class ExamRobot {
	 // (1) action() 메서드를 작성하시오.
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
		System.out.println("====확장 for ====");
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
			System.out.println("춤을 춥니다.");
		}
	}

	class SingRobot extends Robot {
		void sing() {
			System.out.println("노래를 합니다.");
		}
	}

	class DrawRobot extends Robot {
		void draw() {
		System.out.println("그림을 그립니다.");
		}
	}