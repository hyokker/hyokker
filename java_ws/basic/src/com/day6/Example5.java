package com.day6;

public class Example5 {

	public static void main(String[] args) {
		//������ �־��� ���ڿ�(value)�� ���������� �Ǻ��ϴ� ���α׷��̴�.
		// (1)�� �˸� �� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.
		        String value = "12o34";
		        char ch = ' ';
		        boolean isNumber = true;

		        //�ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ� ���ڸ�
		        // �ϳ��� �о �˻��Ѵ�.
		        for (int i = 0; i < value.length(); i++) {

		            // (1) start
		            ch = value.charAt(i);

		            if (!('0' <= ch && ch <= '9')) {
		                isNumber = false;
		                break;
		            }
		        }
		        // (1) end

		        if (isNumber) {
		            System.out.println(value + "�� �����Դϴ�.");
		        } else {
		            System.out.println(value + "�� ���ڰ� �ƴմϴ�.");
		        }
	}

}
