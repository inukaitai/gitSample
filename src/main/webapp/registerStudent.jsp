<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="./css/registerStudent.css" />
<title>Insert title here</title>
</head>
<body>
<jsp:include page="nav2.jsp" />
<h3 class="platform-title">Platform For Teachers</h3>
<div class="all">
	<p>${requestScope.registerError}</p>
	<form action="RegisterStudentServlet" method="post">
	<h1>児童新規登録</h1>
	<div class="form-container">
		<div class="form-item">
			<label for="student_name">児童名</label>
			<input type="text" name="student_name">
		</div>
		<div class="form-item">
			<label for="student_id">学籍番号</label>
			<input type="text" name="student_id">
		</div>
	</div>
	<input type="submit" value="登録">
</form>	
	<%-- 
	<button>
		<a href="./RegisterUserServlet.java" value="登録">登録</a>
	</button><br><br>
	--%>
	
	<p>登録後は改めて児童名簿へ移行してください</p>
	
	<a href="./studentList.jsp" value="ログイン">児童名簿へ</a>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</div>	
</body>
</html>
