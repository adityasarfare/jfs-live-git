package example.repository;

import java.util.ArrayList;
import java.util.List;

import example.model.Product;

public class MySqlDBRepository implements ProductRepository {

	@Override
	public List<Product> getProducts() {
		System.out.println("MySql Repository getProducts");
		List<Product> products = new ArrayList<>();

		Product product = new Product();
		product.setProductId("P03");
		product.setProductName("React");
		products.add(product);

		product = new Product();
		product.setProductId("P02");
		product.setProductName("Node");
		products.add(product);

		return products;
	}

}
