package com.event.day1;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventTest1 extends Frame{

	public EventTest1() {
		super("Event test");
		
		this.setSize(300, 200);
		this.setVisible(true);
		
		//�̺�Ʈ ����
		this.addWindowListener(new EventHandler());
	}
	
	class EventHandler implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			//e.getWindow().dispose();  //�޸𸮿��� ����
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
		//Frame�� �ݱ� ��ư�� ������ �� Frame�� �������� �ϱ�
		EventTest1 f = new EventTest1();
		
	}

}
