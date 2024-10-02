<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>児童新規登録</title>
</head>
<body>

<%-- <p>${sdto.studentId}</p>
<p>${sdto.studentName}</p>
<p>${sdto.attendance}</p>
<p>${sdto.condition}</p>
<p>${sdto.memo}</p> --%>

<button><a href="./registerStudent.jsp">児童新規登録</a></button>

<%-- <c:forEach var="studentList" items="${sessionScope.sdto}"> --%>
<table border=1>
	<tr>
		<th>⚪︎年⚪︎組</th><th>番号</th><th>名前</th><th>健康状態</th>
	</tr>
	<tr>
	<th>
		<input type ="radio" name="出席状況" value="出席">出席
		<input type ="radio" name="出席状況" value="欠席">欠席
		<input type ="radio" name="出席状況" value="遅刻">遅刻
		<input type ="radio" name="出席状況" value="早退">早退
	</th>
	<th><p>${sdto.studentId}</p></th>
	<th><p>${sdto.studentName}</p></th>
	<th>
		<input type ="radio" name="健康状態" value="元気">元気
		<input type ="radio" name="健康状態" value="普通">普通
		<input type="radio" name="健康状態" value="その他">その他
		<input type="text" placeholder="症状があれば記載"</th>
	</tr>
<%-- </c:forEach> --%>	

	
</body>
</html>

