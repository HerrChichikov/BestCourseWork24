<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Регистрация администратора</title>
</head>
<body>
	<h1>Регистрация администратора</h1>
	<form action="${pageContext.request.contextPath}/AdminRegistration" method="POST">
    Логин: <input name="login" />
    <br><br>
    Пароль: <input name="password" />
    <br><br>
    <input type="submit" value="Зарегистрировать администратора" />
    <br><br>
    <p>${message}</p>
</form>
</body>
</html>