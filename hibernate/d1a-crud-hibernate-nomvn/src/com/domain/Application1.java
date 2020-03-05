package com.domain;

import java.io.IOException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.domain.model.Product;
import com.domain.util.HibernateUtil;


public class Application1 {
	// Create the session factory
	static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();

	public static void main(String[] args) {
		Application1 application = new Application1();
		application.saveProduct();
		application.getProducts();
		//application.getProducts();
		//application.getProduct("P02");
		//application.updateProduct("P02", "mongoose");
		//application.deleteProduct("P02");
		//sessionFactory.close();
		try {
			System.in.read();
		} catch (IOException e) {
		}
		finally {
			sessionFactory.close();
		}
	}

	private void getProduct(String productId) {
		session.beginTransaction();
		Product product = (Product) session.get(Product.class, productId);  
		System.out.println(product);
		session.getTransaction().commit();
	}
	private void getProducts() {
		session.beginTransaction();
		Query selectQuery = session.createQuery("FROM Product");
		List<Product> Products = (List<Product>) selectQuery.list();
		session.getTransaction().commit();
		for (Product Product : Products) {
			System.out.println(Product);
		}
	}

	private void saveProduct() {
		session.beginTransaction();
		Product product = new Product();
		product.setProductId("P04");
		product.setProductName("angular");
		session.save(product);
		session.getTransaction().commit();
		
		session.beginTransaction();
		Product product1 = new Product();
		product1.setProductId("P05");
		product1.setProductName("angular");
		session.save(product1);
		session.getTransaction().commit();
	}

	private void updateProduct(String productId, String productName) {
		session.beginTransaction();
		Product Product = (Product) session.get(Product.class, productId);  
		Product.setProductName(productName);
		session.getTransaction().commit();
	}

	private void deleteProduct(String productId) {
		session.beginTransaction();
		Product Product = (Product) session.get(Product.class, productId);
		session.delete(Product);
		session.getTransaction().commit();
	}
}