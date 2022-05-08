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
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="calc">
		<div class="container">
			<div class="calc__inner">
				<div class="calc__content">
					<h1 class="calc__title">Панель администратора</h1>
					<form class="calc__form"
						action="${pageContext.request.contextPath}/CalcSum" method="post">
						<label for="type">Тип мебели:</label> <select class="calc__option"
							name="type">
							<option id="1"><%=IndexArrays.types[0]%></option>
							<option id="2"><%=IndexArrays.types[1]%></option>
							<option id="3"><%=IndexArrays.types[2]%></option>
							<option id="4"><%=IndexArrays.types[3]%></option>
						</select> <label for="size">Размер мебели:</label> <select
							class="calc__option" name="size">
							<option id="1"><%=IndexArrays.sizes[0]%></option>
							<option id="2"><%=IndexArrays.sizes[1]%></option>
							<option id="3"><%=IndexArrays.sizes[2]%></option>
						</select> <label for="material">Тип материала:</label> <select
							class="calc__option" name="material">
							<option id="1"><%=IndexArrays.materials[0]%></option>
							<option id="2"><%=IndexArrays.materials[1]%></option>
							<option id="3"><%=IndexArrays.materials[2]%></option>
							<option id="4"><%=IndexArrays.materials[3]%></option>
						</select> <label for="category">Категория материала:</label> <select
							class="calc__option" name="category">
							<option id="1"><%=IndexArrays.categories[0]%></option>
							<option id="2"><%=IndexArrays.categories[1]%></option>
							<option id="3"><%=IndexArrays.categories[2]%></option>
						</select> <label for="filler">Наполнитель: </label> <select
							class="calc__option" name="filler">
							<option id="1"><%=IndexArrays.fillers[0]%></option>
							<option id="2"><%=IndexArrays.fillers[1]%></option>
						</select> <label for="delivery">Тип доставки:</label>
						<div class="calc__radios">
							<input type="radio" name="delivery" id="1" value="По Уфе" checked /><%=IndexArrays.deliveries[0]%>
							<input type="radio" name="delivery" id="2" value="По республике" /><%=IndexArrays.deliveries[1]%>
							<input type="radio" name="delivery" id="3" value="Самовывоз" /><%=IndexArrays.deliveries[2]%>
						</div>
						<input type="Submit" value="Рассчитать" />
											<button type="button" name="back" onclick="history.back()">Выход</button>
					</form>
					<br>
					<form action="${pageContext.request.contextPath}/Coefficient"
						method="post">
						<input type="Submit" value="Изменить коэффициенты" />
					</form>

				</div>
			</div>
		</div>
	</div>
</body>
</html>