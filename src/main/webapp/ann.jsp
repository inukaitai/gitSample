<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/ann.css" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<title>連絡事項</title>
</head>
<body>
	<jsp:include page="nav2.jsp" />
		<h3 class="platform-title">Platform For Teachers</h3>
		<div class="all">
			<div classs="table-background">	
				<div class="all">
				<h1>連絡事項</h1>
				<form action="DeleteAnn" method="post">
				<c:forEach var="ann" items="${sessionScope.anns}">
				<!-- リストから取り出す -->
				<input type="checkbox" name="id" value="${ann.id}">
				<p>${ann.content}</p>
				<hr>
				</c:forEach>
				<div class="button-container">
				<input type="submit" value="削除" class="btn btn-secondary">
				</div>
				<button type="button" class="btn btn-success" ><a href="annEdit.jsp" class="text-white">追加</a></button>
				<br>
				<!-- <button type="button" class="btn btn-primary top-button"><a href="nav.jsp"></a>トップ画面へ</button> -->
				</form>
				
			</div>
		</div>	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>

