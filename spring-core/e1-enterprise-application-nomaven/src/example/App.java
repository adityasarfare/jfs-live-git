package example;

import example.service.ProductService;
import example.service.ProductServiceImpl;

public class App {
	public static void main(String[] args) {
//1. create the service
		ProductService productService;
		productService= new ProductServiceImpl();
//. fetch the products from the service
		productService.getProducts().forEach(System.out::println);
	}
}
