<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Авторизация</title>
</head>
<body>
<h1>Авторизация</h1>
	<form action="${pageContext.request.contextPath}/Login" method="POST">
    Логин: <input name="login" />
    <br><br>
    Пароль: <input name="password" />
    <br><br>
    <input type="submit" value="Войти" />
</form>
</body>
</html>