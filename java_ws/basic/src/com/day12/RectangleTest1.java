//package com.day12;
//
//import java.util.Scanner;
//
//class Rectangle{
//   double width, height;
//
//   public double findArea(){   // ���� ���ϱ�
//      return width * height;
//   }
//
//   public double findGirth(){   // �ѷ� ���ϱ�
//      return (width + height)*2;
//   }
//}
//
//public class RectangleTest1 {
//
//   public static void main(String[] args) {
//      System.out.println("�簢���� ����, ���θ� �Է��ϼ���");
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
//      System.out.println("�簢���� ���� : " + area);
//      System.out.println("�簢���� �ѷ� : " + girth);
//   }
//
//}