package dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class TodoListDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int listId;
	private String content;
	private Timestamp createdAt;
	private String archive;
	private String memo;
	public TodoListDTO() {
	
}
public TodoListDTO(int listId, String content, Timestamp createdAt, String archive, String memo) {
	this.listId = listId;
	this.content = content;
	this.createdAt = createdAt;
	this.archive = archive;
	this.memo = memo;
}
public int getListId() {
	return listId;
}
public void setListId(int listId) {
	this.listId = listId;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Timestamp getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Timestamp createdAt) {
	this.createdAt = createdAt;
}
public String getArchive() {
	return archive;
}
public void setArchive(String archive) {
	this.archive = archive;
}
public String getMemo() {
	return memo;
}
public void setMemo(String memo) {
	this.memo = memo;
}
}

