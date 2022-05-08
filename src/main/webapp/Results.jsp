<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="kurs24.CalcSum"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Итоговая стоимость</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="intro">
		<div class="container">
			<div class="intro__inner">
				<div class="intro_frame">
					<h1 class="intro__title">Итоговая стоимость</h1>
					<p>
						<strong>Итого:</strong> ${result}
					</p>
						<a href="${pageContext.request.contextPath}/Check.pdf">
							Открыть PDF-файл</a> <br><br>
							<a href="${pageContext.request.contextPath}/Check.pdf" download>
							Скачать PDF-файл</a> <br><br>
						<button class="button__back" type="button" name="back"
							onclick="history.back()">Назад</button>

				</div>
				<img class="intro__image" alt="reg" src="css/images/results.png">
			</div>
		</div>
	</div>
</body>
</html>