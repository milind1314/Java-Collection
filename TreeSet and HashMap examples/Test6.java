package jan_09.collectionExamples;

import java.util.*;

public class Test6 {

	public static void main(String[] args) {
		Integer a = new Integer(4);
		Integer b = new Integer(8);
		Integer c = new Integer(4);
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(a);
		hs.add(b);
		hs.add(c);
		System.out.println(hs);
	}
}

//HashSet doesn't allow duplicates
//output : [4, 8]