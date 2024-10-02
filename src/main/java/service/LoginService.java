package service;

import dao.AccountDAO;
import dto.AccountDTO;

public class LoginService{
		public AccountDTO loginCheck(String userId, String pass) {
			AccountDAO dao = new AccountDAO();
			//DAOでAccountテーブルに接続
			AccountDTO dto = dao.selectByUserId(userId);
			if(dto != null && dto.getPass().equals(pass)) {
				return dto;//ログインできる
			}else {
				return null;//ログイン情報なし
			}
		}
	}

