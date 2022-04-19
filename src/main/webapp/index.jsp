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
	<form action="${pageContext.request.contextPath}/CalcSum" method="post">
		Тип мебели:<select name="type">
			<option id="1" value="1">Банкетка</option>
			<option id="2">Диван</option>
			<option id="3">Кресло</option>
			<option id="4">Стул</option>
		</select> <br> <br> Размер мебели: <select name="size">
			<option>Маленький</option>
			<option>Средний</option>
			<option>Большой</option>
		</select> <br> <br> Тип материала: <select name="material">
			<option>Ткань</option>
			<option>Экокожа</option>
			<option>Натуральная кожа</option>
			<option>Кожзам</option>
		</select> <br> <br> Категория: <select name="category">
			<option>Низшая</option>
			<option>Средняя</option>
			<option>Высшая</option>
		</select> <br> <br> Наполнитель: <select name="filler">
			<option>ППУ</option>
			<option>ЛППУ</option>
		</select> <br> <br> Тип доставки: <input type="radio" name="delivery"
			value="female" checked />По Уфе <input type="radio" name="delivery"
			value="male" />По республике <input type="radio" name="delivery"
			value="male" />Самовывоз <br> <br>
		<h2>Рассчитать</h2>
		<br> <input type="submit" value="Submit" />
	</form>
</body>
</html>