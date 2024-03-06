package com.rays.model;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

import com.rays.dto.UserDTO;
import com.rays.inteface.UserInt;


public class UserModel implements UserInt{

	public void add(UserDTO dto) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(dto);
		tx.commit();
		session.close();
		
	}

	public void update(UserDTO dto) {
		// TODO Auto-generated method stub
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.update(dto);
		tx.commit();
		session.close();
		
	}

	public void delete(UserDTO dto) {
		// TODO Auto-generated method stub
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.delete(dto);
		tx.commit();
		session.close();
		
		
	}

	public List search(UserDTO dto, int pageNo, int pageSize) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(UserDTO.class);
		if (dto != null) {

			if (dto.getF_name() != null && dto.getF_name().length() > 0) {

				criteria.add(Restrictions.like("firstName", dto.getF_name() + "%"));

			}
		}
		if (pageSize > 0) {
			pageNo = (pageNo - 1) * pageSize;
			criteria.setFirstResult(pageNo);
			criteria.setMaxResults(pageSize);
		}
		List list=criteria.list();
		session.close();
		return list;
	}
	

	public UserDTO findByPk(int pk) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		UserDTO dto=(UserDTO) session.get(UserDTO.class, pk);
		
		return dto;
	}


}
