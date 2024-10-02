<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<title>Navigation</title>
<style>
.divN1 {
width: 270px;
height: 100%;
background-color: #EDF7FF;
position: fixed;
left: 0;
top: 0;
padding: 5px;
border-right: 0px solid #ddd;
}
</style>
</head>
<body>
<div class = "divN1" id = "js-divN1">
	<h1 id ="js-h1N2">ようこそ${sessionScope.Account.name}先生</h1>
<br>
	<div id="js-divN3">
		<h2 id = "js-h2N4">
			<ul>
				<li><a href ="ann.jsp">連絡事項</a></li>
				<li><a href ="studentList.jsp">児童名簿</a></li>
				<li><a href ="todoList.jsp">Todoリスト</a></li>
				<li><a href ="#">年間計画</a></li>
				<li><a href ="#">学級便り</a></li>
				<li><a href ="#">時間割</a></li>
				<li><a href ="#">カレンダー</a></li>
			</ul>
		</h2>
	</div>
<br>
	<div id = "js-divN5">
		<h3 id ="js-h3N6">
			<ul>
				<li><a href ="#">NEWS：</a></li>
				<li><a href ="＃">天気</a></li>
				<li><a href="logout.jsp" >ログアウト</a></li>
			</ul>
		</h3>
	</div>
</div>
<script src="./js/nav.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>