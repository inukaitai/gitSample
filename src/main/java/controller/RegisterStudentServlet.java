package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.StudentListDAO;
import dto.AccountDTO;
import dto.StudentListDTO;

@WebServlet("/RegisterStudentServlet")
public class RegisterStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("./registerStudent.jsp");
		//登録に失敗したときに同じページへ飛ぶようにしている
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String studentId = request.getParameter("student_id");
		String studentName = request.getParameter("student_name");
		System.out.println("確認1" + studentId + studentName);
		/*String createdAt = request.getParameter("createdAt");*///Date型なので自動で入る？
		
		String attendance = request.getParameter("attendance");
		if (attendance == null || attendance.isEmpty()) {
			attendance = "";
		}
		String condition = request.getParameter("condition");
		if (condition == null || condition.isEmpty()) {
			condition = "";
		}
		String memo = request.getParameter("memo");
		if (memo == null || memo.isEmpty()) {
			memo = "";
		}
		System.out.println("確認２");
		boolean studentIdInvalid = studentId == null || studentId.isEmpty();
		boolean studentNameInvalid = studentName == null || studentName.isEmpty();
		/*boolean attendanceInvalid = attendance == null || attendance.isEmpty();
		boolean conditionInvalid = condition == null || condition.isEmpty();*/
		//メモはNUＬＬで問題ない
		/*		if (studentIdInvalid || studentNameInvalid || attendanceInvalid || conditionInvalid) {*/
		if (studentIdInvalid || studentNameInvalid) {
			String registerError = "データが入っていません";
			request.setAttribute("registerError", registerError);
			RequestDispatcher rd = request.getRequestDispatcher("./studentList.jsp");
			rd.forward(request, response);
			System.out.println("確認3");
		} else {
			System.out.println("確認4");
			
			// ６７－７０を、user_idでコンテンツ分けするために付け加え.セッションからログインユーザーの user_id を取得　10/4
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
				String attendance1 = request.getParameter("attendance_" + student.getId());
				String condition1 = request.getParameter("status_" + student.getId());
				String memo1 = request.getParameter("memo_" + student.getId());
				
				//出席・健康情報を更新するためDTOに設定
				student.setAttendance(attendance1);
				student.setCondition(condition1);
				student.setMemo(memo1);
				
				//DBに反映する更新処理
				dao.updateAttendanceAndCondition(student);
			}
			StudentListDTO sdto = new StudentListDTO();// 新しく生徒情報DTOを作成
			sdto.setUserId(userId);//ユーザIDもDTOに追加　
			sdto.setStudentId(studentId);
			sdto.setStudentName(studentName);// フォームのデータをDTOに追加
			sdto.setAttendance(attendance);
			sdto.setCondition(condition);
			sdto.setMemo(memo);
			new StudentListDAO().insert(sdto);// dao.insertでDBに挿入

			ArrayList<StudentListDTO> lists = new StudentListDAO().selectByUserId(userId); // 既存のお知らせ
			System.out.println(lists);
			request.getSession().setAttribute("lists", lists);//セッションスコープに登録することで記録が残る
			System.out.println(request.getSession().getAttribute("lists"));
			response.sendRedirect("./studentList.jsp");
			//登録後に生徒名簿画面へ遷移
		}
	}

}
