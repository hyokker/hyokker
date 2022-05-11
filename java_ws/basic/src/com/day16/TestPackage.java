/*
//패키지 - 서로 관련된 클래스들끼리 그룹 단위로 묶어 놓음으로써
//      클래스를 효율적으로 관리할 수 있다
//
//클래스 - 물리적으로 하나의 클래스 파일(.class)
//패키지 - 물리적으로 하나의 디렉토리(폴더)
//
//패키지 선언
//package 패키지명;
//
//=> 주석과 공백을 제외한 첫번째 문장이어야 함
//단 한번만 선언될 수 있다
//모든 클래스는 반드시 하나의 패키지에 포함되어야 함
//- 패키지를 선언하지 않고 사용하면, 기본적으로 제공하는 '이름없는 패키지'
//에 자동으로 속하게 됨
//
//패키지는 . 을 구분자로 하여 계층구조로 구성할 수 있다
//*/
//
//package com;
//
//import com.happy.*;
//import com.herb.*;
//
//class ChildHerb extends MyHerb{
//   public void printInfo(){
//      System.out.println("MyHerb protected tel:"+tel);
//      System.out.println("MyHerb default grade:"+grade);  //
//      System.out.println("MyHerb public addr:"+addr);
//   }
//}
//
//class TestPackage {
//   public static void main(String[] args) {
//      System.out.println("TestPackage!!!");
//
//      MyTest1 t = new MyTest1();  //동일 패키지
//      t.display();
//      System.out.println("MyTest1 protected name:"+t.name);
//      System.out.println("MyTest1 default age:"+t.age);  
//      System.out.println("MyTest1 public job:"+t.job);
//
//      MyHappy h = new MyHappy();
//      h.display();
//
//      MyHerb h2 = new MyHerb(); //다른 패키지
//      h2.display();
//      //System.out.println("MyHerb protected tel:"+h2.tel);  //
//      //System.out.println("MyHerb default grade:"+h2.grade);  //
//      System.out.println("MyHerb public addr:"+h2.addr);
//
//      ChildHerb ch = new ChildHerb();
//      //System.out.println("ChildHerb,MyHerb protected tel:"+ch.tel); //
//      //System.out.println("ChildHerb,MyHerb default grade:"+ch.grade);  //
//      System.out.println("ChildHerb,MyHerb public addr:"+ch.addr);
//
//      /*
//      javac -d . MyTest1.java
//      javac -d . MyHappy.java
//      javac -d . MyHerb.java
//      javac -d . TestPackage.java
//
//      java com.TestPackage
//
//      -d 옵션 뒤에는 해당 패키지의 루트 디렉토리의 경로를 적어줌!
//      패키지의 루트 디렉토리(com의 상위 디렉토리:day16)를 
//      클래스 패스에 포함시켜야 함
//
//      //
//      javac -d c:\test MyTest1.java
//      javac -d c:\test MyHappy.java
//      javac -d c:\test MyHerb.java
//
//      set classpath=.;c:\test
//
//      javac -d c:\test TestPackage.java
//
//      java com.TestPackage
//
//      */
//   }
//}
