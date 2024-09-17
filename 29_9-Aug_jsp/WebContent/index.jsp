<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%-- scriplet tag --%>

	<b> <%
 	out.print(new Date());
 %>
	</b>

	<%-- expression tag --%>
	<%=new java.util.Date()%>

	<%-- declaration tag --%>

	<%!String name = "Yadullah";%>

	welcome
	<h2><%=name%></h2>

	<%@ include file="insert.jsp"%> 


	<%--<%
		response.sendRedirect("http://moodle.apsit.org.in/moodle/");
	%> --%>

	<%
		request.getRequestDispatcher("/moodle/index.jsp").forward(request, response);
	%>
</body>
</html>