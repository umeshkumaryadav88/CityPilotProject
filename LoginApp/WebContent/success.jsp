<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.java.project.dto.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success</title>
</head>
<body>
<h3>login successful</h3>
<jsp:useBean id="user" class="com.java.project.dto.User" scope="request" >
	<jsp:setProperty property="userName" name="user" value="newUser" />
	
	</jsp:useBean>

Hey: <jsp:getProperty property="userName" name="user"/>
</body>
</html>