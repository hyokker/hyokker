package com.jdbc.day3;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pd.model.MemDAO;
import com.pd.model.MemDTO;
import com.pd.model.PdDTO;

public class MemConsole {
	private static Scanner sc=new Scanner(System.in);
	private static MemDAO dao=new MemDAO();

	

	private static void showMenu() {
		System.out.println("-----------------------Main Menu----------------------");
		System.out.println("1.�Է�  2.����  3.����  4.��ȣ�� ��ȸ  5.��ü ��ȸ  6.����");
		System.out.println("---------------------------------------------------------");
		System.out.println("��ȣ�� �Է��ϼ���");
	}	
	public static void register() throws SQLException {
		System.out.println("��� id,pwd,�̸�,��ȭ��ȣ �Է�");
		String id=sc.nextLine();
		String pwd=sc.nextLine();
		String name=sc.nextLine();
		String hp=sc.nextLine();
		
		MemDTO dto = new MemDTO();
		dto.setId(id);
		dto.setPwd(pwd);
		dto.setName(name);
		dto.setHp(hp);
		
		int cnt = MemDAO.insertMem(dto);
		String result=(cnt > 0) ? "��� ����" : "��� ����";
	}
	private static void selectAll() throws SQLException {
		//1
		
		//2 db�۾�
		
		List<MemDTO> list = MemDAO.selectAll();
		// 3.��� ó��
		for (MemDTO dto : list) {
			System.out.println(dto.getNo() + "\t" + dto.getId()
				+ "\t" + dto.getPwd() + "\t" +dto.getName()
				+"\t" + dto.getHp()+ "\t" +dto.getRegdate());
		}
		System.out.println();
	}


	private static void searchByNo() throws NumberFormatException, SQLException {
		System.out.println("��ȸ�� ����� ��ȣ �Է�");
		String no = sc.nextLine();
		if(no==null||no.isEmpty()) {
			System.out.println("��ȣ�� �Է��ϼ���");
			return;
		}
		MemDTO dto = MemDAO.selectByNo(Integer.parseInt(no));
		System.out.println(dto.getNo()+"\t" + dto.getId()
		+ "\t" + dto.getPwd() + "\t" +dto.getName() + "\t"
				+ dto.getHp() + "\t" +dto.getRegdate());
	}


	private static void delete() throws SQLException {
		System.out.println("������ ����� ��ȣ�� �Է��ϼ���");
		int no = sc.nextInt();
		
		int cnt = MemDAO.deleteMem(no);
		String result=(cnt > 0) ? "���� ����" : "���� ����";
		
	}


	private static void update() throws SQLException {
		System.out.println("������ ����� ��ȣ, ���̵�, ��й�ȣ, �̸�, ��ȭ��ȣ�� �Է��ϼ���");
		String no= sc.nextLine();
		String id= sc.nextLine();
		String pwd= sc.nextLine();
		String name= sc.nextLine();
		String hp= sc.nextLine();
		
		MemDTO dto = new MemDTO();
		dto.setNo(Integer.parseInt(no));
		dto.setId(id);
		dto.setPwd(pwd);
		dto.setName(name);
		dto.setHp(hp);
		
		int cnt = MemDAO.updateMem(dto);
		String result=(cnt > 0) ? "���� ����" : "���� ����";
				
	}

	
	public static void main(String[] args){					
		while(true) {				
			showMenu();		
			String str=sc.nextLine();

			try {
				if(str==null || str.isEmpty()) throw new Exception();

				int sel=Integer.parseInt(str);

				switch(sel) {
				case 1:
					register();							
					break;
				case 2:
					update();
					break;
				case 3:
					delete();							
					break;
				case 4:
					searchByNo();
					break;
				case 5:
					selectAll();
					break;
				case 6:
					System.exit(0);
				default:
					System.out.println("�߸� �Է�");
				}
			}catch (SQLException e) {
				e.printStackTrace();				
			}catch(Exception e) {
				System.out.println("�߸� �Է�");
				continue;
			}
		}//while

	}

}


