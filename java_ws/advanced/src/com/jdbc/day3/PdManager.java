package com.jdbc.day3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Scanner;

import com.db.DBUtil;
import com.pd.model.PdDAO;
import com.pd.model.PdDTO;

public class PdManager {
	private Scanner sc = new Scanner(System.in);
	private PdDAO pdDao;

	public PdManager(){
		pdDao=new PdDAO();
	}

	public void showAll() throws SQLException {
		//1.		
		//2.
		List<PdDTO> list=pdDao.selectAll();

		//3.
		for(int i=0;i<list.size();i++) {
			PdDTO dto=list.get(i);

			System.out.println(dto.getNo()+"\t"+dto.getPdName()+"\t"
					+ dto.getPrice()+"\t"+dto.getRegdate());
		}//for

		System.out.println();
	}

	public void register() throws SQLException {
		//1. ����� �Է� �ޱ�
		System.out.println("��ǰ��, ���� �Է�!");
		String pdName=sc.nextLine();
		String sPrice=sc.nextLine();
		int price=0;
		if(sPrice!=null && !sPrice.isEmpty()) {
			price=Integer.parseInt(sPrice);
		}

		//2. db�۾�
		PdDTO dto = new PdDTO();
		dto.setPdName(pdName);
		dto.setPrice(price);
		int cnt=pdDao.insertPd(dto);

		//3. ��� ó��
		String result=(cnt>0)?"��� ����":"��� ����";
		System.out.println(result);
	}

	public void showByNo() throws NumberFormatException, SQLException {
		//1. ����� �Է¹ޱ� 
		System.out.println("��ȸ�� ��ȣ �Է�!");
		String sNo=sc.nextLine();

		//��ȿ�� �˻�
		if(sNo==null || sNo.isEmpty()) {
			System.out.println("��ȣ �Է��ؾ� ��!!!");
			return; 
		}

		//2. db�۾�
		PdDTO dto=pdDao.selectByNo(Integer.parseInt(sNo));

		//3. ��� ó��
		System.out.println("��ȣ:"+dto.getNo());
		System.out.println("��ǰ��:"+dto.getPdName());
		System.out.println("����:"+dto.getPrice());
		System.out.println("�����:"+dto.getRegdate()+"\n");		
	}

	public void edit() throws SQLException {
		//1.
		System.out.println("������ ��ǰ ��ȣ, ��ǰ��, ���� �Է�!");
		String no= sc.nextLine();
		String pName=sc.nextLine();
		String price= sc.nextLine();

		//2.
		PdDTO dto= new PdDTO();
		dto.setNo(Integer.parseInt(no));
		dto.setPdName(pName);
		dto.setPrice(Integer.parseInt(price));

		int cnt= pdDao.updatePd(dto);

		//3.
		String result=(cnt>0)? "��ǰ ���� ����": "���� ����";
		System.out.println(result);
	}

	public void showByName() throws SQLException {
		//1
		System.out.println("��ǰ�� �̸��� �Է�!");
		String pdName = sc.nextLine();

		//2
		List<PdDTO> list=pdDao.selectByName(pdName);
		
		//3
		for(PdDTO dto : list) {
			System.out.println(dto.getNo()+"\t"+dto.getPdName()+"\t"
					+ dto.getPrice()+"\t"+ dto.getRegdate());
		}
		
		System.out.println();
	}

	public void delete() throws NumberFormatException, SQLException {
		//1
		System.out.println("������ ��ȣ �Է�!");
		String no=sc.nextLine();
		
		if(no==null || no.isEmpty()) {
			System.out.println("��ȣ �Է��ؾ� ��!!");
			return;
		}
		
		//2
		int cnt=pdDao.deletePd(Integer.parseInt(no));
		
		//3
		String result="";
		if(cnt>0) {
			result="��ǰ ���� ����";
		}else {
			result="��ǰ ���� ����";			
		}
		
		System.out.println(result);
	}

	public void delete2() throws NumberFormatException, SQLException {
		//1
		System.out.println("������ ��ȣ �Է�!");
		String no=sc.nextLine();
		
		if(no==null || no.isEmpty()) {
			System.out.println("��ȣ �Է��ؾ� ��!!");
			return;
		}
		
		//2
		PdDTO dto = new PdDTO();
		dto.setNo(Integer.parseInt(no));
		int cnt=pdDao.deletePd2(dto);
		
		//3
		String result="";
		if(cnt>0) {
			result="��ǰ ���� ����";
		}else {
			result="��ǰ ���� ����";			
		}
		
		System.out.println(result);
	}
}
