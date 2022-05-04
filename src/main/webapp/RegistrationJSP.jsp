<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Регистрация</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="intro">
		<div class="container">
			<div class="intro__inner">
			<div class="intro_content">
			<h1 class="intro__title">Регистрация</h1>
				<form class="intro__form" action="${pageContext.request.contextPath}/Registration" method="POST">			
					<label for="login">Логин</label>					
					<input name="login" minlength="3" placeholder="Введите логин..."/> 
					<label for="password">Пароль (минимум 6 символов)</label>
					<input type="password" minlength="6" name="password" placeholder="Введите пароль..."/> 
					<input type="submit" value="Зарегистрироваться" /> 
					<p>${message}</p>
				</form>
				</div>
				<img class="intro__image" alt="reg" src="css/images/reg.png">
			</div>
		</div>
	</div>
</body>
</html>