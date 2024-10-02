package controller;

import java.io.IOException;

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

//		String userId = request.getParameter("userId");
		//コメントアウトを外したことにより黄色いエラーがでてきた
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
			// this is test.
			/*request.getParameter("./AccountDTO");*/
			HttpSession session = request.getSession();// セッション情報の取得
			AccountDTO dto = (AccountDTO) session.getAttribute("Account");// セッションからアカウント情報を取得する
			String userId = dto.getUserId();// アカウント情報のユーザIDを取得
			//名前の重複エラーがでていたので、名前をuserIdからＡｃｃｏｕｎｔＵｓｅｒＩｄへ変更

			StudentListDTO sdto = new StudentListDTO();// 新しく生徒情報DTOを作成
			sdto.setUserId(userId);//ユーザIDもDTOに追加　
			sdto.setStudentId(studentId);
			sdto.setStudentName(studentName);// フォームのデータをDTOに追加
			sdto.setAttendance(attendance);
			sdto.setCondition(condition);
			sdto.setMemo(memo);
			new StudentListDAO().insert(sdto);// dao.insertでDBに挿入

			request.getSession().setAttribute("sdto", sdto);
			System.out.println("確認5");
			response.sendRedirect("./studentList.jsp");
			//登録後に生徒名簿画面へ遷移
		}
	}

}
