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
			System.out.println("1.입력  2.수정  3.삭제  4.번호로 조회  5.제목으로 조회  6.종료");
			System.out.println("---------------------------------------------");
			System.out.println("번호를 입력하세요");
		}
		
		public static void register() throws SQLException {
			System.out.println("책 제목,가격,출판사를 입력!");
			String title = sc.nextLine();
			String price = sc.nextLine();
			String publisher = sc.nextLine();
			BookDTO dto = new BookDTO();
			dto.setTitle(title);
			dto.setPrice(Integer.parseInt(price));
			dto.setPublisher(publisher);
			
			int cnt = BookDAO.insertBook(dto);
			String result=(cnt > 0) ? "등록 성공" : "등록 실패";

		} //register
		
		public static void update() throws SQLException {
			System.out.println("수정할 번호, 변경할 제목과 가격 출판사 입력");
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
			String result=(cnt > 0) ? "수정 성공" : "수정 실패";
		} //update

		public static void delete() throws SQLException {
			System.out.println("삭제할 번호 입력");
			int no = sc.nextInt();
			sc.nextLine();
		
			int cnt = BookDAO.deleteBook(no);
			String result=(cnt > 0) ? "삭제 성공" : "삭제 실패";

		} //delete
		

		public static void searchByNo() throws SQLException {
			System.out.println("조회할 번호 입력");
			String sno = sc.nextLine();

			
			BookDTO dto = BookDAO.selectByNo(Integer.parseInt(sno));		
			System.out.println(dto.getNo()+"\t"+dto.getTitle()+"\t"
								+dto.getPrice()+"\t"+dto.getPublisher()+"\t"+dto.getJoindate());
		}


		public static void selectTitle() throws SQLException {
			System.out.println("조회할 제목 입력");
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
							System.out.println("잘못 입력");
					}
				}catch (SQLException e) {
					e.printStackTrace();				
				}catch(Exception e) {
					System.out.println("잘못 입력");
					continue;
				}
			}//while

		}//main

	}


