package jan_09.collectionExamples;

import java.util.TreeSet;

public class Test4
{
       public static void main(String[] args) 
       {
            TreeSet<Integer> times = new TreeSet<Integer>();
            times.add(1505);
            times.add(2010);
            times.add(1205);
            times.add(1545);
            times.add(1830);
            times.add(2100);
    
            TreeSet<Integer> subset = new TreeSet<Integer>();
            subset = (TreeSet<Integer>) times.headSet(1600);
            System.out.println(subset);
            System.out.println(subset.first());
            System.out.println(subset.last());
            System.out.println(subset.lower(1500));
            System.out.println(subset.higher(1500));
       }
}
