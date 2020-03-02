package example.repository;

import java.util.List;

import example.model.Product;

public interface ProductRepository {
	List<Product> getProducts();
}
