package validation;

import java.util.ArrayList;
import java.util.List;
//はかれたエラーをリストとして取る
//クラス名がvalidationだとImportするものとかぶってしまうので、作っているものに合わせてLoginValidationとかの方がエラーをはきにくい。ずっとエラー探してた
public class MyValidation {//Validation classを作る
	private List<String> errorMsgList;
	
	public MyValidation() {
		this.errorMsgList = new ArrayList<>();
	}
	
	public boolean hasErrorMsg() {
		if (errorMsgList.size() > 0) {
				return true;
		}else {
				return false;
		}
	}
//指定されたテキストがNullまたは空文字（スペースで空白の文字を意図的に入力している状態）かどうか
//チェックして、Nullか空文字ならエラーメッセージを追加
public void isBlank(String textName, String text) {
	if (text == null || text.isEmpty()) {//isEmpty method
		this.errorMsgList.add(textName + "が入力されていません");
	}
}
public void length(String textName, String text, int min, int max) {
	if(text == null || text.length() < min || text.length() > max ) {
		this.errorMsgList.add(textName + "は、" + min + "文字以上" + max + "文字以内で入力してください");
	}
}

public void length(String textName, String text, int max) {
	if(text == null || text.length()> max) {
		this.errorMsgList.add(textName + "は、" + max + "文字以内で入力してください");
	}
}
//エラーメッセージをリストに追加
public void addErrorMsg(String msg) {
	errorMsgList.add(msg);
}
//保持しているエラーメッセージのリストを返す
public List<String> getErrorMsgList(){
	return errorMsgList;
}

}




