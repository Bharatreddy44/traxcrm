<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing Info</title>
</head>
<body>
	<h2>Lead info</h2>
	First Name:${contact.firstName}<br/>
	Last Name:${contact.lastName}<br/>
	Email:${contact.email}<br/>
	Mobile:${contact.mobile}<br/>
	Product Name: ${contact.productName}<br/>
	Amount: ${contact.amount}<br/>
</body>
</html>