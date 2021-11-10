<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRATION</title>
<link rel="stylesheet" href="styles/styles.css">
</head>
<body>
	<h1>Registration</h1>
	<hr>
	<br>
	<div align="center">
		<s:form action="teste">
			<s:textfield key="username" />
			<s:submit key="submit" name="submit" />
		</s:form>
	</div>
</body>
</html>