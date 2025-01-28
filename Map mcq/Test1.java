package jan_23.map_mcq;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Test1
{
      public static void main(String[] args)
      {
           NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
           map.put(2, "Two");
           map.put(4, "Four");
           map.put(5, "Five");
           map.put(6, "Six");
           
           System.out.println(map.firstKey());
           System.out.println(map.size());
      }
}
