<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Авторизация</title>
</head>
<body>
	<h1>Авторизация</h1><br>
	<p>${massage}</p><br>
	<form action="${pageContext.request.contextPath}/Login" method="POST"><br>
		<p>${message}</p><br>
		Логин: <input name="login" /> <br>
		<p>${massage}</p><br>
		<br> Пароль: <input name="password" /> <br>
		<p>${massage}</p><br>
		<br> <input type="submit" value="Войти" />
	<p>${massage}</p><br>
	<br>
	<a href="/Calculate/RegistrationJSP.jsp">Регистрация</a>
	<br>
	<p>${massage}</p>
	<br>
	<p>${massage}</p>
</form>
</body>
</html>
