package jan_09.collectionExamples;

import java.util.*;

class Test8 {
	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<Integer>();
		set.add(7);
		set.add(-12);
		SortedSet<Integer> sub = set.subSet(-100, 100);
		sub.add(9);
		System.out.format("%d %d", set.size(), sub.size());
	}
}


/*
size will be 3 3.

The subSet method creates a live view of the original TreeSet. 
Any modifications to the subSet are reflected in the original TreeSet, and vice versa.
The bounds provided to subSet(fromElement, toElement) are inclusive for the lower bound (fromElement) 
and exclusive for the upper bound (toElement).
The sizes of set and sub are the same since all elements of set fall within the range specified for the subset.
 */
