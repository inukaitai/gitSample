<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link ref="stylesheet" type="text/css" href="../platformForTeachers/src/main/webbapp/style.css">
<title>Login for a platform for teachers</title>
</head>
<body>
	<form action="LoginController" method="post">
		ユーザーID:<input type="text" placeholder="ユーザーIDを入力" name="user_id"><br>
		パスワード:<input type="password" placeholder="パスワードを入力"name="pass"><br>
		<input type="submit" value="ログイン"><br>
		<button>
		<a href="./registerUser.jsp" value="新規登録">新規登録</a>
		</button>
		<c:if test="${not empty errorMsgList}">
		<div style="color: red;">
		<c:forEach var="msg" items="${errorMsgList}">
		<p>${msg}</p>
		</c:forEach>
		</div>
		</c:if>
	</form>
</body>
</html