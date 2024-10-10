<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>出席のデータ確認画面</title>
</head>
<body>
<form action="SendStudentInfo" method="post">
	<table border=1>
		<!-- <form action ="SendStudentInfo" method="post"> -->
			<form action="DeleteStudent" method="post">
				<tr>
					<th>⚪︎年⚪︎組</th>
					<th>番号</th>
					<th>名前</th>
					<th>　出席確認　　　　</th>
					<th>健康状態</th>
				</tr>
				<c:forEach var="list" items="${sessionScope.lists}">
					<tr>
						<td><input type="checkbox" name="id" value="${list.id}"</td>
						<td><p>${list.studentId}</p></td>
						<td><p>${list.studentName}</p></td>
						<%-- <td><p>${list.attendance}</p></td>
	        			<td><p>${list.condition}</p></td>
	        			<td><p>${list.memo}</p></td> --%>
		
						<td><label><input type="radio" name="attendance_${list.id}" value="出席">出席</label>
							<label><input type="radio" name="attendance_${list.id}" value="欠席">欠席</label> 
							<labal><input type="radio"	name="attendance_${list.id}" value="遅刻">遅刻</label>
							<label><input type="radio" name="attendance_${list.id}" value="早退">早退</label>
						</td>
						
	
						<td><label><input type="radio" name="status_${list.id}" value="元気">元気</label> 
							<label><input type="radio" name="status_${list.id}" value="普通">普通 </label>
							<label><input type="radio" name="status_${list.id}" value="その他">その他</label> 
							<label><input type="text" name="status_${list.id}" placeholder="症状があれば記載"></label>
						</td>
					</tr>
				</c:forEach>
		</table><br>
	<input type="submit" value="出席確認のデータを送信"><br>
</form>
</body>
</html>