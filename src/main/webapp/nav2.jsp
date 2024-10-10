<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<nav class="navbar navbar-light bg-light">
<div class="container-fluid">
<a class="navbar-brand" href="#">ようこそ ${sessionScope.Account.name} 先生</a>
<button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasNavbar" aria-controls="offcanvasNavbar">
<span class="navbar-toggler-icon"></span>
</button>
<!-- オフキャンバスナビ -->
<div class="offcanvas offcanvas-start" tabindex="-1" id="offcanvasNavbar" aria-labelledby="offcanvasNavbarLabel">
<div class="offcanvas-header">
<h5 class="offcanvas-title" id="offcanvasNavbarLabel">メニュー</h5>
<button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
</div>
<div class="offcanvas-body">
<ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
<li class="nav-item">
<a class="nav-link" href="ann.jsp">連絡事項</a>
</li>
<li class="nav-item">
<a class="nav-link" href="studentList.jsp">児童名簿</a>
</li>
<li class="nav-item">
<a class="nav-link" href="todoList.jsp">Todoリスト</a>
</li>
<li class="nav-item">
<a class="nav-link" href="#">年間計画</a>
</li>
<li class="nav-item">
<a class="nav-link" href="#">学級便り</a>
</li>
<li class="nav-item">
<a class="nav-link" href="#">時間割</a>
</li>
<li class="nav-item">
<a class="nav-link" href="#">カレンダー</a>
</li>
</ul>
<!-- 右側に配置されるリンク群 -->
<ul class="navbar-nav">
<li class="nav-item">
<a class="nav-link" href="#">NEWS</a>
</li>
<li class="nav-item">
<a class="nav-link" href="#">天気</a>
</li>
<li class="nav-item">
<a class="nav-link" href="logout.jsp">ログアウト</a>
</li>
</ul>
</div>
</div>
</div>
</nav>