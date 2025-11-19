<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>create_person.jsp</title>
</head>
<body>
		<%--Instantiation a java Bean:person from package:example.bean and putting it into session scope --%>
		<jsp:useBean id="currentPerson" class ="example.bean.Person" scope="session"/>
		
		<%--Assigning values to all the properties of the bean --%>
		<%--  (*=all property ) --%>
		<jsp:setProperty property="*" name="currentPerson"/>
		
		<h2>Added a new person please <a href="show_person.jsp">"Click_Here"</a> to view the details</h2>
</body>
</html>