package jan_08.collectionExamples;

import java.util.*;

public class CollectionExample10 {
	public static void main(String[] args) {
		TreeSet tree = new TreeSet<>();
		tree.add("nit");
		tree.add("Naresh");
		tree.add(25);
		System.out.println(tree.tailSet("a"));
	}
}

//class java.lang.String cannot be cast to class java.lang.Integer 
//(java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')