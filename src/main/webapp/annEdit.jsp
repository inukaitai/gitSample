<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>連絡事項　編集画面</h1>
<%-- 
<from action="AnnEditServlet" method="post">
--%>

<button>記入欄を追加</button><br>//javascriptの機能で記入欄を増やす

<form action="AnnServlet" method="post">
		
	<input type="text" placeholder="共有事項を記入" name="content"><br><br>
	<input type="submit" value="共有">
</form>

		
</body>
</html>