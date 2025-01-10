package jan_09.collectionExamples;

import java.util.Set;
import java.util.TreeSet;

public class Test1
{
     public static void main(String[] a) 
     {
          Set<Apple> set = new TreeSet<Apple>();
          set.add(new Apple(1));
          set.add(new Apple(2));
          set.add(new Apple(1));
          for (Apple apple : set) {
			System.out.println(apple);
		}
     }
}
class Apple implements Comparable<Apple>
{

	private Integer id;
	
	public Apple(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Apple o) {
		return this.id.compareTo(o.id);
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + "]";
	}
}
