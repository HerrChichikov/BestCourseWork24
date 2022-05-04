<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="kurs24.IndexArrays"%>
<%
IndexArrays.setValues();
%>
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
			<option id="1"><%=IndexArrays.types[0]%></option>
			<option id="2"><%=IndexArrays.types[1]%></option>
			<option id="3"><%=IndexArrays.types[2]%></option>
			<option id="4"><%=IndexArrays.types[3]%></option>
		</select> <br> <br> Размер мебели: <select name="size">
			<option id="1"><%=IndexArrays.sizes[0]%></option>
			<option id="2"><%=IndexArrays.sizes[1]%></option>
			<option id="3"><%=IndexArrays.sizes[2]%></option>
		</select> <br> <br> Тип материала: <select name="material">
			<option id="1"><%=IndexArrays.materials[0]%></option>
			<option id="2"><%=IndexArrays.materials[1]%></option>
			<option id="3"><%=IndexArrays.materials[2]%></option>
			<option id="4"><%=IndexArrays.materials[3]%></option>
		</select> <br> <br> Категория: <select name="category">
			<option id="1"><%=IndexArrays.categories[0]%></option>
			<option id="2"><%=IndexArrays.categories[1]%></option>
			<option id="3"><%=IndexArrays.categories[2]%></option>
		</select> <br> <br> Наполнитель: <select name="filler">
			<option id="1"><%=IndexArrays.fillers[0]%></option>
			<option id="2"><%=IndexArrays.fillers[1]%></option>
		</select> <br> <br> Тип доставки: 
		<input type="radio" name="delivery" id="1" value="По Уфе" checked/><%=IndexArrays.deliveries[0]%>
		<input type="radio"	name="delivery" id="2" value="По республике"><%=IndexArrays.deliveries[1]%>
		<input type="radio" name="delivery" id="3" value="Самовывоз"><%=IndexArrays.deliveries[2]%>
		<br>
		<h2>Рассчитать</h2>
		<br> <input type="Submit" value="Рассчитать" />
	</form>
	<br>
	<form action="${pageContext.request.contextPath}/Coefficient" method="post">
		<input type="Submit" value="Изменить коэффициенты" />
	</form>
	<br>
</body>
</html>