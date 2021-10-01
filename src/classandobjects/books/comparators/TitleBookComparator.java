package classandobjects.books.comparators;

import java.util.Comparator;

import classandobjects.books.Book;

public class TitleBookComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
