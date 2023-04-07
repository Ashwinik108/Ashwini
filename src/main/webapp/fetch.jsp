<%@page import="studentdto.Studentdto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="">
<tr>
<th>email</th>
<th>pwd</th>
<th>name</th>
</tr>
<%Studentdto dto=(Studentdto) request.getAttribute("reqk");
%>
<tr>
<td><%=dto.getEmail() %></td>
<td><%=dto.getPwd() %></td>
<td><%=dto.getName() %></td>

</table>
</body>
</html>