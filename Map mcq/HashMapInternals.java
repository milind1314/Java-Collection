package jan_23.map_mcq;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternals 
{
	public static void main(String[] args)
	{
		Map<String,String> map = new HashMap<>();
		map.put("Ravi","Ampt");
		map.put(new String("Ravi"),"Hyd");  //replace "Ravi  Ampt" with "Ravi Hyd" 

		System.out.println(map);
        }
}


// output: {Ravi=Hyd}
