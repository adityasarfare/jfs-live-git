package jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/displayemployees")
public class EmployeeDisplayServlet extends HttpServlet {

	int x = 1;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int y = 1;

		PrintWriter out = response.getWriter();

		try {
//			   1. get the jar file ojdbc14.jar
//			   2. Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			   3. Establish the connection
			Connection connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
//			   4. Create a statement
			Statement statement = connection.createStatement();
//			   5. Execute the statement
			ResultSet resultSet = statement
					.executeQuery("select * from employees");
			// Printing to server console
//			while (resultSet.next()) {
//				String firstNameString = resultSet.getString("FIRST_NAME");
//				float salary = resultSet.getInt("salary");
//				System.out.println(firstNameString + " " + salary);
//			}

			// Generate table
			out.println("<html>");
			out.println("<head><title>Employee Records</title></head>");
			out.println("<body>");
			out.println(x++);
			out.println(y++);
			out.println("<table border='1'>");
			out.println(" <tr><th>First Name</th><th>Last Name</th></tr>");
			boolean flag = true;
			while (resultSet.next()) {
				String firstNameString = resultSet.getString("FIRST_NAME");
				float salary = resultSet.getInt("salary");
				if (flag == true) {
					out.println("<tr style='background-color:burlywood'>");
					flag = false;
				} else {
					flag = true;
					out.println("<tr style='background-color:grey'>");
				}

				out.println("<td>" + firstNameString + "</td>");
				out.println("<td>" + salary + "</td>");
				out.println("</tr>");
				System.out.println(firstNameString + " " + salary);
			}
			out.println("</table>");
			out.println("</body>");
			out.println("</html>");

		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void selectEmployees(PrintWriter out) {
		try {
//			   1. get the jar file ojdbc14.jar
//			   2. Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			   3. Establish the connection
			Connection connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
//			   4. Create a statement
			Statement statement = connection.createStatement();
//			   5. Execute the statement
			ResultSet resultSet = statement
					.executeQuery("select * from employees");
			// Check if there are rows
			while (resultSet.next()) {
				String firstNameString = resultSet.getString("FIRST_NAME");
				float salary = resultSet.getInt("salary");
				System.out.println(firstNameString + " " + salary);
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void insertDB(String userid, String password) {
		try {
//			   1. get the jar file ojdbc14.jar
//			   2. Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			   3. Establish the connection
			Connection connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
//			   4. Create a statement
			Statement statement = connection.createStatement();
//			   5. Execute the statement
			int status = statement.executeUpdate("insert into signup values ('"
					+ userid + "','" + password + "')");
			if (status == 1) {
				System.out.println("Record Inserted!");
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}

	}
}
