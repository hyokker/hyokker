//package com.day12;
//
//import java.util.Scanner;
//
//class Rectangle{
//   double width, height;
//
//   public double findArea(){   // 넓이 구하기
//      return width * height;
//   }
//
//   public double findGirth(){   // 둘레 구하기
//      return (width + height)*2;
//   }
//}
//
//public class RectangleTest1 {
//
//   public static void main(String[] args) {
//      System.out.println("사각형의 가로, 세로를 입력하세요");
//      Scanner sc = new Scanner(System.in);
//      double w = sc.nextDouble();
//      double h = sc.nextDouble();
//
//      Rectangle r = new Rectangle();
//      r.width=w;
//      r.height=h;
//      
//      double area = r.findArea();
//      double girth = r.findGirth();
//      
//      System.out.println("사각형의 넓이 : " + area);
//      System.out.println("사각형의 둘레 : " + girth);
//   }
//
//}