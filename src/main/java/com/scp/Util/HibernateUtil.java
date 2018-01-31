package com.scp.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	static SessionFactory sf=null;
	
	public static SessionFactory getSessionFactory()
	{
		if(sf==null)
		{
			sf= new Configuration().configure().buildSessionFactory();
			return sf;
		}	
		return sf;
	}
}
