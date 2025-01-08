package jan_08.collectionExamples;

import java.util.*;

public class CollectionExample2 {
	public static void main(String[] args) {
		Set<String> tree = new TreeSet<>();
		tree.add("25");
		tree.add("Naresh");
		tree.add("A");
		tree.add("37");
		for(String str: tree)
			System.out.print(str+" ");
	}
}


/*
 The strings are sorted based on their Unicode values:
"25" and "37" are sorted as numbers represented as strings.
"A" is placed before "N" because A comes first lexicographically.
Final sorted order: "25", "37", "A", "Naresh".
 */