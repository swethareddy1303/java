package set;

import java.util.TreeSet;
import java.util.Set;

public class LearnTreeSet {
	public static void main(String []args)
	{
	  Set<Integer>set=new TreeSet<>();
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


//here follows the set rules and when executed elements will be sorted in the output 
//internally it follows binary search tree rules
