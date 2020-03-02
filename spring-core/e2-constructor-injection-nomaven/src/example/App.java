package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import example.repository.ProductRepository;
import example.service.ProductService;

public class App {
	public static void main(String[] args) {
		// 1.Create the IOC Container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		// seeIOCinAction(applicationContext);

		// seeDIinAction(applicationContext);
	}

	private static void seeDIinAction(ApplicationContext applicationContext) {
		ProductService productService = applicationContext
				.getBean("productService", ProductService.class);
		productService.getProducts().forEach(System.out::println);
	}

	private static void seeIOCinAction(ApplicationContext applicationContext) {
		// 2.Get the Bean from the IOC Container
		ProductRepository productRepository;
//		productRepository = (ProductRepository) applicationContext
//				.getBean("productRepository");
		// Inversion of Control happens and the bean instance is available in
		// the program
		productRepository = applicationContext.getBean("productRepository",
				ProductRepository.class);
		productRepository.getProducts().forEach(System.out::println);
	}
}
