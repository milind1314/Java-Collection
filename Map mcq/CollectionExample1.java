package jan_23.map_mcq;

import java.util.HashMap;

public class CollectionExample1 {
	public static void main(String[] args) {
		HashMap hash = new HashMap<>();
		hash.put("nit", 500);
		hash.put("info", 644);
		hash.put("tech", "google");
		System.out.println(hash.get("tech"));
		System.out.println(hash.get("google"));
		System.out.println(hash.getOrDefault("nit", "Technology"));
		System.out.println(hash.get("info"));
	}
}

/*
	output: google
			null
			500
			644
 */