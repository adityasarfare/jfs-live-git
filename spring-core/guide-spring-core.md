:books: **Spring Framework**  

:atom: layered architecture

An application can be monolithic or layered.
Enterprise applications are layered by nature.

Layers :
1. Repository Layer
   1. Connects to the database
2. Service Layer
      1. Provides business logic
      2. Takes care of transactions management
3. MVC 
      1. Model View Controller Architecture
      2. Has the UI for the client (View)
      3. Contains data for the view (Model)
      4. Controller helps navigate between views (Controller)
      5. In a traditional MVC
         1. Views are built with JSP
         2. Models are created with POJO
         3. Controllers are created using Servlets


:atom:  **Features**
- A light weight Framework
- For building enterprise grade applications
- Helps build loosely coupled systems
- Supports Interface Driven Development
- Intergrates with other frameworks like hibernate
- Follows best practices and has several design patterns baked into it
- Has numerous modules like spring core, spring mvc, spring REST.
- Open Source
- Has a large community
- https://docs.spring.io/spring/docs/3.0.0.M4/reference/html/ch01s02.

:atom: **The core module**

:lock: **Build your first spring application**

:key: **Use the Core Container for IOC (Inversion Of Control) and DI (Dependency Injection)** 

:one: Download Spring Framework and add all jars to lib.
-https://repo.spring.io/release/org/springframework/spring/5.0.2.RELEASE/spring-framework-5.0.2.RELEASE-dist.zip

:two: Create the Spring Bean Definitions (applicationContext.xml)  
`applicationContext.xml`
``` xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
	<!-- <bean name="productRepository"
		class="example.repository.OracleRepository">
	</bean> -->
	<bean name="productRepository"
		class="example.repository.MySqlDBRepository">
	</bean>
		<bean name="productService"
		class="example.service.ProductServiceImpl">
		<constructor-arg index="0" ref="productRepository"></constructor-arg>
	</bean>
	
</beans>
```
`DI using constructor`
``` java
// constructor based dependency injection
	public ProductServiceImpl(ProductRepository productRepository) {
		System.out.println(
				"The productRepository is injected into ProductServiceImpl constructor.");

		this.productRepository = productRepository;
    }
```
`IOC`
``` java
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

```

:gem: Summary

> DI : dependency injection is a technique whereby one object supplies the dependencies of another object

> IOC :  in traditional programming, the custom code that expresses the purpose of the program calls into reusable libraries to take care of generic tasks, but with inversion of control, it is the framework that calls into the custom, or task-specific, code.

>Types of DI
1. Setter Based
2. Constructor Based
3. Field Based

:lock: **Dependencies of jars**
* Manually place jar files
* Compatible jars
* Configuring
* Versioning of jar files
  
:key: Maven
* Automatically download jar files 
* Automatically update classpath
* Ensures compatible jars are downloaded
* Takes care of transitive dependencies
* Maven has a repository of jars
* Maven has artifacts you can download