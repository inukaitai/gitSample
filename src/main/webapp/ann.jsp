<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>連絡事項</title>
</head>
<body>
<h1>連絡事項</h1>
<c:forEach var="ann" items="${sessionScope.anns}">
<!-- リストから取り出す -->
<p>${ann.content}</p>
</c:forEach>
<button><a href="annEdit.jsp">追加</a></button>
<br>
<button><a href="nav.jsp">トップ画面へ</a></button>

</body>
</html>

