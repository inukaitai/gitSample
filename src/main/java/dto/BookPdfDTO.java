package dto;
import java.io.Serializable;

public class BookPdfDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int bookId;
	private String name;
	private String filePath;
	
public BookPdfDTO() {
	}
	public BookPdfDTO(int bookId,String name, String filePath) {
		this.bookId = bookId;
		this.name = name;
		this.filePath = filePath;
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
}

