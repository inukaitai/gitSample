package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AnnDAO;
import dto.AccountDTO;
import service.LoginService;
import validation.MyValidation;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//受け取ったデータを取得してそれをもとにログインチェック
	String userId = request.getParameter("user_id");
	String pass = request.getParameter("pass");
	
	request.removeAttribute("errorMsgList");
	MyValidation validation = new MyValidation();
	//passwordとUser_idのバリデーションを行う
	validation.isBlank("パスワード",pass);
	validation.isBlank("ユーザーId",userId);
	validation.length("パスワード",pass,4,20);
	validation.length("ユーザーId",userId,5,10);
	if(validation.hasErrorMsg()) {
		System.out.println(validation.getErrorMsgList());
		//エラーメッセージをリクエストスコープにセットして、ログイン画面に表示するなどの処理を行う
		request.setAttribute("errorMsgList",validation.getErrorMsgList());
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
		return;
	}
	
	AccountDTO dto = new LoginService().loginCheck(userId,pass);
	if(dto!=null) { // ログイン出来たら
		HttpSession session = request.getSession();
		session.setAttribute("Account", dto);
		// ここにデータ取得処理を書く
		session.setAttribute("anns", new AnnDAO().selectAll());//上でログインしたすぐ後で、session.setAttributeでAnnServletで追加した情報を上書きした状態で取得することができる
		
		response.sendRedirect("nav.jsp");
	}else {
		response.sendRedirect("login.jsp");
	}
	
	} 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		request.setCharacterEncoding("UTF-8");
//		String content = request.getParameter("content");
//		AnnDTO dto = new AnnDTO();
//		dto.setContent(content);
//		AnnDAO dao = new AnnDAO();
//		dao.insert(dto);
//		HttpSession session = request.getSession();
//		session.setAttribute("anns", dto);
//		response.sendRedirect("ann.jsp");
//	ArrayList<AnnDTO> announce = new AnnDAO().selectAll(); // 既存のお知らせ
//	request.setAttribute("announce", announce);
//	RequestDispatcher rd = request.getRequestDispatcher("ann.jsp");
//	rd.forward(request, response);
	}

}
