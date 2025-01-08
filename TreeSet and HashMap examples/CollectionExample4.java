package jan_08.collectionExamples;
//
//import java.util.*;
//
//public class CollectionExample4 {
//	public static void main(String[] args) {
//		Set<String> tree = new TreeSet<>();
//		tree.add("google");
//		tree.add("Naresh");
//		tree.add("Information");
//		tree.add("Technology");
//		System.out.println(tree);
//		for(int i=2;i<tree.size();i++) 
//		{
//			System.out.print(tree.remove("google"));
//			//System.out.print(tree.remove(i));    set does not work on index
//		}
//		
//		String s = "a";
//		System.out.println(s.hashCode());
//		
//		
//		
//	}
//}




import java.util.Set;
import java.util.TreeSet;

public class CollectionExample4 {
    public static void main(String[] args) {
        Set<String> tree = new TreeSet<>();
        tree.add("google");
        tree.add("Naresh");
        tree.add("Information");
        tree.add("Technology");
        
        // Display the elements in the set
        System.out.println("TreeSet before removal: " + tree);
        
        // Remove a specific element by name
        tree.remove("google"); // Example of removing an element
        System.out.println("TreeSet after removal: " + tree);
    }
}



