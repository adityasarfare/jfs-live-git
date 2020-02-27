<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!  int x = 1;%>
	<%
		int y = 1;
	%>

	<b><%=x++%></b>

	<b><%=y++%></b>
	<table border="1">
		<%
			for (int i = 1; i < 11; i++) {
		%>
		<tr>
			<td>
				<%
					out.println(i);
				%> <%=i%>
			</td>
		</tr>
		<%
			}
		%>

	</table>
</body>
</html>