package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AccountDAO;
import dto.AccountDTO;


@WebServlet("/RegisterUserServlet")
public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("./registerUser.jsp");
		//登録に失敗したときに同じページへ飛ぶようにしている
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("userId");
		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		String school = request.getParameter("school");
		String pass = request.getParameter("pass");
		//データが入っているかチェックする
		boolean userIdInvalid = userId == null || userId.isEmpty();
		boolean nameInvalid = name == null || name.isEmpty();
		boolean mailInvalid = mail == null || mail.isEmpty();
		boolean schoolInvalid = school == null || school.isEmpty();
		boolean passInvalid = pass == null || pass.isEmpty();
		
		if (userIdInvalid || nameInvalid || mailInvalid || schoolInvalid || passInvalid) {
			String registerError = "データが入っていません";
			request.setAttribute("registerError", registerError);
			RequestDispatcher rd = request.getRequestDispatcher("./registerUser.jsp");//register.jspにフォワードする
			rd.forward(request, response);
		} else {
			AccountDTO dto = new AccountDTO();//新しいAccount
			dto.setUserId(userId);
			dto.setName(name);
			dto.setMail(mail);
			dto.setSchool(school);
			dto.setPass(pass);
			AccountDAO dao = new AccountDAO();
			dao.insert(dto);//INSERT文の実行
			response.sendRedirect("./login.jsp");//登録したのでログイン画面へ
		}
	}

}
