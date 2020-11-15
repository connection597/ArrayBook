package array2;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {} //디폴드 생성자
	
	public Book(String bookName, String author) {
		this.bookName = bookName; //책이륾과 저자이름을 매개변수로 받는 생성자
		this.author = author;
	}
	
	public String getBookName(String bookName) {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAUthor(String author) {
		this.author = author;
	}
	public void showBookInfo() { // 책정보를 출력해주는 메서드
		System.out.println(bookName+","+author);
	}

}
