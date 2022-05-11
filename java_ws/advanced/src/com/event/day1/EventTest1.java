package com.event.day1;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventTest1 extends Frame{

	public EventTest1() {
		super("Event test");
		
		this.setSize(300, 200);
		this.setVisible(true);
		
		//이벤트 연결
		this.addWindowListener(new EventHandler());
	}
	
	class EventHandler implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			//e.getWindow().dispose();  //메모리에서 제거
			System.exit(0);
		}

		@Override
		public void windowClosed(WindowEvent e) {
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			
		}
		
	}//inner class
	
	public static void main(String[] args) {
		//Frame의 닫기 버튼을 눌렀을 때 Frame이 닫히도록 하기
		EventTest1 f = new EventTest1();
		
	}

}
