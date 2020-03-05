package com.domain;

import java.util.Properties;

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
		Product product = new Product();
		product.setProductId("P01");
		product.setProductName("HIBERNATE");

		// SAVE THE ENTITY
		session.save(product);

		// COMMIT THE TRANSACTION
		transaction.commit();

		// CLOSE A SESSION
		session.close();
	}
}
