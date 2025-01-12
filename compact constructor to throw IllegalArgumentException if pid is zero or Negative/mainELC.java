package jan_10.treeSet;

import java.util.*;

public class mainELC {

	public static void main(String[] args) {

		try {
			System.out.println("Sort based on the pid in ascending order.");
			TreeSet<Product> set = new TreeSet<Product>((p1,p2)->p1.pId().compareTo(p2.pId()));
			set.add(new Product(3, "Virat"));
			set.add(new Product(6, "Mahesh"));
			set.add(new Product(5, "Nilesh"));
			set.add(new Product(1, "Rushikesh"));
			
			set.forEach(System.out::println);
			
			System.out.println("\nSort based on the pid in descending order.");
			TreeSet<Product> set2 = new TreeSet<Product>((p1,p2)->p2.pId().compareTo(p1.pId()));
			set2.addAll(set);
			
			
			set2.forEach(System.out::println);
			
			System.out.println("\nSort based on the name in Alphabetical order.");
			TreeSet<Product> set3 = new TreeSet<Product>((p1,p2)->p1.pName().compareTo(p2.pName()));
			set3.addAll(set);
//			set3.add(new Product(3, "Virat"));
//			set3.add(new Product(6, "Mahesh"));
//			set3.add(new Product(5, "Nilesh"));
//			set3.add(new Product(1, "Rushikesh"));
			
			
			set3.forEach(System.out::println);
			
			System.out.println("\nSort based on the name in Reverse order.");
			TreeSet<Product> set4 = new TreeSet<Product>((p1,p2)->p2.pName().compareTo(p1.pName()));
			set4.addAll(set);

			set4.forEach(System.out::println);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
