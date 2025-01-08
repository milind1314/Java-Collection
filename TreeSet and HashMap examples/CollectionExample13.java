package jan_08.collectionExamples;

import java.util.TreeSet;

public class CollectionExample13 {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("nit");
		tree.add("Technology");
		tree.add("Naresh");
		System.out.println(tree.descendingSet());
	}
}

//print in descending order