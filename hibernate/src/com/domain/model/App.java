package com.domain.model;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {
	public static void main(String[] args) {
		try {
			ServiceRegistry serviceRegistry;
			SessionFactory sessionFactory;
			Configuration configuration = new Configuration().configure();
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
					.buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			
			Product product = new Product();
			product.setProductId("P02");
			product.setProductName("Spring");
			session.save(product);
			
			session.getTransaction().commit();
			
		} catch (HibernateException exception) {
			System.out.println("ERROR : Creating Session Factory!");
			System.out.println(exception);
		}
	}
	
}
