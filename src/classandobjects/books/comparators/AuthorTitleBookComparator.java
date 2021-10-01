package classandobjects.books.comparators;

import java.util.Comparator;

import classandobjects.books.Book;

public class AuthorTitleBookComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		int titleCompare = o1.getTitle().compareTo(o2.getTitle());
		int authorCompare = o1.getAuthor().compareTo(o2.getAuthor());
		return authorCompare == 0 ? titleCompare : authorCompare;
	}
	
}
