

package list;
import java.util.*;

public class LearnArrayList {
	public static void main(String []args)
	{
		ArrayList<Integer>i=new ArrayList<>();
		i.add(4);
		i.add(6);
		i.add(74);
		i.add(14);
		i.add(5);
		i.add(19);
		System.out.println(i);
		System.out.println(i.get(4));
		
		
	//output is [4,6,74,14,5,19]
		//output is 5
		//to iterate 
		for(int s=0;s<i.size();s++)
		{
			System.out.println("the elements are" +i.get(s));
		}//output is the elements are4
		//the elements are6
		//the elements are74
		//thelements are14
		//the elements are5
		//the elements are19
	}//here to iterate we can  also use for each loop or iterator
		

}

