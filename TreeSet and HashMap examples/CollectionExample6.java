package jan_08.collectionExamples;

import java.util.*;

public class CollectionExample6 {
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
Explanation of Output:
hash.get("tech"): Retrieves the value associated with the key "tech", which is "google".
hash.get("google"): Returns null because "google" is not a key in the map.
hash.getOrDefault("nit", "Technology"): Retrieves the value for "nit" (500). The default value "Technology" is ignored as the key exists.
hash.get("info"): Retrieves the value associated with the key "info" (644).
*/