package com.scp.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.scp.Util.HibernateUtil;
import com.scp.webService.Model.User;

public class UserDaoImpl {

	public List getAll() {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		List list = session.createQuery("from User").list();
		session.close();
		return list;
	}

	public boolean deleteById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		User user = (User) session.get(User.class, id);
		session.delete(user);
		tx.commit();
		session.close();
		return true;
	}

	public User getUserById(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		User user = (User) session.get(User.class, id);
		session.close();
		return user;
	}

	public boolean addUser(User u) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(u);
		transaction.commit();
		session.close();
		return true;
	}
	
	
}