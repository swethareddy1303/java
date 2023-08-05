package set;
import java.util.*;
public class LearnHashMap {
	public static void main(String []args)
	{
		Map<String,Integer>num=new HashMap<>();
		num.put("one", 1);
		num.put("Two", 2);
		num.put("Three", 3);
		num.put("Four", 4);
		num.put("Five", 5);
		num.put("six", 6);
		System.out.println(num);
		num.putIfAbsent("three", 32);
		for(String key:num.keySet()) {
			System.out.println(key);//this displays only keys
			
		}
		for(Integer i:num.values()) {
			System.out.println(i);//this displays onlu values
			
		}
	}

}
