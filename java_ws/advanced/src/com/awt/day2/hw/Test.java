package com.awt.day2.hw;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class Test {

	public static void main(String[] args) {
		Frame f = new Frame("일기예보");
		f.setSize(270,250);
		f.setLayout(new FlowLayout());
		
		Label lb1 = new Label("이름");
		TextField tf = new TextField(5);
	
		Label lb2 = new Label("비밀번호");
		TextField tf2 = new TextField(5);
		tf2.setEchoChar('*');
		
		Label lb3 = new Label("날씨");
		CheckboxGroup group = new CheckboxGroup();
		Checkbox ck1 = new Checkbox("맑음", group, true);
		Checkbox ck2 = new Checkbox("눈", group,	false);
		Checkbox ck3 = new Checkbox("비", group, false);
		Checkbox ck4 = new Checkbox("구름", group, false);
		
		Label lb4 = new Label("지역설정");
		Checkbox ck5 = new Checkbox("서울,경기");
		Checkbox ck6 = new Checkbox("충청");
		Checkbox ck7 = new Checkbox("강원");
		
		Label lb5 = new Label("취미");
		Choice ch = new Choice();
		ch.add("축구");
		ch.add("야구");
		ch.add("여행");
		ch.add("영화관람");
		
		Label lb6 = new Label("자기소개");
		TextArea ta = new TextArea(10, 30);
		
		f.add(lb1);
		f.add(tf);
		f.add(lb2);
		f.add(tf2);
		
		f.add(lb3);
		f.add(ck1);
		f.add(ck2);
		f.add(ck3);
		f.add(ck4);
		
		f.add(lb4);
		f.add(ck5);
		f.add(ck6);
		f.add(ck7);
		
		f.add(lb5);
		f.add(ch);
		
		f.add(lb6);
		f.add(ta);
		f.setVisible(true);
	
	
	}

}
