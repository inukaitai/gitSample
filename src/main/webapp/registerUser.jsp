<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規登録</title>
</head>
<body>
<h1>新規登録</h1>
	<p>${requestScope.registerError}</p>
	<!-- 登録中にエラーを出したらここに表示される -->
	<form action="RegisterUserServlet" method="post">
	<ul>
		<li><p>ユーザーID:<input type="text" name="userId"></p></li>
		<li><p>名前:<input type="text" name="name"></p></li>
		<li><p>メール:<input type="text" name="mail"></p></li>
		<li><p>学校名:<input type="text" name="school"></p></li>
		<li><p>パスワード:<input type="password" name="pass"></p><br></li>
	</ul>
		<input type="submit" value="登録">
	</form>	
	<%-- 
	<button>
		<a href="./RegisterUserServlet.java" value="登録">登録</a>
	</button><br><br>
	--%>
	
	<p>登録後は改めてログインしてください</p>
	
	<a href="./login.jsp" value="ログイン">ログイン</a>
	
	
	
</body>
</html>