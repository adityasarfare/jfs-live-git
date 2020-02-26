package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// insertDB();
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		insertDB(userid, password);
		response.getWriter().println("User Saved!");
	}

	public void insertDB() {
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
			int status = statement.executeUpdate(
					"insert into signup values ('user2','pass2')");
			if (status == 1) {
				System.out.println("Record Inserted!");
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
