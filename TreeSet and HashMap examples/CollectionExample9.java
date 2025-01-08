package jan_08.collectionExamples;

import java.util.*;

public class CollectionExample9 {
	public static void main(String[] args) {
		HashSet set = new HashSet<>();
		set.add(new StringBuffer("nit"));
		set.add(new StringBuffer("nit"));
		System.out.println(set);
		System.out.println(set.size());
	}
}
/*
 * Explanation of Output:

Content in the Set: The HashSet contains two StringBuffer objects because StringBuffer does not compare their content 
(equals and hashCode are not overridden). 
Each StringBuffer object is considered unique based on its memory address.
Set Size: The size is 2 because both objects are treated as distinct.
*/