package jan_08.collectionExamples;

import java.util.*;

public class CollectionExample11 {
	public static void main(String[] args) {
		TreeSet tree = new TreeSet<>();
		tree.add("nit");
		tree.add("Naresh");
		tree.add("Technology");
		System.out.println(tree.tailSet("a"));
	}
}

//print Object which is greater than "a" which is 97 . Based on unicode.
