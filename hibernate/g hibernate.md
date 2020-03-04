:books: **Hibernate **

:atom: **Getting Started**

`Hibernate ?`
>Hibernate ORM enables developers to more easily write applications whose data outlives the application process. As an Object/Relational Mapping (ORM) framework, Hibernate is concerned with data persistence as it applies to relational databases (via JDBC). 

`Advantages`
* Reduces bolier-plate jdbc code
* Hibernate can automatically create table based on the Java Object (Entity Bean)
* Help you switch databases, as it generates the database specific queries


:lock:  ** CRUD with HIBERNATE**  

:one: Create the Entity

``` Java
package com.domain.model;

public class Product {
	private String productId;
	private String productName;

	public Product() {
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
}
```