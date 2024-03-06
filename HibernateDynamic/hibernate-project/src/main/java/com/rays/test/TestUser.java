package com.rays.test;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.rays.dto.UserDTO;
import com.rays.model.UserModel;

public class TestUser {

	public static void main(String[] args) {
		//testAdd();
		testUpdate();
		//testDelete();
		//testSearch();
		//testfindByPK();

	}

private static void testfindByPK() {
		
		UserModel model=new UserModel();
		UserDTO dto=model.findByPk(2);
		System.out.println(dto.getId());
		System.out.println(dto.getF_name());
		System.out.println(dto.getL_Name());
		System.out.println(dto.getLogin());
		System.out.println(dto.getPass());
		System.out.println(dto.getDob());
		System.out.println(dto.getAddress());
		
	}

//	private static void testSearch() {
//		UserDTO dto=new UserDTO();
//		UserModel model=new UserModel();
//		//List list=model.search(null,null,null);
//		//Iterator it=list.iterator();
//		while(it.hasNext()) {
//			dto=(UserDTO)it.next();
//			System.out.print(dto.getId());
//			System.out.print("\t"+dto.getF_name());
//			System.out.print("\t"+dto.getL_Name());
//			System.out.print("\t"+dto.getLogin());
//			System.out.print("\t"+dto.getPass());
//			System.out.print("\t"+dto.getDob());
//			System.out.println("\t"+dto.getAddress());
//		}
//		
//	}

	private static void testDelete() {
		UserDTO dto= new UserDTO();
		UserModel model=new UserModel();
		dto.setId(4);
		model.delete(dto);
		
	}

	private static void testUpdate() {
		UserDTO dto=new UserDTO();
		UserModel model=new UserModel();
		dto.setId(2);
		dto.setF_name("nitish");
		dto.setL_Name("chawla");
		dto.setLogin("nitish@gmail.com");
		dto.setPass("nitish@123");
		dto.setDob("12/05/1999");
		dto.setAddress("pune");
		model.update(dto);
		
	}

	private static void testAdd() {
		UserDTO dto=new UserDTO();
		UserModel model=new UserModel();
		dto.setId(2);
		dto.setF_name("ankit");
		dto.setL_Name("chawla");
		dto.setLogin("ankit@gmail.com");
		dto.setPass("ankit@123");
		dto.setDob("13/05/1997");
		dto.setAddress("mumbai");
		model.add(dto);
		
	}

}
