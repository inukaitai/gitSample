package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.StudentListDAO;
import dto.StudentListDTO;

@WebServlet("/DeleteStudent")
public class DeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String[] ids = request.getParameterValues("id");
		for (String idStr : ids) {
			int id = Integer.parseInt(idStr);
			new StudentListDAO().deleteById(id);
		}
		List<StudentListDTO> studentList = new StudentListDAO().selectAll();
		HttpSession session = request.getSession();
		session.setAttribute("lists", studentList);

		response.sendRedirect("studentList.jsp");
	}

}
