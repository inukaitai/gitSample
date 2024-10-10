package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AnnDAO;
import dto.AnnDTO;


@WebServlet("/DeleteAnn")
public class DeleteAnn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] ids = request.getParameterValues("id");
		if (ids != null) {
			for (String idStr : ids) {
			int id = Integer.parseInt(idStr);
			new AnnDAO().deleteById(id);
			}
		}
		ArrayList<AnnDTO> anns = new AnnDAO().selectAll();
		HttpSession session = request.getSession();
		session.setAttribute("anns", anns);// 既存のお知らせ
//		request.getSession().setAttribute("anns", anns);//セッションスコープに登録することで記録が残る
		response.sendRedirect("ann.jsp");
	}

}
//
//		for (String idStr : ids) {
//			int id = Integer.parseInt(idStr);
//			new StudentListDAO().deleteById(id);
//		}
//		List<StudentListDTO> studentList = new StudentListDAO().selectAll();
//		HttpSession session = request.getSession();
//		session.setAttribute("lists", studentList);
//
//		response.sendRedirect("studentList.jsp");
//	}