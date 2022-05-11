package com.jdbc.day3;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


import com.pd.model.PersonDAO;
import com.pd.model.PersonDTO;

public class PersonManager {
	private Scanner sc = new Scanner(System.in);
	private PersonDAO personDao;

	

	public PersonManager() {
		personDao = new PersonDAO();
	}



	public void register() throws SQLException {
		// 1.사용자 입력 받기
		System.out.println("이름, 전화번호 입력");
		String name = sc.nextLine();
		String tel = sc.nextLine();


		// 2.db작업

		PersonDTO dto = new PersonDTO();
		dto.setName(name);
		dto.setTel(tel);
		int cnt = personDao.insertPerson(dto);

		// 3.결과처리
		String result = (cnt > 0) ? "등록 성공" : "등록 실패";
		System.out.println(result);
		}




	public void showAll() throws SQLException {
		//db작업
		
		List<PersonDTO> list = personDao.selectAll();
		// 3.
		for (int i = 0; i < list.size(); i++) {
			PersonDTO dto = list.get(i);

			System.out.println(dto.getNo() + "\t" + dto.getName() + "\t" + dto.getTel() + "\t" + dto.getRegdate());
		} // for

		System.out.println();
	}



	public void showByNo() throws NumberFormatException, SQLException {
		//1.사용자 입력받기
		System.out.println("번호 입력");
		String no = sc.nextLine();
		
		// 유효성 검사
		if (no == null || no.isEmpty()) {
			System.out.println("번호를 입력해야 함!!");
			return;
		}
		
		//2. db작업
		PersonDTO dto = personDao.selectByNo(Integer.parseInt(no));
		
		//3. 결과처리
		System.out.println(dto.getNo()+"\t" + dto.getName() + "\t" + dto.getTel() + "\t" +dto.getRegdate());
		
	}
}
