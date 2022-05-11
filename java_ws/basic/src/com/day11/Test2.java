package com.day11;

import java.util.Scanner;

public class Test2 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] num = new int[8];
      String str ="";

      while(true)   {
         System.out.println("복권판매점 번호(1~8)와 복권 판매량을 입력하세요.(끝낼때는 Q)");
         str = sc.nextLine();
         
         if (str.equalsIgnoreCase("Q")) break;   
         
         int gNo = Integer.parseInt(str);
         int quantity = sc.nextInt();
         sc.nextLine();
         
         num[gNo-1] += quantity;

         System.out.println("그룹번호 : " + gNo 
               + ", 판매량:" + num[gNo-1]);
      }//while
      
      //
      System.out.println("\n임의의 문자열을 입력하세요");
      str = sc.nextLine(); //ABC

      for(int i=0; i < str.length(); i++) { //3
         char ch = str.charAt(i); //A
         System.out.println("str.charAt("+i+"):"+ ch +"=>" + (int)ch);
      }
      
      //
      int[] arr = findMax();

      //출력하기
      System.out.println("\n===내림차순으로 정렬===");
      for (int i=0;i<arr.length ;i++ ){
         System.out.print(arr[i]+"\t");
      }
   }
   
   public static int[] findMax(){
      //5개 정수를 담는 배열
      int[] num = new int[5];
      Scanner sc = new Scanner(System.in);
      System.out.println("\n5개의 숫자를 입력하세요");

      for (int i=0;i<5 ;i++ ){ //5번 반복
         //사용자가 입력한 숫자 5개를 배열에 넣는다         
         num[i] = sc.nextInt();
      }

      for (int i=0;i<num.length ;i++ ){ //5번 반복
         for (int k=0;k<i ;k++ ){ //2번째 배열(num[1])의 값부터 앞의 값들과 차례로 비교
            if (num[i] > num[k]){  //더 큰 값을 앞의 배열로 이동
               //swap, 두 값을 서로 바꾼다
               int temp = num[k]; 
               num[k] = num[i];
               num[i] = temp;
            }
         }
      }//for
      
      return num; //배열을 리턴
   }

}