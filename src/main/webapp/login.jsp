<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/login.css" />
<%--<link rel="stylesheet" type="text/css" href="../platformForTeachers/src/main/webbapp/style.css"> --%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<title>Login for a platform for teachers</title>
</head>
<body>
	<h3 class="platform-title">Platform For Teachers</h3>
	<div class="container d-flex justify-content-center align-items-center vh-100">
		<div class="login-container text-center">
			<h1 class="mb-4">ログイン</h1>
			<form action="LoginController" method="post">
				<div class="mb-3">
					<input type="text" placeholder="ユーザーIDを入力" name="user_id"><br>
					<input type="password" placeholder="パスワードを入力"name="pass"><br>
				</div>
				<br>
				<button type="submit" class="btn login-btn w-100 mb-3">ログイン</button><br>
				<p class="text-white">または</p>
				<button>
					<a href="./registerUser.jsp" class="text-decoration-none text-blue">新規登録</a>
				</button>
				<c:if test="${not empty errorMsgList}">
					<div style="color: red;">
						<c:forEach var="msg" items="${errorMsgList}">
							<p>${msg}</p>
						</c:forEach>
					</div>
				</c:if>
			</form>
			<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
		</div>
	</div>	
</body>
</html>