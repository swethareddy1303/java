package set;
import java.util.*;
public class LearnHashSet {
	
		public static void main(String []args)
		{
			Set<Integer>set=new HashSet<>();
			set.add(7);
			set.add(8);
			set.add(54);
			set.add(98);
			set.add(32);
			set.add(12);
			System.out.println(set);
			set.remove(98);
			System.out.println(set.contains(100));
			System.out.println(set.size());
			System.out.println(set.isEmpty());
			System.out.println(set);
		}

}
