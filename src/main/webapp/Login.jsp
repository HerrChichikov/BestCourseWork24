<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Авторизация</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="intro">
		<div class="container">
			<div class="intro__inner">
				<div class="intro_content">
					<h1 class="intro__title">Авторизация</h1>
					<form class="intro__form"
						action="${pageContext.request.contextPath}/Login" method="POST">
						<label for="login">Логин</label>
						<input name="login" name="login" placeholder="Введите логин..."/>
						<label for="login">Пароль</label> 
						<input type="password" minlength="6" name="password" placeholder="Введите пароль..."/> 
						<input type="submit" value="Войти" /> 
						<a href="/Calculate/RegistrationJSP.jsp">К регистрации</a>
						<p>${massage}</p>
					</form>
				</div>
				<img class="intro__image" alt="reg"
					src="css/images/login.png">
			</div>
		</div>
	</div>
</body>
</html>
