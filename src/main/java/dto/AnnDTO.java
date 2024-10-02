package dto;
import java.io.Serializable;
import java.sql.Timestamp;
public class AnnDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String content;
	private Timestamp openDate;
	public AnnDTO() {
}
public AnnDTO(int id, String content, Timestamp openDate) {
	this.id = id;
	this.content = content;
	this.openDate = openDate;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Timestamp getOpenDate() {
	return openDate;
}
public void setOpenDate(Timestamp openDate) {
	this.openDate = openDate;
}
}

