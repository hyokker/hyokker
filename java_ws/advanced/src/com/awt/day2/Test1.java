package com.awt.day2;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class Test1 {

   public static void main(String[] args) {
      Frame f = new Frame("회원가입");
      f.setSize(350,350);
      f.setLayout(new FlowLayout());
      Label lb1 = new Label("이름");
      Label lb2 = new Label("비밀번호",Label.RIGHT);
      TextField tfId= new TextField(10);
      TextField tfpwd= new TextField(10);
      tfpwd.setEchoChar('*');
      
      
      
      Label lb3 = new Label("직업", Label.LEFT);
      Choice ch = new Choice();
      ch.add("자영업");
      ch.add("회사원");
      ch.add("무직");
      

      Label lb4 = new Label("결혼여부",Label.RIGHT);
      CheckboxGroup cg = new CheckboxGroup();
      Checkbox cb1 = new Checkbox("미혼",cg,true);
      Checkbox cb2 = new Checkbox("기혼",cg,false);
      
 
      Label lb5 = new Label("멤버쉽 정보");
      CheckboxGroup cg2 = new CheckboxGroup();
      Checkbox t1 = new Checkbox("SKT",cg2, false);
      Checkbox t2 = new Checkbox("KT",cg2, false);
      Checkbox t3 = new Checkbox("LGU+",cg2, false);
      
      
      Label lb6 = new Label("자기 소개");
      TextArea ta = new TextArea(10,30);
      
      f.add(lb1);
      f.add(tfId);
      f.add(lb2);
      f.add(tfpwd);
      f.add(lb3);
      f.add(ch);
      f.add(lb4);
      f.add(cb1);
      f.add(cb2);
      f.add(lb5);
      f.add(t1);
      f.add(t2);
      f.add(t3);
      f.add(lb6);
      f.add(ta);
      
      
      f.setVisible(true);
      
   }

}