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
<form:form action="insert" modelAttribute="stdobject">
		<form:input path="email"/>
		<form:input path="pwd"/>
		<form:input path="name"/>
		<form:button>submit</form:button>
	</form:form>
</body>
</html>