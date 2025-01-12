package jan_10.book_record_with_comparable_interface;

import java.util.TreeSet;

public class BookSorted {

	public static void main(String[] args) {

		TreeSet<Book> books = new TreeSet<Book>();
		
		books.add(new Book("Wings of Fire", "Dr. A.P.J. Abdul Kalam"));
		books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
		books.add(new Book("1984", "George Orwell"));
		books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
		books.add(new Book("Pride and Prejudice", "Jane Austen"));
		
		
		books.forEach(System.out::println);
	}
	

}
