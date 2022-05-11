package com.event.day1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonActionEvent extends Frame{
	private Button bt;
	private TextField tf;
	private Label lbResult;
	
	public ButtonActionEvent() {
		super("버튼 클릭 연습");
		this.setLayout(new FlowLayout());
		
		bt=new Button("확인");
		tf=new TextField(20);
		lbResult=new Label("여기에 결과가 출력됩니다.");
		
		this.add(tf);
		this.add(bt);
		this.add(lbResult);
		
		this.setSize(300, 200);
		this.setVisible(true);
		
		//이벤트 연결
		/*
		 이벤트 소스 - Button(bt)
		 리스너 - ActionListener
		 */
		bt.addActionListener(new EventHandler());
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		}); //익명 클래스
	}
	
	class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//이벤트 처리 코드 넣기
			String cmd=e.getActionCommand(); //이벤트소스[버튼]의 라벨(문자열)을 돌려
												//준다.
			lbResult.setText(tf.getText()+", " + cmd+"버튼 클릭됨!");
		}		
	}//내부 클래스
	
	public static void main(String[] args) {
		ButtonActionEvent f = new ButtonActionEvent();
	}

}
