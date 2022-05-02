<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@page import="kurs24.CalcSum"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Итоговая стоимость</title>
</head>
<body>
<h1>Итоговая стоимость</h1>
	<p><strong>Итого:</strong> ${result}</p>
	
	<a href="${pageContext.request.contextPath}/Check.pdf"> Открыть PDF-файл</a>
<a href="${pageContext.request.contextPath}/Check.pdf" download> Скачать PDF-файл</a>
	${error}
</body>
</html>