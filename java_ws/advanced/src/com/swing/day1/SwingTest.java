package com.swing.day1;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SwingTest extends JFrame implements ActionListener{
	JButton bt1,bt2,bt3,bt4;
	
	public SwingTest() {
		super("Swing 예제");
		
		init();
		addEvent();
	}
	
	private void init() {
		setSize(700, 250);
		setLayout(new GridLayout(1,0));
		
		bt1=new JButton("버튼");
		
		ImageIcon icon1=new ImageIcon("img/open.jpg");
		ImageIcon icon2=new ImageIcon("img/input.jpg");
		ImageIcon icon3=new ImageIcon("img/confirm.jpg");
		
		//JButton(String text, Icon icon)
		bt2=new JButton("OPEN", icon1);
		bt3=new JButton("INPUT", icon2);
		bt4=new JButton("CONFIRM", icon3);
		
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		
		bt2.setVerticalTextPosition(JButton.BOTTOM);
		bt2.setHorizontalTextPosition(JButton.CENTER);
		
		bt3.setVerticalTextPosition(JButton.TOP);
		bt3.setHorizontalTextPosition(JButton.CENTER);
		bt3.setToolTipText("풍선 도움말");
		
		ImageIcon icon4=new ImageIcon("img/exit.jpg");
		bt4.setPressedIcon(icon4);
		bt4.setMnemonic('C'); //단축키 alt+C
		
		//각 버튼에 border주기
		bt1.setBorder(new LineBorder(Color.green, 5));
		bt2.setBorder(new TitledBorder("테두리에 제목주기"));
		bt3.setBorder(new BevelBorder(BevelBorder.RAISED)); //LOWERED
		bt4.setBorder(new EtchedBorder());
				
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기 처리
	}

	private void addEvent() {
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);		
	}

	public static void main(String[] args) {
		SwingTest f = new SwingTest();
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt1) {
			//showMessageDialog(Component parentComponent, Object message)
			JOptionPane.showMessageDialog(this, "환영합니다");
		}else if(e.getSource()==bt2) {
			JOptionPane.showMessageDialog(this, "누르지 마세요", "경고", 
					JOptionPane.WARNING_MESSAGE);
			/*
			 showMessageDialog(Component parentComponent, Object message, 
			 	String title, int messageType)
			 */
		}else if(e.getSource()==bt3) {
			//사용자가 이름을 입력하면 그 이름을 프레임 제목으로 지정
			String name=JOptionPane.showInputDialog(this, "이름을 입력하세요");
			setTitle(name);
			//showInputDialog(Component parentComponent, Object message)
		}else if(e.getSource()==bt4) {
			//showConfirmDialog(Component parentComponent, Object message, 
			//					String title, int optionType)
			int quit=JOptionPane.showConfirmDialog(this, "종료하시겠습니까?", 
					"종료", JOptionPane.YES_NO_OPTION);
			setTitle("quit="+quit); //0=>예, 1=>아니오, 2=>취소
 
			if(quit==JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
	}

}
