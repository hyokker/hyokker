/*
//��Ű�� - ���� ���õ� Ŭ�����鳢�� �׷� ������ ���� �������ν�
//      Ŭ������ ȿ�������� ������ �� �ִ�
//
//Ŭ���� - ���������� �ϳ��� Ŭ���� ����(.class)
//��Ű�� - ���������� �ϳ��� ���丮(����)
//
//��Ű�� ����
//package ��Ű����;
//
//=> �ּ��� ������ ������ ù��° �����̾�� ��
//�� �ѹ��� ����� �� �ִ�
//��� Ŭ������ �ݵ�� �ϳ��� ��Ű���� ���ԵǾ�� ��
//- ��Ű���� �������� �ʰ� ����ϸ�, �⺻������ �����ϴ� '�̸����� ��Ű��'
//�� �ڵ����� ���ϰ� ��
//
//��Ű���� . �� �����ڷ� �Ͽ� ���������� ������ �� �ִ�
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
//      MyTest1 t = new MyTest1();  //���� ��Ű��
//      t.display();
//      System.out.println("MyTest1 protected name:"+t.name);
//      System.out.println("MyTest1 default age:"+t.age);  
//      System.out.println("MyTest1 public job:"+t.job);
//
//      MyHappy h = new MyHappy();
//      h.display();
//
//      MyHerb h2 = new MyHerb(); //�ٸ� ��Ű��
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
//      -d �ɼ� �ڿ��� �ش� ��Ű���� ��Ʈ ���丮�� ��θ� ������!
//      ��Ű���� ��Ʈ ���丮(com�� ���� ���丮:day16)�� 
//      Ŭ���� �н��� ���Խ��Ѿ� ��
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
