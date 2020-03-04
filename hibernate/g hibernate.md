:books: **Hibernate**

:atom: **Getting Started**

`Hibernate ?`
>Hibernate ORM enables developers to more easily write applications whose data outlives the application process. As an Object/Relational Mapping (ORM) framework, Hibernate is concerned with data persistence as it applies to relational databases (via JDBC). 

`Advantages`
* Reduces bolier-plate jdbc code
* Hibernate can automatically create table based on the Java Object (Entity Bean)
* Help you switch databases, as it generates the database specific queries


:lock:  **CRUD with HIBERNATE**  

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

:two: Configure Hibernate

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
		"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
		"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
	<session-factory>
		<property name="hibernate.connection.driver_class">oracle.jdbc.driver.OracleDriver</property>
		<property name="hibernate.connection.url">jdbc:oracle:thin:@localhost:1521:xe</property>
		<property name="hibernate.connection.username">hr</property>
		<property name="hibernate.connection.password">hr</property>
		<property name="hibernate.dialect">org.hibernate.dialect.Oracle10gDialect</property>

		<property name="hibernate.show_sql">true</property>
		<property name="hibernate.hbm2ddl.auto">update</property>
		<mapping resource="com/domain/model/Product.hbm.xml" />
	</session-factory>
</hibernate-configuration>
```

:three: Configure Hibernate Mapping (for model)

``` xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
		"-//Hibernate/Hibernate Configuration DTD 3.0//EN"
		"http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
	<session-factory>
		<property name="hibernate.connection.driver_class">oracle.jdbc.driver.OracleDriver</property>
		<property name="hibernate.connection.url">jdbc:oracle:thin:@localhost:1521:xe</property>
		<property name="hibernate.connection.username">hr</property>
		<property name="hibernate.connection.password">hr</property>
		<property name="hibernate.dialect">org.hibernate.dialect.Oracle10gDialect</property>

		<property name="hibernate.show_sql">true</property>
		<property name="hibernate.hbm2ddl.auto">update</property>
		<mapping resource="com/domain/model/Product.hbm.xml" />
		
	</session-factory>
</hibernate-configuration>

```

:four: Configure the hibernate libraries

-http://sourceforge.net/projects/hibernate/files/hibernate4/4.2.21.Final/hibernate-release-4.2.21.Final.zip/download

- copy jar from
  - hibernate-release-4.2.21.Final\hibernate-release-4.2.21.Final\lib\required
- to 
  - lib folder