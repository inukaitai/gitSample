package dto;

import java.io.Serializable;
import java.sql.Date;

public class StudentListDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String userId;
	private String studentId;
	private String studentName;
	private Date createdAt;
	private String attendance;
	private String condition;
	private String memo;
	
	public StudentListDTO(){
	
}
	public StudentListDTO(String userId, String studentId, String studentName, Date createdAt, String attendance, String condition, String memo) {
		this.userId = userId;
		this.studentId = studentId;
		this.studentName = studentName;
		this.createdAt = createdAt;
		this.attendance = attendance;
		this.condition = condition;
		this.memo = memo;
		
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getAttendance() {
		return attendance;
	}
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
		
}
	


