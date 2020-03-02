package example.repository;

import java.util.ArrayList;
import java.util.List;

import example.model.Product;

public class OracleRepository implements ProductRepository {

	@Override
	public List<Product> getProducts() {
		System.out.println("Oracle Repository hit.");
		List<Product> products = new ArrayList<>();

		Product product = new Product();
		product.setProductId("P01");
		product.setProductName("Oracle SQL");
		products.add(product);

		product = new Product();
		product.setProductId("P02");
		product.setProductName("PLSQL");
		products.add(product);

		return products;
	}
}
