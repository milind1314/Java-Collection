package jan_09.collectionExamples;

import java.util.Iterator;
import java.util.TreeSet;

public class Test3 
{
      public static void main(String[] argv) 
      {
           TreeSet<Double> set = new TreeSet<>();
           for (int i = 0; i < 5; i++)
                set.add(Math.random());

           Iterator<Double> iter = set.iterator();
           while (iter.hasNext())
                System.out.println(iter.next());

     }
}
