package com.rays.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.rays.dto.EmployeDTO;
import com.rays.inteface.EmployeInt;



public class EmployeeModelImpl implements EmployeInt{

	public void addEmployee(EmployeDTO dto) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(dto);
		tx.commit();
		session.close();
		
	}

	public void updateEmployee(EmployeDTO dto) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.update(dto);
		tx.commit();
		session.close();
		
	}

	public List showEmpList(EmployeDTO dto) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(EmployeDTO.class);
		List list=criteria.list();
		session.close();
		
		return list;
	}

	public EmployeDTO showEmployeeById(int empid) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		EmployeDTO  dto=(EmployeDTO)session.get(EmployeDTO.class,empid );
		return dto;
		
	}

	public void deleteEmployee(EmployeDTO dto) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(dto);
		tx.commit();
		session.close();
		
		
	}



}
