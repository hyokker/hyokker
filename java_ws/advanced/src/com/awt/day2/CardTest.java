package com.awt.day2;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardTest {

	public static void main(String[] args) {
		Frame f = new Frame("CardLayout");
		CardLayout cardLayout=new CardLayout(10, 10);
		f.setLayout(cardLayout);
		
		Panel p1=new Panel();
		p1.setBackground(Color.green);
		p1.add(new Label("Card 1"));

		Panel p2=new Panel();
		p2.setBackground(Color.orange);
		p2.add(new Label("Card 2"));
		
		Panel p3=new Panel();
		p3.setBackground(Color.cyan);
		p3.add(new Label("Card 3"));
		
		f.add(p1, "1");
		f.add(p2, "2");
		f.add(p3, "3");
		
		class Handler extends MouseAdapter{
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getModifiers()==e.BUTTON3_MASK) {
					cardLayout.previous(f);
				}else {
					cardLayout.next(f);					
				}
			}
			
		}//내부 클래스
		
		p1.addMouseListener(new Handler());
		p2.addMouseListener(new Handler());
		p3.addMouseListener(new Handler());
		
		f.setSize(200, 200);
		f.setVisible(true);
		
		//show(Container parent, String name)
		cardLayout.show(f, "1");//Frame에 추가된 Component중 이름이 "1"인 것을 보여준다
	}
	

}
