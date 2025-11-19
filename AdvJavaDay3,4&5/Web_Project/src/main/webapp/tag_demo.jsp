<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.time.LocalDate,java.time.LocalTime"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>background</title>
</head>
<body>
		<h1>Welcome to the demo of jsp tags</h1>
		<%--Including the resource: background.html--%>
		<%@ include file = "Background.html" %>
		    <%!
    		int num = 15;
    public String sayWelcome(String name){
    		return "Welcome"+ name;
    }
    %>
		
		<%--Accessing the variable and method--%>
		<h2>Square of <%=num %> is <%=(num*num) %></h2>
		<h2>Reply from method is <%= sayWelcome("Jack") %></h2>
		
		
		<%--Display hello message 5 times using h2 heading--%>
		
		<%
		for(int a=1 ; a<=5 ; a++){
		%>
		<h2>Hello</h2>
		
		<%
		}
		%>
		
		<%--Displaying system date and time--%>

		<%
			LocalDate today =LocalDate.now();
			LocalTime now =LocalTime.now();
		%>
		
		<h2>Today's date is <%= today %></h2>
		<h2>Current time is <%= now %></h2>
		
</body>
</html>