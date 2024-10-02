<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>${requestScope.registerError}</p>
	<form action="RegisterStudentServlet" method="post">
	<h1>児童新規登録</h1>
	<ul>
		<!-- <li><p>先生のユーザーId:<input type="text" name="userId"></p></li> -->
		<li><p>児童名:<input type="text" name="student_name"></p></li>
		<li><p>学籍番号:<input type="text" name="student_id"></p></li>
		
	</ul>
		<input type="submit" value="登録">
	</form>	
	<%-- 
	<button>
		<a href="./RegisterUserServlet.java" value="登録">登録</a>
	</button><br><br>
	--%>
	
	<p>登録後は改めて児童名簿へ移行してください</p>
	
	<a href="./studentList.jsp" value="ログイン">児童名簿へ</a>
</body>
</html>

	<!-- 'user01',
	'番号１番',
	'あああ',
	'',
	'',
	'元気いっぱい' 
	
		this.studentId = studentId;
		this.studentName = studentName;
		this.createdAt = createdAt;
		this.attendance = attendance;
		this.condition = condition;
		this.memo = memo;
	-->