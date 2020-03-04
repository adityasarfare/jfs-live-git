package example.service;

import java.util.List;

import example.model.Product;
import example.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
//1. Instantiate the OracleRepository and expose through and interface	@Override
	ProductRepository productRepository;

	public ProductServiceImpl() {
		// productRepository = new OracleRepository();
		// productRepository = new MySqlDBRepository();
	}

	public List<Product> getProducts() {

		// 2. Return the list of products from the repository
		return productRepository.getProducts();
	}

	// constructor based dependency injection
	public ProductServiceImpl(ProductRepository productRepository) {
		System.out.println(
				"The productRepository is injected into ProductServiceImpl constructor.");

		this.productRepository = productRepository;
	}

//	public void setProductRepository(ProductRepository productRepository) {
//		this.productRepository = productRepository;
//	}

}
