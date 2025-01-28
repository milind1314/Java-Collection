package jan_23.map_mcq;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 1);
		map.put("banana", 2);
		map.put("orange", 3);

		map.replaceAll((k, v) -> v * 2);

		System.out.println(map);
	}
}


//output : {banana=4, orange=6, apple=2}
