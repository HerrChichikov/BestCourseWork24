<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Панель администратора</title>
</head>
<body>
	<h1>Панель администратора</h1>
	<form action="${pageContext.request.contextPath}/CalcSum" method="post">
		Тип мебели:<select name="type">
			<option name="Банкетка" value='${1}'>Банкетка</option>
			<option id="2" value="2">Диван</option>
			<option id="3" value="3">Кресло</option>
			<option id="4" value="4">Стул</option>
		</select> <br> <br> Размер мебели: <select name="size">
			<option id="1" value="1">Маленький</option>
			<option id="2" value="2">Средний</option>
			<option id="3" value="3">Большой</option>
		</select> <br> <br> Тип материала: <select name="material">
			<option id="1" value="1">Ткань</option>
			<option id="2" value="2">Экокожа</option>
			<option id="3" value="3">Натуральная кожа</option>
			<option id="4" value="4">Кожзам</option>
		</select> <br> <br> Категория: <select name="category">
			<option id="1" value="1">Низшая</option>
			<option id="2" value="2">Средняя</option>
			<option id="3" value="3">Высшая</option>
		</select> <br> <br> Наполнитель: <select name="filler">
			<option id="1" value="1">ППУ</option>
			<option id="2" value="2">ЛППУ</option>
		</select> <br> <br> Тип доставки: <input type="radio" name="delivery"
			id="1" value="1" checked />По Уфе <input type="radio"
			name="delivery" id="2" value="2" />По республике <input type="radio"
			name="delivery" id="3" value="3" />Самовывоз <br> <br>
		<h2>Рассчитать</h2>
		<br> <input type="Submit" value="Рассчитать" />
	</form>
	<br>
	<a href="/Calculate/CoefficientJSP.jsp">Изменить коэффициенты</a>
	<br>
	<a href="/Calculate/AdminRegistrationJSP.jsp">Зарегестрировать администратора</a>
</body>
</html>