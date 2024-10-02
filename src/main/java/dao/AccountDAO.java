//DBConnectionのDAOファイルを作る必要があり、それを作れば、全てのDAOファイルとDBを繋げることができる
//かぶらないようにDBでデータを引っ張りたいときにはユニークキーを持つ値で引っ張ってくる
//かぶって欲しくない値は全てユニークキーにしたほうがいい
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.AccountDTO;

// Account テーブルに接続して情報を操作するためのDAO
//　ユーザIDで絞り込み
public class AccountDAO {
	public AccountDTO selectByUserId(String userId) {
		// SQL の生成
		AccountDTO dto = null;
		Connection conn = null; //DBの接続情報を入れる変数
		
		//DBと接続するコードを書く
		//「PreparedStatement」 でＳＱＬ文を受け取って解析し、値があればいつでも実行できる状態にする
		try {
			conn = DBConnection.getConnection();
			String sql = "SELECT * FROM account WHERE user_id =?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userId);//１番目の「?」には「userId」が入るということ
			//ＩＮＴＥＲＧＥＲ型にする必要があるので、「setInt」メソッドを使用することで、StringからInt型へ型変換することができる
			//実行
			ResultSet rs = ps.executeQuery();//「ResultSet」はSQLの実行結果を格納するためのインターフェース
			//「rs」という変数を作り、「executeQuery」で実行した結果を格納する
			if (rs.next()) {//if文で実行結果をデータがある限り取得する //「AccountDTO」を生成
				dto = new AccountDTO();
				dto.setUserId(rs.getString("user_id"));
				dto.setPass(rs.getString("pass"));
				dto.setName(rs.getString("name"));
				dto.setSchool(rs.getString("school"));
				dto.setMail(rs.getString("mail"));
			}
			conn.close();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return dto;
	}
	
	public AccountDTO selectByMail(String mail) {
		AccountDTO dto = null;
		Connection conn = null;
			try {
				conn = DBConnection.getConnection();
				String sql = "SELECT * FROM account WHERE mail = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, mail);
				ResultSet rs = ps.executeQuery();
				if (rs.next()) {
					dto = new AccountDTO();
					dto.setUserId(rs.getString("user_id"));
					dto.setPass(rs.getString("pass"));
					dto.setName(rs.getString("name"));
					dto.setSchool(rs.getString("school"));
					dto.setMail(rs.getString("mail"));
				}
				conn.close();
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			return dto;
	}
//schoolは値がかぶってくるので、ログインの為にデータを引っ張ってくるにはリスクが多すぎる	
//	public AccountDTO selectBySchool(String school) {
//		AccountDTO dto = null;
//		Connection conn = null;
//			try {
//				conn = DBConnection.getConnection();
//				String sql = "SELECT * FROM account WHERE school = ?";
//				PreparedStatement ps = conn.prepareStatement(sql);
//				ps.setString(1, school);
//				ResultSet rs = ps.executeQuery();
//				if (rs.next()) {
//					dto = new AccountDTO();
//					dto.setUserId(rs.getInt("user_id"));
//					dto.setPass(rs.getString("pass"));
//					dto.setName(rs.getString("name"));
//					dto.setSchool(rs.getString("school"));
//					dto.setMail(rs.getString("mail"));
//				}
//				conn.close();
//			} catch (Exception e) {
//				// TODO 自動生成された catch ブロック
//				e.printStackTrace();
//			}
//	return dto;
//}
	
	public int insert(AccountDTO dto) {
		//DBに接続する
		try {
			Connection conn = DBConnection.getConnection();
			String sql = "INSERT INTO account(user_id,name,mail,school,pass) VALUES (?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getUserId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getMail());
			ps.setString(4, dto.getSchool());
			ps.setString(5, dto.getPass());
			int result = 0;
			result = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return 0;


}

}
