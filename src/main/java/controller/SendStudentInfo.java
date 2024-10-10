package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.StudentListDAO;
import dto.AccountDTO;
import dto.StudentListDTO;

@WebServlet("/SendStudentInfo")
public class SendStudentInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		AccountDTO account = (AccountDTO) session.getAttribute("Account");
		String userId = account.getUserId();

		//radio buttonから値を取得するためにつけ加えた処理　10/5
		//StudentListDAO をインスタンス化
		StudentListDAO dao = new StudentListDAO();
		@SuppressWarnings("unchecked")
		ArrayList<StudentListDTO> studentLists = (ArrayList<StudentListDTO>)session.getAttribute("lists");
		
		for(StudentListDTO student : studentLists) {
			//各学生の出席状況を取得
			String attendance = request.getParameter("attendance_" + student.getId());
			String condition = request.getParameter("status_" + student.getId());
			String memo = request.getParameter("status_" + student.getId() + "_memo");
			
			//出席・健康情報を更新するためDTOに設定
			student.setAttendance(attendance);
			student.setCondition(condition);
			student.setMemo(memo);
			
			//DBに反映する更新処理
			dao.updateAttendanceAndCondition(student);
		
	}
		response.sendRedirect("studentList.jsp");
	}
}
