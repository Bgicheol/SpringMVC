<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문조사 양식</title>
</head>
<body>
	<h3>설 문 조 사</h3>
	<form action="./" method="POST">
		당신의 이름은 무엇입니까? <br>
		<input type="text" name="name" />
		당신의 나이는 몇 살입니까? <br>
		만 <input type="number" name="age" />세 <br>
		<input type="submit" />
	</form>
	<h3>설 문 조 사2</h3>
	<form action="./2" method="POST">
		당신의 이름은 무엇입니까? <br>
		<input type="text" name="name" value="박민우"/>
		당신의 나이는 몇 살입니까? <br>
		만 <input type="number" name="age" value="33"/>세 <br>
		<input type="submit" />
	</form>
	
	<h3>설 문 조 사3</h3>
	<form action="./3" method="POST">
		당신의 이름은 무엇입니까? <br>
		<input type="text" name="name" value="최영희"/>
		당신의 나이는 몇 살입니까? <br>
		만 <input type="number" name="age" value="333"/>세 <br>
		<input type="submit" />
	</form>
</body>
</html>