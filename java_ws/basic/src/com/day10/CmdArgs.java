package com.day10;

public class CmdArgs {

	public static void main(String[] args) {
		/*
		 명령줄 인수
		 
		 커맨드라인을 통해 입력 받기
		 프로그램을 실행할 때 클래스이름 뒤에 공백문자로 구분하여 여러 개의 문자열을 프로그램에 전달 할 수 있음
		 예) d:>java CmdArgs hong 123
		 커맨드라인을 통해 입력된 두 문자열은 String배열에 담겨서
		 CmdArgs 클래스의 main메서드의 매개변수(args)에 전달됨
		 main 메서드 내에서 args[0], args[1]과 같은 방식으로 전달받은
		 문자열에 접근할 수 있음
		 */
		if(args.length<2) {
			System.out.println("명령줄 인수로 이름, 나이를 입력하셔야 합니다!!");
			return;
		}
		String name =args[0];
		int age=Integer.parseInt(args[1]);
		
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
	}

}
