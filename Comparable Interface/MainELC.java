package jan_07.comparable_Interface;

import java.util.ArrayList;
import java.util.Collections;

public class MainELC {

	public static void main(String[] args) {

		ArrayList<Product> pr = new ArrayList<Product>();
		pr.add(new Product(234, "David", 15000.0));
		pr.add(new Product(456, "Rushi", 30000.0));
		pr.add(new Product(123, "Virat", 25000.0));
		pr.add(new Product(345, "Salman", 20000.0));
		pr.add(new Product(567, "Ayaan", 20000.0));
		
		Collections.sort(pr);
		pr.forEach(System.out::println);
	}

}
