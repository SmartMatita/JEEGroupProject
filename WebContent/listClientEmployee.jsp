<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Clients List</title>
</head>
<body>
	<form method="post" action="/JEEGroupProject/InfoClient"> <%--TODO : corriger le path --%>
		<input type="submit" value="Modify" class="noLabel" />
    	<br />
	</form>
	
	<c:out value="${user.account_id}"></c:out>
</body>
</html>