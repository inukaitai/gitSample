package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutController")
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Account情報がセッションに保存されている
		//ログイン情報のj破棄が必要
		HttpSession session = request.getSession();
		session.invalidate();//セッション情報の破棄
		response.sendRedirect("logout.jsp");
		//redirect=別のURLへ飛ばす
	}

}
