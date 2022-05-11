//package com.day12;
//
//import java.util.Scanner;
//
//class Calculator{
//   public double add(double a, double b){   // µ¡¼À
//      double d = a+b;
//      return d;
//   }
//
//   public double subtract(double a, double b){   // »¬¼À
//      return a-b;
//   }
//
//   public double multiply(double a, double b){   // °ö¼À
//      return a*b;
//   }
//
//   public double divide(double a, double b){   // ³ª´°¼À
//      return a/b;
//   }
//}
//
//public class puls {
//
//   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      System.out.println("µÎ½Ç¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
//      double a = sc.nextDouble();
//      double b = sc.nextDouble();
//
//      Calculator ca = new Calculator();
//      double result = ca.add(a, b);
//      
//      System.out.println("a=" +a +",b="+ b);
//      System.out.println("a+b = "+ result);
//
//      result = ca.subtract(a, b);      
//      System.out.println("a-b = "+ result);
//      
//      result = ca.multiply(a, b);      
//      System.out.println("a*b = "+ result);
//      
//      result = ca.divide(a, b);      
//      System.out.println("a/b = "+ result);
//   }
//
//}