package jan_09.collectionExamples;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test11
{
      public static void main(String[] argv) 
      {
            Set set = new TreeSet();
            set.add("2");
            set.add(3);
            set.add("1");
            Iterator it = set.iterator();
            while (it.hasNext())
                 System.out.print(it.next() + " ");
      }
}

//java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer 
//(java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
