package jan_10.book_record_with_comparable_interface;

public record Book(String name, String author) implements Comparable<Book>{

  //Sort by book name
	@Override
	public int compareTo(Book b) {
		return this.name.compareTo(b.name);
	}

}
