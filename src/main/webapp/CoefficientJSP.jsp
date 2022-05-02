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
	<form action="${pageContext.request.contextPath}/ChangeCoef" method="POST">
    <strong>Количество материала(м2) для определенного вида мебели</strong> 
    <br><br>
    Банкетка маленькая: <input type="number" placeholder="1.0" step="0.01" min="0" name="tipMebel1" value=${tipMebel1}> 
    <br><br>
    Банкетка средняя: <input type="number" placeholder="1.0" step="0.01" min="0" name="tipMebel2" value=${tipMebel2}> 
    <br><br>
    Банкетка большая: <input type="number"placeholder="1.0" step="0.01" min="0" name="tipMebel3" value=${tipMebel3}> 
    <br><br>
    Диван маленький: <input type="number"placeholder="1.0" step="0.01" min="0" name="tipMebel4" value=${tipMebel4}> 
    <br><br>
    Диван средние: <input type="number" placeholder="1.0" step="0.01" min="0"name="tipMebel5" value=${tipMebel5}> 
    <br><br>
    Диван большой: <input type="number" placeholder="1.0" step="0.01" min="0"name="tipMebel6" value=${tipMebel6}> 
    <br><br>
        Кресло маленькое: <input type="number" placeholder="1.0" step="0.01" min="0"name="tipMebel7" value=${tipMebel7}> 
    <br><br>
    Кресло среднее:<input type="number" placeholder="1.0" step="0.01" min="0"name="tipMebel8" value=${tipMebel8}> 
    <br><br>
    Кресло большое: <input type="number" placeholder="1.0" step="0.01" min="0"name="tipMebel9" value=${tipMebel9}> 
    <br><br>
        Стул маленький: <input type="number"placeholder="1.0" step="0.01" min="0" name="tipMebel10" value=${tipMebel10}> 
    <br><br>
    Стул средний: <input type="number" placeholder="1.0" step="0.01" min="0"name="tipMebel11" value=${tipMebel11}> 
    <br><br>
    Стул большой: <input type="number" placeholder="1.0" step="0.01" min="0"name="tipMebel12" value=${tipMebel12}> 
    <br><br>
    <strong>Стоимость материала за м2:</strong> 
    <br><br>
    Ткань низшего качества: <input type="number"placeholder="1.0" step="0.01" min="0"name="tipCloth1" value=${tipCloth1}> 
    <br><br>
    Ткань среднего качества: <input type="number"placeholder="1.0" step="0.01" min="0" name="tipCloth2" value=${tipCloth2}> 
    <br><br>
    Ткань высшего качества: <input type="number" placeholder="1.0" step="0.01" min="0"name="tipCloth3" value=${tipCloth3}>  
    <br><br>
        Экокожа низшего качества:<input type="number" placeholder="1.0" step="0.01" min="0"name="tipCloth4" value=${tipCloth4}> 
    <br><br>
    Экокожа среднего качества: <input type="number" placeholder="1.0" step="0.01" min="0"name="tipCloth5" value=${tipCloth5}> 
    <br><br>
    Экокожа высшего качества:<input type="number" placeholder="1.0" step="0.01" min="0"name="tipCloth6" value=${tipCloth6}> 
    <br><br>
        Натуральная кожа низшего качества: <input type="number"placeholder="1.0" step="0.01" min="0" name="tipCloth7" value=${tipCloth7}> 
    <br><br>
    Натуральная кожа среднего качества:  <input type="number"placeholder="1.0" step="0.01" min="0" name="tipCloth8" value=${tipCloth8}> 
    <br><br>
    Натуральная кожа высшего качества: <input type="number" placeholder="1.0" step="0.01" min="0"name="tipCloth9" value=${tipCloth9}> 
    <br><br>
        Кожзам низшего качества: <input type="number"placeholder="1.0" step="0.01" min="0"name="tipCloth10" value=${tipCloth10}> 
    <br><br>
    Кожзам среднего качества: <input type="number"placeholder="1.0" step="0.01" min="0"name="tipCloth11" value=${tipCloth11}> 
    <br><br>
    Кожзам высшего качества: <input type="number" placeholder="1.0" step="0.01" min="0" name="tipCloth12" value=${tipCloth11}> 
    <br><br>
	<strong>Коэфицент стоимости наполнителя:</strong> 
        <br><br>
    ППУ: <input name="tipNap1" type="number" placeholder="1.0" step="0.01" min="0" value=${tipNap1}> 
        <br><br>
        ЛППУ: <input name="tipNap2" type="number" placeholder="1.0" step="0.01" min="0" value=${tipNap2}> 
        <br><br>
	<strong>Стоимость доставки:</strong> 
        <br><br>
    По Уфе: <input name="Delivery1" type="number" placeholder="1.0" step="0.01" min="0" value=${Delivery1}> 
        <br><br>
        По республике Башкортостан: <input name="Delivery2" type="number" placeholder="1.0" step="0.01" min="0" name="Delivery2" value=${Delivery2}> 
        <br><br>
        Самовывоз: <input name="Delivery3" type="number" placeholder="1.0" step="0.01" min="0" name="Delivery3" value=${Delivery3}> 
        <br><br>       
    <input type="submit" type="number" placeholder="1.0" step="0.01" min="0" value="Применить изменения" >
    <br><br>
    <script>
	document.onkeydown = function (e) {
	//return (/[0-9.]/.test(e.key));
		return !(/^[А-Яа-яA-Za-z ,]$/.test(e.key));
	}
	</script> 
    </form>
    	<a href="/Calculate/CoefficientJSP.jsp">Очистить всё</a>
    <p>${message}</p>
</body>
</html>