package day35_Encapsulation;

	/*
	Book class'i verilmistir. Iki tane attributes olusturunuz.
	bookName ve authorName (String ile)
	Book class'ini kapsülleyin. (Encapsulate)
	Main class'in içine object  olusturun ve sonucu yazdiriniz.
	"Book name is BOOKNAME and Author is AUTHORNAME"
	 */

public class C3_Book_03 {
	
	private String bookName;
	private String authorName;
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	
	
	

}
