package com.day10;

public class CmdArgs {

	public static void main(String[] args) {
		/*
		 ����� �μ�
		 
		 Ŀ�ǵ������ ���� �Է� �ޱ�
		 ���α׷��� ������ �� Ŭ�����̸� �ڿ� ���鹮�ڷ� �����Ͽ� ���� ���� ���ڿ��� ���α׷��� ���� �� �� ����
		 ��) d:>java CmdArgs hong 123
		 Ŀ�ǵ������ ���� �Էµ� �� ���ڿ��� String�迭�� ��ܼ�
		 CmdArgs Ŭ������ main�޼����� �Ű�����(args)�� ���޵�
		 main �޼��� ������ args[0], args[1]�� ���� ������� ���޹���
		 ���ڿ��� ������ �� ����
		 */
		if(args.length<2) {
			System.out.println("����� �μ��� �̸�, ���̸� �Է��ϼž� �մϴ�!!");
			return;
		}
		String name =args[0];
		int age=Integer.parseInt(args[1]);
		
		System.out.println("�̸� : "+ name);
		System.out.println("���� : "+ age);
	}

}
