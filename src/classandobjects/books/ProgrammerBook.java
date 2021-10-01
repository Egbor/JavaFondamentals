package classandobjects.books;

public class ProgrammerBook extends Book {
	private String language;
	private int level;
	
	public ProgrammerBook(String title, String author, String isbn, int price) {
		super(title, author, isbn, price);
	}
	
	public boolean equals(ProgrammerBook obj) {
		return (language == obj.language) && (level == obj.level);
	}
	
	public int hashCode() {
		int hash = 3;
		String line = language + level;
		for (int i = 0; i < line.length(); i++) {
			hash = hash * 11 + line.charAt(i);
		}
		return hash;
	}
	
	public String toString() {
		return "Language: " + language + " Level: " + level;
	}
}
