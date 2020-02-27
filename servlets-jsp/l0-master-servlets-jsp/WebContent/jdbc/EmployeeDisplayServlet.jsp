<%@ page language="java"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>

<html>

<head>
<title>Employee Records</title>
</head>
<body>
<%-- JSP comments --%>
	<h1>Employee Display Servlet</h1>
	<%
		try {
			//JSP comments
			//	   1. get the jar file ojdbc14.jar
			//	   2. Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//	   3. Establish the connection
			Connection connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			//	   4. Create a statement
			Statement statement = connection.createStatement();
			//	   5. Execute the statement
			ResultSet resultSet = statement
					.executeQuery("select * from employees");
	%>

	<table border='1'>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>
		<%
			while (resultSet.next()) {
		%>
		<tr style="background-color:burlywood">
			<td><%=resultSet.getString("FIRST_NAME")%></td>
			<td><%=resultSet.getInt("salary")%></td>
		</tr>
		<tr  style="background-color:black">
			<td><%=resultSet.getString("FIRST_NAME")%></td>
			<td><%=resultSet.getInt("salary")%></td>
		</tr>
		<%
			}
		%>
	</table>

	<%
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	%>
</body>
</html>