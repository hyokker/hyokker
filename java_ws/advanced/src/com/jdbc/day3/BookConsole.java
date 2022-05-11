package com.jdbc.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pd.model.BookDAO;
import com.pd.model.BookDTO;

import java.sql.*;

	public class BookConsole {
		private static BookDAO dao = new BookDAO();
		private static Scanner sc = new Scanner(System.in);
		
		private static void showMenu() {
			System.out.println("------------------Main Menu------------------");
			System.out.println("1.�Է�  2.����  3.����  4.��ȣ�� ��ȸ  5.�������� ��ȸ  6.����");
			System.out.println("---------------------------------------------");
			System.out.println("��ȣ�� �Է��ϼ���");
		}
		
		public static void register() throws SQLException {
			System.out.println("å ����,����,���ǻ縦 �Է�!");
			String title = sc.nextLine();
			String price = sc.nextLine();
			String publisher = sc.nextLine();
			BookDTO dto = new BookDTO();
			dto.setTitle(title);
			dto.setPrice(Integer.parseInt(price));
			dto.setPublisher(publisher);
			
			int cnt = BookDAO.insertBook(dto);
			String result=(cnt > 0) ? "��� ����" : "��� ����";

		} //register
		
		public static void update() throws SQLException {
			System.out.println("������ ��ȣ, ������ ����� ���� ���ǻ� �Է�");
			String no = sc.nextLine();
			String title = sc.nextLine();
			String price = sc.nextLine();
			String publisher = sc.nextLine();
		
			BookDTO dto = new BookDTO();
			dto.setNo(Integer.parseInt(no));
			dto.setTitle(title);
			dto.setPrice(Integer.parseInt(price));
			dto.setPublisher(publisher);
			int cnt = BookDAO.updateBook(dto);
			String result=(cnt > 0) ? "���� ����" : "���� ����";
		} //update

		public static void delete() throws SQLException {
			System.out.println("������ ��ȣ �Է�");
			int no = sc.nextInt();
			sc.nextLine();
		
			int cnt = BookDAO.deleteBook(no);
			String result=(cnt > 0) ? "���� ����" : "���� ����";

		} //delete
		

		public static void searchByNo() throws SQLException {
			System.out.println("��ȸ�� ��ȣ �Է�");
			String sno = sc.nextLine();

			
			BookDTO dto = BookDAO.selectByNo(Integer.parseInt(sno));		
			System.out.println(dto.getNo()+"\t"+dto.getTitle()+"\t"
								+dto.getPrice()+"\t"+dto.getPublisher()+"\t"+dto.getJoindate());
		}


		public static void selectTitle() throws SQLException {
			System.out.println("��ȸ�� ���� �Է�");
			String title = sc.nextLine();
			List<BookDTO> list = null;
			list = BookDAO.selectByTitle(title);


			for(int i=0 ; i<list.size();i++) {
				BookDTO dto = list.get(i);
				System.out.println(dto.getNo()+"\t"+dto.getTitle()+"\t"
						+dto.getPrice()+"\t"+dto.getPublisher()+"\t"+dto.getJoindate());
			}
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
							selectTitle();
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

		}//main

	}


