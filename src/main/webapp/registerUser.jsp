<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="./css/registerUser.css" />
<%--<link rel="stylesheet" type="text/css" href="../platformForTeachers/src/main/webbapp/style.css"> --%>
<title>新規登録</title>
</head>
<body>


<div class="container d-flex justify-content-center align-items-center vh-100">
	<div class="login-container text-center p-4 bg-white shadow row" style="border-radius: 15px; max-width: 400px; width: 100%;">
		<h5 class="platform-title">Platform For Teachers</h5>
			<h1>新規登録</h1>
			<p>${requestScope.registerError}</p>
				<!-- 登録中にエラーを出したらここに表示される -->
			<form action="RegisterUserServlet" method="post" class="row g-3">
				<div class="col-12">
					<label for="inputUserId" class="form-label">ユーザーID</label>
					<input type="text" name="userId" class="form-control" id="inputUserId">
				</div>
					<!-- <li><p>名前:<input type="text" name="name"></p></li> -->
				<div class="col-12">
				    <label for="inputName" class="form-label">名前</label>
				    <input type="text" name="name" class="form-control" id="inputName">
				</div>
					<!-- <li><p>メール:<input type="text" name="mail"></p></li> -->
				<div class="col-12">
					<label for="inputMail" class="form-label">メール</label>
					<input type="email" name="mail" class="form-control" id="inputMail">
			  	</div>
					<!-- <li><p>学校名:<input type="text" name="school"></p></li> -->
				<div class="col-12">
			    	<label for="inputSchool" class="form-label">学校名</label>
			   		<input type="text" name="school" class="form-control" id="inputSchool" placeholder="○○小学校">
			  	</div>
					<!-- <li><p>パスワード:<input type="password" name="pass"></p><br></li> -->
				<div class="col-12">
			    	<label for="inputPassword" class="form-label">パスワード</label>
			    	<input type="password" name="pass" class="form-control" id="inputPassword">
			  	</div>
			  		
				<div class="col-12">
			    	<button type="submit" value="登録" class="btn btn-primary">登録</button>
			  	</div>
					<!-- <input type="submit" value="登録"> -->
			</form>	
			<p>登録後は改めてログインしてください</p>
			<a href="./login.jsp" value="ログイン">ログイン</a>
	</div>
</div>			
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
