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
	<form action="${pageContext.request.contextPath}/Login" method="POST"><br>
		Логин: <input name="login" /> <br>
		<br> Пароль: <input name="password" /> <br>
		<br> <input type="submit" value="Войти" />
	<br>
	<a href="/Calculate/RegistrationJSP.jsp">Регистрация</a>
	<br>
	<p>${massage}</p>
</form>
</body>
</html>
