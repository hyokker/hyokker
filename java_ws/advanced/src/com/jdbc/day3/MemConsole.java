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
		System.out.println("1.입력  2.수정  3.삭제  4.번호로 조회  5.전체 조회  6.종료");
		System.out.println("---------------------------------------------------------");
		System.out.println("번호를 입력하세요");
	}	
	public static void register() throws SQLException {
		System.out.println("멤버 id,pwd,이름,전화번호 입력");
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
		String result=(cnt > 0) ? "등록 성공" : "등록 실패";
	}
	private static void selectAll() throws SQLException {
		//1
		
		//2 db작업
		
		List<MemDTO> list = MemDAO.selectAll();
		// 3.결과 처리
		for (MemDTO dto : list) {
			System.out.println(dto.getNo() + "\t" + dto.getId()
				+ "\t" + dto.getPwd() + "\t" +dto.getName()
				+"\t" + dto.getHp()+ "\t" +dto.getRegdate());
		}
		System.out.println();
	}


	private static void searchByNo() throws NumberFormatException, SQLException {
		System.out.println("조회할 멤버의 번호 입력");
		String no = sc.nextLine();
		if(no==null||no.isEmpty()) {
			System.out.println("번호를 입력하세요");
			return;
		}
		MemDTO dto = MemDAO.selectByNo(Integer.parseInt(no));
		System.out.println(dto.getNo()+"\t" + dto.getId()
		+ "\t" + dto.getPwd() + "\t" +dto.getName() + "\t"
				+ dto.getHp() + "\t" +dto.getRegdate());
	}


	private static void delete() throws SQLException {
		System.out.println("삭제할 멤버의 번호를 입력하세요");
		int no = sc.nextInt();
		
		int cnt = MemDAO.deleteMem(no);
		String result=(cnt > 0) ? "삭제 성공" : "삭제 실패";
		
	}


	private static void update() throws SQLException {
		System.out.println("수정할 멤버의 번호, 아이디, 비밀번호, 이름, 전화번호를 입력하세요");
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
		String result=(cnt > 0) ? "수정 성공" : "수정 실패";
				
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
					System.out.println("잘못 입력");
				}
			}catch (SQLException e) {
				e.printStackTrace();				
			}catch(Exception e) {
				System.out.println("잘못 입력");
				continue;
			}
		}//while

	}

}


