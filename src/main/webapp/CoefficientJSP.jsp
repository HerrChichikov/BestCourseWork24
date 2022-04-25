<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Изменение коэффициентов</title>
</head>
<body>
	<h1>Изменение коэффициентов</h1>
	<form action="${pageContext.request.contextPath}/Coefficient" method="POST">
    <strong>Тип мебели:</strong> 
    <br><br>
    Банкетка: <input name="POKA NET" />
    <br><br>
        Диван: <input name="POKA NET" />
    <br><br>
        Кресло: <input name="POKA NET" />
    <br><br>
        Стул: <input name="POKA NET" />
    <br><br>
    <strong>Размер мебели:</strong> 
    <br><br>
    Маленький: <input name="POKA NET" />
    <br><br>
        Средний: <input name="POKA NET" />
    <br><br>
        Маленький: <input name="POKA NET" />
    <br><br>
    <strong>Тип материала:</strong> 
    <br><br>
    Ткань: <input name="POKA NET" />
    <br><br>
        Экокожа: <input name="POKA NET" />
    <br><br>
        Натуральная кожа: <input name="POKA NET" />
    <br><br>
        Кожзам: <input name="POKA NET" />
    <br><br>
    <strong>Категория:</strong> 
        <br><br>
    Низшая: <input name="POKA NET" />
        <br><br>
        Средняя: <input name="POKA NET" />
        <br><br>
        Высшая: <input name="POKA NET" />
        <br><br>
	<strong>Наполнитель:</strong> 
        <br><br>
    ППУ: <input name="POKA NET" />
        <br><br>
        ЛППУ: <input name="POKA NET" />
        <br><br>
	<strong>Тип доставки:</strong> 
        <br><br>
    По Уфе: <input name="POKA NET" />
        <br><br>
        По республике Башкортостан: <input name="POKA NET" />
        <br><br>
        Самовывоз: <input name="POKA NET" />
        <br><br>       
    <input type="submit" value="Применить изменения" />
    <br><br>
    </form>
    	<a href="/Calculate/CoefficientJSP.jsp">Очистить всё</a>
    <p>${message}</p>
</body>
</html>