package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
	public static void main(String []args)
	{
	  Set<Integer>set=new LinkedHashSet<>();
		set.add(7);
		set.add(8);
		set.add(54);
		set.add(98);
		set.add(32);
		set.add(12);
		System.out.println(set);
		set.remove(98);
		System.out.println(set.contains(12));
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		System.out.println(set);
	}

}


