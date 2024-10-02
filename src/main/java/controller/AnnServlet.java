package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AnnDAO;
import dto.AnnDTO;

@WebServlet("/AnnServlet")
public class AnnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// フォームの中に入れたお知らせをDBに追加
		request.setCharacterEncoding("UTF-8");
		String content = request.getParameter("content");
		AnnDTO dto = new AnnDTO();
		dto.setContent(content);
		AnnDAO dao = new AnnDAO();
		dao.insert(dto);
		
		ArrayList<AnnDTO> anns = new AnnDAO().selectAll(); // 既存のお知らせ
		request.getSession().setAttribute("anns", anns);//セッションスコープに登録することで記録が残る
//		RequestDispatcher rd = request.getRequestDispatcher("ann.jsp");
//		rd.forward(request, response);
		response.sendRedirect("ann.jsp");
	}

}
