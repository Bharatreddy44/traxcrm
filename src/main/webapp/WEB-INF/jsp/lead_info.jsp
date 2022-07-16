<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>
	<h2>Lead info</h2>
	First Name:${lead.firstName}<br/>
	Last Name:${lead.lastName}<br/>
	Email:${lead.email}<br/>
	Mobile:${lead.mobile}<br/>
	Lead Source:${lead.leadSource}<br/>
	Gender:${lead.gender}<br/>
	
	<form action="convertedLead" method="post">
		<input type="hidden" name="id" value="${lead.id}"/>
		<input type="submit" value="Convert"/>
	</form>
</body>
</html>