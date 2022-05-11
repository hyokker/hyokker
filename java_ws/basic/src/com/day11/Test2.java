package com.day11;

import java.util.Scanner;

public class Test2 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] num = new int[8];
      String str ="";

      while(true)   {
         System.out.println("�����Ǹ��� ��ȣ(1~8)�� ���� �Ǹŷ��� �Է��ϼ���.(�������� Q)");
         str = sc.nextLine();
         
         if (str.equalsIgnoreCase("Q")) break;   
         
         int gNo = Integer.parseInt(str);
         int quantity = sc.nextInt();
         sc.nextLine();
         
         num[gNo-1] += quantity;

         System.out.println("�׷��ȣ : " + gNo 
               + ", �Ǹŷ�:" + num[gNo-1]);
      }//while
      
      //
      System.out.println("\n������ ���ڿ��� �Է��ϼ���");
      str = sc.nextLine(); //ABC

      for(int i=0; i < str.length(); i++) { //3
         char ch = str.charAt(i); //A
         System.out.println("str.charAt("+i+"):"+ ch +"=>" + (int)ch);
      }
      
      //
      int[] arr = findMax();

      //����ϱ�
      System.out.println("\n===������������ ����===");
      for (int i=0;i<arr.length ;i++ ){
         System.out.print(arr[i]+"\t");
      }
   }
   
   public static int[] findMax(){
      //5�� ������ ��� �迭
      int[] num = new int[5];
      Scanner sc = new Scanner(System.in);
      System.out.println("\n5���� ���ڸ� �Է��ϼ���");

      for (int i=0;i<5 ;i++ ){ //5�� �ݺ�
         //����ڰ� �Է��� ���� 5���� �迭�� �ִ´�         
         num[i] = sc.nextInt();
      }

      for (int i=0;i<num.length ;i++ ){ //5�� �ݺ�
         for (int k=0;k<i ;k++ ){ //2��° �迭(num[1])�� ������ ���� ����� ���ʷ� ��
            if (num[i] > num[k]){  //�� ū ���� ���� �迭�� �̵�
               //swap, �� ���� ���� �ٲ۴�
               int temp = num[k]; 
               num[k] = num[i];
               num[i] = temp;
            }
         }
      }//for
      
      return num; //�迭�� ����
   }

}