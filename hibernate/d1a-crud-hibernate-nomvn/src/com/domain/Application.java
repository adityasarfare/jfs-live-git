package com.domain;

import java.util.List;
import java.util.Properties;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.domain.model.Product;

public class Application {
	public static void main(String[] args) {
		// CREATE SESSION FACTORY
		Configuration configuration = new Configuration().configure();
		Properties properties = configuration.getProperties();
		ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder().applySettings(properties);
		ServiceRegistry serviceRegistry = serviceRegistryBuilder.buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		// OPEN A SESSION
		Session session = sessionFactory.openSession();

		// BEGIN A TRANSACTION
		Transaction transaction = session.beginTransaction();

		// CREATE THE ENTITY
//		Product product = new Product();
//		product.setProductId("P02");
//		product.setProductName("ANGULAR");
//		session.save(product);
		
//		Product product = new Product();
//		product.setProductId("P01");
//		product.setProductName("HIBERNATE");
//		session.save(product);

		// UPDATE THE ENTITY
//		Product product = (Product) session.get(Product.class, "P01");
//		product.setProductName("SPRING");
//		session.update(product);
		
		//DELETE THE ENTITY
//		Product product = (Product) session.get(Product.class, "P01");
//		session.delete(product);
		
		//FETCH THE ENTITY
//		Product product = (Product) session.get(Product.class, "P01");
//		System.out.println(product);
		
		//FETCH ALL RECORDS
		Query query = session.createQuery("from Product");
		List<Product> productsList = query.list();
		productsList.forEach(System.out::println);
		
//		for (Product Product : productsList) {
//			System.out.println(Product);
//		}
		// COMMIT THE TRANSACTION
		transaction.commit();

		// CLOSE A SESSION
		session.close();
	}
}
