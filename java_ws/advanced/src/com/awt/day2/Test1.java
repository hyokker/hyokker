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
      Frame f = new Frame("ȸ������");
      f.setSize(350,350);
      f.setLayout(new FlowLayout());
      Label lb1 = new Label("�̸�");
      Label lb2 = new Label("��й�ȣ",Label.RIGHT);
      TextField tfId= new TextField(10);
      TextField tfpwd= new TextField(10);
      tfpwd.setEchoChar('*');
      
      
      
      Label lb3 = new Label("����", Label.LEFT);
      Choice ch = new Choice();
      ch.add("�ڿ���");
      ch.add("ȸ���");
      ch.add("����");
      

      Label lb4 = new Label("��ȥ����",Label.RIGHT);
      CheckboxGroup cg = new CheckboxGroup();
      Checkbox cb1 = new Checkbox("��ȥ",cg,true);
      Checkbox cb2 = new Checkbox("��ȥ",cg,false);
      
 
      Label lb5 = new Label("����� ����");
      CheckboxGroup cg2 = new CheckboxGroup();
      Checkbox t1 = new Checkbox("SKT",cg2, false);
      Checkbox t2 = new Checkbox("KT",cg2, false);
      Checkbox t3 = new Checkbox("LGU+",cg2, false);
      
      
      Label lb6 = new Label("�ڱ� �Ұ�");
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