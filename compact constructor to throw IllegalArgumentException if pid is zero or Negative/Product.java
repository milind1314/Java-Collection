package jan_10.treeSet;

public record Product(Integer pId , String pName) {

	public Product{
	    if (pId < 0) {
			throw new IllegalArgumentException("Pid cannot be zero or Negative.");
		}
	}
}
