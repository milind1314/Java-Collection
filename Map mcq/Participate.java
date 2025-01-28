package jan_23.map_mcq;

import java.util.*;
import java.util.Map.Entry;

public class Participate {
	public static void main(String args[]) {
		HashMap participant = new HashMap();
		participant.put(1 + 1, "Dhoni");
		participant.put(1 + 1, "Kohli");
		participant.put(2 + 1, "Rohit");

		Set set = participant.entrySet();

		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Map.Entry m = (Entry) itr.next();
			System.out.print(m.getKey() + " " + m.getValue() + " ");
		}
	}
}

//output : 2 Kohli 3 Rohit 