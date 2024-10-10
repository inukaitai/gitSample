<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>ログインページ</title>
  <!-- BootstrapのCSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background-image: url('background.jpg'); /* 背景画像 */
      background-size: cover;
      background-position: center;
      height: 100vh;
    }
    .login-container {
      background-color: rgba(0, 0, 0, 0.75); /* 黒の透明背景 */
      padding: 2rem;
      border-radius: 8px;
      color: white;
    }
    .login-container input {
      margin-bottom: 1rem;
    }
    .login-btn {
      background-color: red;
      color: white;
    }
  </style>
</head>
<body>
  <div class="container d-flex justify-content-center align-items-center vh-100">
    <div class="login-container text-center">
      <h1 class="mb-4">ログイン</h1>
      <form>
        <!-- メールアドレス/電話番号 -->
        <div class="mb-3">
          <input type="text" class="form-control" placeholder="メールアドレスまたは携帯電話番号" required>
        </div>
        <!-- パスワード -->
        <div class="mb-3">
          <input type="password" class="form-control" placeholder="パスワード" required>
        </div>
        <!-- ログインボタン -->
        <button type="submit" class="btn login-btn w-100 mb-3">ログイン</button>
        <p class="text-white">または</p>
        <!-- ログインコードを使用 -->
        <a href="#" class="text-decoration-none text-white mb-3 d-block">ログインコードを使用する</a>
        <!-- パスワードを忘れたリンク -->
        <a href="#" class="text-decoration-none text-white mb-3 d-block">パスワードをお忘れですか?</a>
        <!-- ログインしたままにするチェックボックス -->
        <div class="form-check">
          <input type="checkbox" class="form-check-input" id="stayLoggedIn">
          <label class="form-check-label" for="stayLoggedIn">ログインしたままにする</label>
        </div>
      </form>
    </div>
  </div>

  <!-- BootstrapのJavaScript -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
