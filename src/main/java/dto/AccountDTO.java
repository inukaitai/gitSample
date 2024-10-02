package dto;
import java.io.Serializable;
public class AccountDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String mail;
	private String school;
	private String pass;
	private String userId;
	
	
	
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
}

