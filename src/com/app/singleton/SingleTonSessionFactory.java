package com.app.singleton;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingleTonSessionFactory {
	private static SessionFactory sf;
	private SingleTonSessionFactory() {
	}	
	public static SessionFactory getSf() {
		if(sf==null) {
		Configuration config=new Configuration();
		config.configure();
		sf=config.buildSessionFactory();
		return sf;
		}
		return sf;
	}
}
