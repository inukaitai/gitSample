<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<title>TODO リスト</title>
</head>
<body class="bg-light">
<div class="container w-75">
<h1 class="text-center text-info my-4">TODO</h1>
<form id="form" class="my-4">
<input type="text" id="input" class= "from-control" placeholder="todoを入力" autocomplete="off">
</form>
<ul class="list-group text-secondary" id="ul"></ul>
</div>
<script src="./js/todoList.js"></script>
</body>
</html>