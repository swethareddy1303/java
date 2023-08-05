package Class;
import java.util.*;
public class CollectionClass {
	public static void main(String []args) 
	{
		List<Integer>i=new ArrayList<>();
		i.add(66);
		i.add(21);
		i.add(32);
		i.add(14);
		i.add(59);
		i.add(6);
		System.out.println(i);
		System.out.println("minimum element is "+Collections.min(i));
		
		System.out.println("maximum element is "+Collections.max(i));
		Collections.sort(i);
		System.out.println(i);
		System.out.println(Collections.frequency(i, 14));
		//to get in descending order we use
		//Collections.sort(i,Comparator.reverseOrder()		
}
}