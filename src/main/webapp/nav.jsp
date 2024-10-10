<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/nav.css" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<title>Navigation</title>
</head>
<body>
<div class = "divN1" id = "js-divN1">
	<h1 id ="js-h1N2">ようこそ${sessionScope.Account.name}先生</h1>
<br>
<br>
	<div id="js-divN3">
		<h2 id = "js-h2N4">
			<ul>
				<li><a href ="ann.jsp">連絡事項</a></li>
				<li><a href ="studentList.jsp">児童名簿</a></li>
				<li><a href ="todoList.jsp">To doリスト</a></li>
				<li><a href ="#">年間計画</a></li>
				<li><a href ="#">学級便り</a></li>
				<li><a href ="#">時間割</a></li>
				<li><a href ="#">カレンダー</a></li>
			</ul>
		</h2>
	</div>
<br>
<br>
	<div id = "js-divN3">
		<h3 id ="js-h2N4">
			<ul>
				<li><a href ="#">NEWS</a></li>
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





<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="./css/nav.css" />
<title>Navigation</title>
</head>
<body>
<jsp:include page="nav2.jsp" />
	<!-- <h3 class="platform-title">Platform For Teachers</h3> -->
<div class = "divN1" id = "js-divN1">
	<h1 id ="js-h1N2">ようこそ${sessionScope.Account.name}先生</h1>
<br>
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
<br>
	<div id = "js-divN3">
		<h3 id ="js-h2N4">
			<ul>
				<li><a href ="#">NEWS</a></li>
				<li><a href ="#">天気</a></li>
				<li><a href="logout.jsp" >ログアウト</a></li>
			</ul>
		</h3>
	</div>
</div>
<script src="./js/nav.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html> --%>

<%-- .body{
	background-image: url('../img/sky.jpg'); /* 背景画像 */
	background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
    background-attachment: fixed; /* ページをスクロールしても背景を固定 */
    height: 100vh;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center; /* 水平方向に中央寄せ */
    align-items: flex-start; /* 垂直方向に中央寄せ */
 	padding-top: 2cm 0 0 0;/* 上に2cmのパディングを追加 */
} --%>