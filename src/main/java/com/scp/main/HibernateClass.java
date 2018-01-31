package com.scp.main;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.json.JSONException;

import com.scp.Services.ClientDemo;
import com.scp.dao.UserDaoImpl;
import com.scp.webService.Model.User;

/**
 * @author AmarGhorpde
 *
 */
public class HibernateClass {
	public static void main(String[] args) throws JSONException, IOException {
		UserDaoImpl dao= new UserDaoImpl();
		System.out.println(dao.getAll());
		//System.out.println(dao.getUserById(3));
		//System.out.println();
		//System.out.println(dao.deleteById(6));
		
		
		
		//To add all the consumed records into DB.
/*		List list= HttpClientDemo.getALLCountries();
		Iterator itr= list.iterator();
		while (itr.hasNext()) {
			dao.addUser((User)itr.next());
			
		}*/
	}
}
