package classandobjects.books;

public class Book implements Cloneable, Comparable<Book> {
	private String title;
	private String author;
	private String isbn;
	private int price;
	private static int edition;
	
	public Book(String title, String author, String isbn, int price) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}
	
	public boolean equals(Book obj) {
		return (author == obj.author) && (title == obj.title);
	}
	
	public int hashCode() {
		int hash = 0;
		String line = title + author + price;
		for (int i = 0; i < line.length(); i++) {
			hash += line.charAt(i);
		}
		return hash % Integer.MAX_VALUE;
	}
	
	public String toString() {
		return "Title: " + title + " Author: " + author;
	}
	
	public Object clone() {
		return new Book(title, author, isbn, price);
	}

	@Override
	public int compareTo(Book o) {
		return isbn.compareTo(o.isbn);
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPrice() {
		return price;
	}
}
