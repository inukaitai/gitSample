package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.StudentListDTO;

public class StudentListDAO {
	private Connection conn;
	
	public StudentListDTO selectByStudentId(String studentId) {
		StudentListDTO dto = null;
		conn = null;
		ResultSet rs;
		PreparedStatement ps;
		try {
			conn = DBConnection.getConnection();
			String sql = "SELECT * FROM studentList WHERE student_id = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, studentId);
			rs = ps.executeQuery();
			if (rs.next()) {
				dto = new StudentListDTO (
						rs.getString("student_id"),
						rs.getString("user_id"),
						rs.getString("student_name"),
						rs.getDate("created_at"),
						rs.getString("attendance"),
						rs.getString("condition"),
						rs.getString("memo"));
			}
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}return dto;
	}
	public int insert(StudentListDTO dto) {//
		conn = null;
		try {
			conn=DBConnection.getConnection();
//userIdを付け加える 17:23
			String sql = "INSERT INTO studentList(student_id,student_name) VALUES (?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
//			ps.setString(1,dto.getUserId());
			ps.setString(1, dto.getStudentId());
			ps.setString(2, dto.getStudentName());
			/*ps.setString(3, dto.getAttendance());
			ps.setString(4, dto.getCondition());
			ps.setString(5, dto.getMemo());*/
			int result = ps.executeUpdate();
			if (result == 0) {
				System.out.println("DBに挿入できませんでした");
			} else {
				System.out.println("DBにデータが挿入されました");
			}
			return result;
			/*result = ps.executeUpdate();*/
			
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
		return 0;
	}

}
