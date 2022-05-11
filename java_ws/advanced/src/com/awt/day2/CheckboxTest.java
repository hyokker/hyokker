package com.awt.day2;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;

public class CheckboxTest {

	public static void main(String[] args) {
		Frame f = new Frame("Checkbox");
		f.setSize(330, 500);
		f.setLayout(new FlowLayout());
		
		Label lb1 = new Label("관심분야");
		Checkbox ch1 = new Checkbox("news", true); //선택된 상태로 생성
		Checkbox ch2 = new Checkbox("sports");
		Checkbox ch3 = new Checkbox("movies");
		Checkbox ch4 = new Checkbox("music");
		
		Label lb2 = new Label("성별");
		CheckboxGroup group = new CheckboxGroup();
		Checkbox ckGender1 = new Checkbox("남자", group, false);
		Checkbox ckGender2 = new Checkbox("여자", group, false);
		
		Label lb3 = new Label("컴퓨터 사용시간");
		CheckboxGroup group2 = new CheckboxGroup();
		Checkbox ck1 = new Checkbox("5시간 이하", group2, true);
		Checkbox ck2 = new Checkbox("10시간 이하", group2, false);
		Checkbox ck3 = new Checkbox("15시간 이상", group2, false);
		
		//
		TextArea ta = new TextArea(5, 20);
		TextArea ta2 = new TextArea("하고 싶은 말을 적으세요",4, 30);
		
		f.add(lb1);
		f.add(ch1);
		f.add(ch2);
		f.add(ch3);
		f.add(ch4);
		
		f.add(lb2);
		f.add(ckGender1);
		f.add(ckGender2);
		
		f.add(lb3);
		f.add(ck1);
		f.add(ck2);
		f.add(ck3);		
		
		f.add(ta2);
		f.add(ta);
		ta2.selectAll();
		
		f.setVisible(true);
	}

}
