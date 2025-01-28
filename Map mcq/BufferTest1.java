package jan_23.map_mcq;
import java.util.*;

public class BufferTest1
{
   public static void main(String [] args)
   {
        Map<Integer,String> map = new HashMap<>();
	map.put(128,"Ampt");
	map.put(new Integer(128),"Hyd"); //dupclicate key get replace.
	System.out.println(map.size()); //1
    }
 }
