<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Калькулятор расчета стоимости мебели</title>
</head>
<body>
	<h1>Калькулятор расчета стоимости мебели</h1>
	<form action="${pageContext.request.contextPath}/Calc" method="post">
		Тип мебели: <input type="checkbox" name="courses" value="JavaSE"
			checked />Банкетка <input type="checkbox" name="courses"
			value="JavaFX" checked />Диван <input type="checkbox" name="courses"
			value="JavaEE" checked />Кресло <br>
		<br> Размер мебели: <select name="country">
			<option>Маленький</option>
			<option>Средний</option>
			<option>Большой</option>
		</select> <br>
		<br> Тип материала: <select name="country">
			<option>Ткань</option>
			<option>Экокожа</option>
			<option>Натуральная кожа</option>
			<option>Кожзам</option>
		</select> <br>
		<br> Категория: <select name="country">
			<option>Низшая</option>
			<option>Средняя</option>
			<option>Высшая</option>
		</select> <br>
		<br> Наполнитель: <select name="country">
			<option>ППУ</option>
			<option>ЛППУ</option>
		</select> <br>
		<br> Тип доставки: <input type="radio" name="gender"
			value="female" checked />По Уфе <input type="radio" name="gender"
			value="male" />По республике <input type="radio" name="gender"
			value="male" />Самовывоз <br>
			<br><h2>Рассчитать</h2>
		<br> <input type="submit" value="Submit" />
		<%-- 	<label for="first">Площадь основания:</label>
	<input type="text" name="first" id="first" value="${first}">
	<label for="second">Высота пирамиды:</label>
	<input type="text" name="second" id="second" value="${second}">
	<input type="submit" name="sign" value="Посчитать"> --%>
	</form>
</body>
</html>