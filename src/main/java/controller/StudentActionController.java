package controller;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.StudentListDAO;
import dto.AccountDTO;
import dto.StudentListDTO;


@WebServlet("/StudentActionController")
public class StudentActionController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		//ラジオボタンで選択されたtypeを取得
		String type = request.getParameter("type");
		
		if ("del".equals(type)) {
			//削除処理
			String[] ids = request.getParameterValues("id");
			for (String idStr : ids) {
				int id = Integer.parseInt(idStr);
				new StudentListDAO().deleteById(id);
			}
			HttpSession session = request.getSession();
			String userId = ((AccountDTO)session.getAttribute("Account")).getUserId();
			List<StudentListDTO>studentList = new StudentListDAO().selectByUserId(userId);
			session.setAttribute("lists", studentList);
			response.sendRedirect("studentList.jsp");
			
		} else if ("report".equals(type)) {
			//出席確認
			HttpSession session = request.getSession();
		
			@SuppressWarnings("unchecked")
			ArrayList<StudentListDTO>studentLists = (ArrayList<StudentListDTO>)session.getAttribute("lists");
			
			StudentListDAO dao = new StudentListDAO();
			for (StudentListDTO student : studentLists) {
				String attendance = request.getParameter("attendance_" + student.getId());
				String condition = request.getParameter("status_" + student.getId());
				String memo = request.getParameter("memo_" + student.getId());
				
				student.setAttendance(attendance);
				student.setCondition(condition);
				student.setMemo(memo);
				
				java.util.Date today = new java.util.Date(); // 本日の日付
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String todayStr = sdf.format(today); // 文字列に変換
				student.setCreatedAt(Date.valueOf(todayStr)); // String -> java.sql.Date
				//データベースを更新
				dao.updateAttendanceAndCondition(student);
			}
			
			response.sendRedirect("studentList.jsp");
			}
		
	}

}