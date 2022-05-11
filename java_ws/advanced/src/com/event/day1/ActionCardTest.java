package com.event.day1;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionCardTest extends Frame implements ActionListener{
	Button btFirst, btPrev, btNext, btLast;
	Panel plCard1, plCard2, plCard3, plCard4, plCard5;
	Panel plSouth, plCenter;
	CardLayout cardLayout;
	
	public ActionCardTest() {
		super("Card");
		init();
		addEvent();
	}
	
	private void init() {
		setSize(300, 300);
		cardLayout=new CardLayout();
		
		plSouth = new Panel();
		plCenter=new Panel(cardLayout);
		
		btFirst=new Button("<<");
		btPrev=new Button("<");
		btNext=new Button(">");
		btLast=new Button(">>");
		
		plSouth.add(btFirst);
		plSouth.add(btPrev);
		plSouth.add(btNext);
		plSouth.add(btLast);
		
		plCard1=new Panel();
		plCard1.setBackground(Color.green);
		plCard1.add(new Label("첫번째 페이지"));
		plCard2=new Panel();
		plCard2.setBackground(Color.orange);
		plCard2.add(new Label("두번째 페이지"));
		plCard3=new Panel();
		plCard3.setBackground(Color.cyan);
		plCard3.add(new Label("세번째 페이지"));
		plCard4=new Panel();
		plCard4.setBackground(Color.pink);
		plCard4.add(new Label("네번째 페이지"));
		plCard5=new Panel();
		plCard5.setBackground(Color.yellow);
		plCard5.add(new Label("다섯번째 페이지"));
		
		plCenter.add(plCard1, "1");
		plCenter.add(plCard2, "2");
		plCenter.add(plCard3, "3");
		plCenter.add(plCard4, "4");
		plCenter.add(plCard5, "5");
		
		add("South", plSouth);
		add("Center", plCenter);
		
		cardLayout.show(plCenter, "1");
	}

	private void addEvent() {
		btFirst.addActionListener(this);
		btPrev.addActionListener(this);
		btLast.addActionListener(this);
		btNext.addActionListener(this);		
	}

	public static void main(String[] args) {
		ActionCardTest f = new ActionCardTest();
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btFirst) {
			cardLayout.first(plCenter);
		}else if(e.getSource()==btPrev) {
			cardLayout.previous(plCenter);			
		}else if(e.getSource()==btNext) {
			cardLayout.next(plCenter);			
		}else if(e.getSource()==btLast) {
			cardLayout.last(plCenter);			
		}
	}

}
