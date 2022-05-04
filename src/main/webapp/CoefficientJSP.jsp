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
    Банкетка маленькая: <input type="number" step="0.1" min="0" name="tipMebel1" value=${tipMebel1} required> 
    <span class="validity"></span>
    <br><br>
    Банкетка средняя: <input type="number" step="0.1" min="0" name="tipMebel2" value=${tipMebel2} required> 
    <br><br>
    Банкетка большая: <input type="number" step="0.1" min="0" name="tipMebel3" value=${tipMebel3} required> 
    <br><br>
    Диван маленький: <input type="number" step="0.1" min="0" name="tipMebel4" value=${tipMebel4} required> 
    <br><br>
    Диван средние: <input type="number" step="0.1" min="0"name="tipMebel5" value=${tipMebel5} required> 
    <br><br>
    Диван большой: <input type="number" step="0.1" min="0"name="tipMebel6" value=${tipMebel6} required> 
    <br><br>
        Кресло маленькое: <input type="number" step="0.1" min="0" name="tipMebel7" value=${tipMebel7} required> 
    <br><br>
    Кресло среднее:<input type="number" step="0.1" min="0" name="tipMebel8" value=${tipMebel8} required> 
    <br><br>
    Кресло большое: <input type="number" step="0.1" min="0" name="tipMebel9" value=${tipMebel9} required> 
    <br><br>
        Стул маленький: <input type="number" step="0.1" min="0"  name="tipMebel10" value=${tipMebel10} required> 
    <br><br>
    Стул средний: <input type="number" step="0.1" min="0" name="tipMebel11" value=${tipMebel11} required> 
    <br><br>
    Стул большой: <input type="number" step="0.1" min="0" name="tipMebel12" value=${tipMebel12} required> 
    <br><br>
    <strong>Стоимость материала за м2:</strong> 
    <br><br>
    Ткань низшего качества: <input type="number" step="0.1" min="0" name="tipCloth1" value=${tipCloth1} required> 
    <br><br>
    Ткань среднего качества: <input type="number" step="0.1" min="0" name="tipCloth2" value=${tipCloth2} required> 
    <br><br>
    Ткань высшего качества: <input type="number" step="0.1" min="0" name="tipCloth3" value=${tipCloth3} required>  
    <br><br>
        Экокожа низшего качества:<input type="number" step="0.1" min="0" name="tipCloth4" value=${tipCloth4} required> 
    <br><br>
    Экокожа среднего качества: <input type="number" step="0.1" min="0" name="tipCloth5" value=${tipCloth5} required> 
    <br><br>
    Экокожа высшего качества:<input type="number" step="0.1" min="0"name="tipCloth6" value=${tipCloth6} required> 
    <br><br>
        Натуральная кожа низшего качества: <input type="number" step="0.1" min="0" name="tipCloth7" value=${tipCloth7} required> 
    <br><br>
    Натуральная кожа среднего качества:  <input type="number"  step="0.1" min="0" name="tipCloth8" value=${tipCloth8} required> 
    <br><br>
    Натуральная кожа высшего качества: <input type="number" step="0.1" min="0" name="tipCloth9" value=${tipCloth9} required> 
    <br><br>
        Кожзам низшего качества: <input type="number" step="0.1" min="0" name="tipCloth10" value=${tipCloth10} required> 
    <br><br>
    Кожзам среднего качества: <input type="number" step="0.1" min="0" name="tipCloth11" value=${tipCloth11} required> 
    <br><br>
    Кожзам высшего качества: <input type="number" step="0.1" min="0" name="tipCloth12" value=${tipCloth11} required> 
    <br><br>
	<strong>Коэфицент стоимости наполнителя:</strong> 
        <br><br>
    ППУ: <input name="tipNap1" type="number" step="0.1" min="1" value=${tipNap1} required> 
        <br><br>
        ЛППУ: <input name="tipNap2" type="number" step="0.1" min="1" value=${tipNap2} required> 
        <br><br>
	<strong>Стоимость доставки:</strong> 
        <br><br>
    По Уфе: <input name="Delivery1" type="number" step="0.1" min="0" value=${Delivery1} required> 
        <br><br>
        По республике Башкортостан: <input name="Delivery2" type="number"  step="0.1" min="0" value=${Delivery2} required> 
        <br><br>
        Самовывоз: <input name="Delivery3" type="number" step="0.1" min="0"  value=${Delivery3} required> 
        <br><br>       
    <input type="submit" value="Применить изменения" >
    <br><br>
    <script>
	document.onkeydown = function (e) {
	//return (/[0-9.]/.test(e.key));
		return !(/^[А-Яа-яA-Za-z ,]$/.test(e.key));
		
	}
	</script> 
    </form>
    <p>${message}</p>
</body>
</html>