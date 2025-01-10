package jan_09.collectionExamples;

import java.util.*;

public class Test2 
{
       public static void main(String[] args) 
       {
            TreeSet<Integer> times = new TreeSet<Integer>();
            times.add(705);
            times.add(509);
            times.add(645);
            times.add(830);
            times.add(1010);
            times.add(1100);    
            //Set<Integer> subset = new TreeSet<Integer>(); Error
            SortedSet<Integer> subset = new TreeSet<Integer>();
            subset = times.headSet(800);		// or typecast (TreeSet <Integer>)	
            System.out.println(subset);
            System.out.println(subset.first());
            System.out.println(subset.last());

       }
}
