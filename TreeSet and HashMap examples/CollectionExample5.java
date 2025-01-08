package jan_08.collectionExamples;
import java.util.*;

public class CollectionExample5 {
	public static void main(String[] args) {
		Set<String> tree = new TreeSet<>();
		tree.add("google");
		tree.add("Naresh");
		tree.add("Information");
		tree.add("Technology");		
		for(String str: tree) 
		{
			if(tree.contains("Naresh"))
				System.out.print(str+" ");
		}
	}
}
