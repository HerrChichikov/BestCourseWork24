<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Регистрация</title>
</head>
<body>
	<h1>Регистрация</h1>
	<form action="${pageContext.request.contextPath}/Registration" method="POST">
    Логин: <input name="login" />
    <br><br>
    Пароль: <input name="password" />
    <br><br>
    <input type="submit" value="Зарегистрироваться" />
    <br><br>
    <p>${message}</p>
</form>
</body>
</html>
