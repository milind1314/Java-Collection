package jan_08.collectionExamples;

import java.util.*;

public class CollectionExample8 {
	public static void main(String[] args) {
		HashSet hash = new HashSet<>();
		hash.add("nit");
		hash.add("nit");
		System.out.println(hash);
		System.out.println(hash.size());
	}
}


//does not support duplicate values.