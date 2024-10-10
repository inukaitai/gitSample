<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="./css/annEdit.css" />
</head>
<body>
<jsp:include page="nav2.jsp" />
	<h3 class="platform-title">Platform For Teachers</h3>
		<!-- <div class="container d-flex justify-content-center align-items-center vh-100">
			<div class="login-container text-center"> -->
				<div class="all">
					<div class="form-container">
						<h1 class="mb-4">連絡事項　編集画面</h1>
							<form action="AnnServlet" method="post">
								<div class="form-item">	
									<!-- <label for="content">共有事項を記入</label><br> -->
									<input type="text" name="content"><br><br>
								</div>
								<input type="submit" value="共有">
							</form>
					</div>
				</div>
			</div>
		</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>