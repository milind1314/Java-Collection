package jan_23.map_mcq;

public class BufferTest {
	public static void main(String[] args) 
	{
		Integer i1 = 128;
		Integer i2 = 128;

		System.out.println(i1 == i2); //its check hash code.
		System.out.println(i1.equals(i2)); //it check contains of object.
	}
}


/*
 * Output : false
 *          true
 */