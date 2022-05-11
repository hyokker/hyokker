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
		// 1.����� �Է� �ޱ�
		System.out.println("�̸�, ��ȭ��ȣ �Է�");
		String name = sc.nextLine();
		String tel = sc.nextLine();


		// 2.db�۾�

		PersonDTO dto = new PersonDTO();
		dto.setName(name);
		dto.setTel(tel);
		int cnt = personDao.insertPerson(dto);

		// 3.���ó��
		String result = (cnt > 0) ? "��� ����" : "��� ����";
		System.out.println(result);
		}




	public void showAll() throws SQLException {
		//db�۾�
		
		List<PersonDTO> list = personDao.selectAll();
		// 3.
		for (int i = 0; i < list.size(); i++) {
			PersonDTO dto = list.get(i);

			System.out.println(dto.getNo() + "\t" + dto.getName() + "\t" + dto.getTel() + "\t" + dto.getRegdate());
		} // for

		System.out.println();
	}



	public void showByNo() throws NumberFormatException, SQLException {
		//1.����� �Է¹ޱ�
		System.out.println("��ȣ �Է�");
		String no = sc.nextLine();
		
		// ��ȿ�� �˻�
		if (no == null || no.isEmpty()) {
			System.out.println("��ȣ�� �Է��ؾ� ��!!");
			return;
		}
		
		//2. db�۾�
		PersonDTO dto = personDao.selectByNo(Integer.parseInt(no));
		
		//3. ���ó��
		System.out.println(dto.getNo()+"\t" + dto.getName() + "\t" + dto.getTel() + "\t" +dto.getRegdate());
		
	}
}
