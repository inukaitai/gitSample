//月後とに連絡事項を表示・追加したいが時間があれば行う

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.AnnDTO;

public class AnnDAO {
	private Connection conn;
	
	public AnnDTO selectById(int id) {
		AnnDTO dto = null;
		conn = null;
		ResultSet rs;
		try {
			conn = DBConnection.getConnection();
			String sql = "SELECT * FROM ann WHERE ann_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
			dto = new AnnDTO(
					rs.getInt("id"),
					rs.getString("content"),
					rs.getTimestamp("open_date")
					);
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
		return dto;
	}
	
	public ArrayList<AnnDTO> selectAll(){
		ArrayList<AnnDTO> list = new ArrayList<>();
		conn = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "SELECT * FROM ann";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				AnnDTO dto = new AnnDTO(
						rs.getInt("id"),
						rs.getString("content"),
						rs.getTimestamp("open_date")
						);
				list.add(dto);
			}
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
		return list;
	}
	
	public int insert(AnnDTO dto) {
		conn = null;
		int result = 0;//アップデート後の値を入れる為の変数
		try {
			conn = DBConnection.getConnection();
			String sql ="INSERT INTO ann(content) VALUES(?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,dto.getContent());
			
			result = ps.executeUpdate();//アップデートの為にresult変数を作った？
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
		return result;
	}
	

}
