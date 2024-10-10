package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.StudentListDTO;

public class StudentListDAO {
	private Connection conn;
	
    // user_id に基づいて学生リストを取得 するために追加した　（１４行から４９行まで）
    public ArrayList<StudentListDTO> selectByUserId(String userId) {
        ArrayList<StudentListDTO> list = new ArrayList<>();
        conn = null;
        try {
            conn = DBConnection.getConnection();
            String sql = "SELECT * FROM studentList WHERE user_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, userId); // ログイン中のユーザーの user_id でフィルタリング
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	System.out.println("ユーザーIdチェック"+ rs.getString("id"));
                StudentListDTO dto = new StudentListDTO(
                        rs.getInt("id"),
                        rs.getString("user_id"),
                        rs.getString("student_id"),
                        rs.getString("student_name"),
                        rs.getDate("created_at"),
                        rs.getString("attendance"),
                        rs.getString("condition"),
                        rs.getString("memo")
                );
                list.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    // ここより上をuser_idでコンテンツを分けるために付け加えた　10/4
	
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
						rs.getInt("id"),
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
	public ArrayList<StudentListDTO> selectAll() {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<StudentListDTO> list = new ArrayList<>();
		conn = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "SELECT * FROM studentList";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				StudentListDTO dto = new StudentListDTO(
						rs.getInt("id"),
						rs.getString("user_id"),
						rs.getString("student_id"),
						rs.getString("student_name"),
						rs.getDate("created_at"),
						rs.getString("attendance"),
						rs.getString("condition"),
						rs.getString("memo"));
						list.add(dto);
						System.out.println("check1");
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
		}
		return list;
	}
	
	public int insert(StudentListDTO dto) {//
		conn = null;
		try {
			conn=DBConnection.getConnection();
//userIdを付け加える 17:23
			String sql = "INSERT INTO studentList(user_id, student_id,student_name) VALUES (?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,dto.getUserId());
			ps.setString(2, dto.getStudentId());
			ps.setString(3, dto.getStudentName());
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
	
public int deleteById(int id) {
	conn = null;
	int result = 0;
	try {
		conn = DBConnection.getConnection();
		String sql = "DELETE FROM studentList WHERE id =?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		result = ps.executeUpdate();
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
	}
	return result;
}

public int updateAttendanceAndCondition(StudentListDTO student) {
	// TODO 自動生成されたメソッド・スタブ
	conn = null;
	int result = 0;
	
	try {
		conn = DBConnection.getConnection();
		String sql = "UPDATE studentList SET attendance = ?, condition = ?, memo = ?, created_at = ? WHERE id = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,student.getAttendance());
		ps.setString(2,student.getCondition());
		ps.setString(3,student.getMemo());
		// ps.setDate(4,Date.valuesOf(student.getCreatedAt()));
		ps.setDate(4,student.getCreatedAt());
		ps.setInt(5,student.getId());
		
		result = ps.executeUpdate();
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
	}
	return result;
}
}
