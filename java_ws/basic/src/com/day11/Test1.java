package com.day11;

import java.util.Scanner;

public class Test1 {

   public static void main(String[] args) {
      /*
      a=a+a*이율/100;
      a=a*(1+이율/100);
      a*=(1+이율/100);

      dArr[i] *= (1+interest/100.0);
       */

      double[] dArr = new double[5];
      Scanner sc = new Scanner(System.in);

      for (int i=0;i<dArr.length;i++ ){
         System.out.println("잔고를 입력하세요");
         dArr[i] = sc.nextDouble();
      }//for

      System.out.println("이자율을 입력하세요");
      double interest= sc.nextDouble();

      for (int i=0;i<dArr.length ;i++ ){         
         dArr[i] *= (1+interest/100.0);
         System.out.println("이자가 반영된 잔고 조회 : " 
               + Math.round(dArr[i]));
      }//for

      System.out.println();
      int[][] arr=new int[3][3];
      for(int i=0; i < arr.length;i++) {
         for(int j=0; j < arr[i].length;j++) {
            if (i==j)
               arr[i][j]=1;
         }
      }//for

      for(int i=0; i < arr.length;i++) {
         for(int j=0; j < arr[i].length;j++) {
            System.out.print(arr[i][j]+"\t");
         }
         System.out.println();
      }//for

      System.out.println();
      int[][] arr2=new int[3][3];
      for(int i=0; i < arr2.length;i++) {
         for(int j=0; j < arr2[i].length;j++) {
            //if (i==j || i+j==2)
            if (i==j || i+j==arr2.length-1)
               arr2[i][j]=1;
         }
      }//for

      for(int i=0; i < arr2.length;i++) {
         for(int j=0; j < arr2[i].length;j++) {
            System.out.print(arr2[i][j]+"\t");
         }
         System.out.println();
      }//for

      // 큰 금액의 동전을 우선적으로 거슬러 줘야 한다.
      int[] coinUnit = {500, 100, 50, 10};

      int money = 3870;
      System.out.println("\nmoney="+money+"\n");

      for(int i=0;i<coinUnit.length;i++) {
         System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]);
         money = money%coinUnit[i];
      }
      
      
   }

}