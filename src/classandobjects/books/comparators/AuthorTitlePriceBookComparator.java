package classandobjects.books.comparators;

import java.util.Comparator;

import classandobjects.books.Book;

public class AuthorTitlePriceBookComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		AuthorTitleBookComparator authorTitleComparator = new AuthorTitleBookComparator();
		int authorTitleCompare = authorTitleComparator.compare(o1, o2);
		int priceCompare = o1.getPrice() - o2.getPrice();
		return authorTitleCompare == 0 ? priceCompare : authorTitleCompare;
	}

}
