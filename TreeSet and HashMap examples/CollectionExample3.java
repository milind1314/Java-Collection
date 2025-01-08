package jan_08.collectionExamples;

import java.util.*;

public class CollectionExample3 
{
	public static void main(String[] args) {
		Set<String> tree = new TreeSet<>();
		tree.add("25");
		tree.add("Naresh");
		tree.add("37");
		tree.add("A");
		tree.add("37");
		for(String str: tree)
			System.out.print(str+" ");
	}
}

//sort in natural order based on unicode
//set does not allow duplicates.