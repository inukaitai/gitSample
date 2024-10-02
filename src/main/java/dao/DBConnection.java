package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//このファイルには、DBに接続するための処理をメインで書く。そして、このファイルとこれから作るDAOファイルを
//Connection conn = null;
//conn = DBConnection.getConnection();
//で繋げることで、DBのデータをJSPファイル内で使用することができる
public class DBConnection {
	private static final String DB_URL = "jdbc:postgresql://localhost:5432/teacher_app";
	private static final String DB_USER = "postgres";
	private static final String DB_PASS = "password";
	
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
		return conn;
	}

}
