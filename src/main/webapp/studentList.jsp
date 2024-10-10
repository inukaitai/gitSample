<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/studentList.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<title>児童新規登録</title>
</head>
<body>
	<jsp:include page="nav2.jsp" />
	<h3 class="platform-title">Platform For Teachers</h3>
	<div class="all">
		<div class="table-background">	
				<button>
					<a href="./registerStudent.jsp">児童新規登録</a>
				</button>
				<table class="table">
						<form action="StudentActionController" method="post">
							<thead>
								<tr>
									<th scope="col"></th>
									<th scope="col">番号</th>
									<th scope="col">名前</th>
									<th scope="col">出席確認</th>
									<th scope="col">健康状態</th>
								</tr>
							</thead>
							<tbody class="table-group-divider">
								<c:forEach var="list" items="${sessionScope.lists}">
									<tr>
										<td scope="row"><input type="checkbox" name="id" value="${list.id}"</td>
										<td><p>${list.studentId}</p></td>
										<td><p>${list.studentName}</p></td>
									<td>
										<label><input type="radio" name="attendance_${list.id}" value="出席">出席</label>
										<label><input type="radio" name="attendance_${list.id}" value="欠席">欠席</label>
										<labal><input type="radio"	name="attendance_${list.id}" value="遅刻">遅刻</label>
										<label><input type="radio" name="attendance_${list.id}" value="早退">早退</label>
									</td>
									<td>
										<label><input type="radio" name="status_${list.id}" value="元気">元気</label>
										<label><input type="radio" name="status_${list.id}" value="普通">普通 </label>
										<label><input type="radio" name="status_${list.id}" value="その他">その他</label>
										<label><input type="text" name="memo_${list.id}" placeholder="症状があれば記載"></label>
									</td>
								</tr>
							</c:forEach>
						</tbody>
				</table><br>
				<p>下のボタンで必要な処理を行ってください。</p>
				<input type="radio" name="type" value="del">選択した学生を削除
				<input type="radio" name="type" value="report" checked = "checked">今日の出席確認<br><br>
				<input type="submit" value="送信"><br><br>
			<!-- 	<button>
					<a href="./confirmSendStudentInfo.jsp">出席のデータを確認</a>
				</button><br><br> -->
					</form>
				<a href="nav.jsp" >メイン画面へ</a>
			</div>	
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>

