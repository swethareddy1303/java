package list;
import java.util.*;
public class LearnStack {
	
		public static void main(String []args)
		{
			Stack<String>ani=new Stack<>();
			ani.push("lion");
			ani.push("pig");
			ani.push("tiger"); 
			ani.push("horse");
			ani.push("deer");
			System.out.println(ani);
			ani.pop();
			System.out.println(ani);
			System.out.println(ani.peek());
			for(String element:ani)
			{
				System.out.println("for each element is" +element);
			}
			
			
			//output is
		  /*	[lion, pig, tiger, horse, deer]
					[lion, pig, tiger, horse]
					horse
					for each element islion
					for each element ispig
					for each element istiger
					for each element ishorse  */

			
}
		
}
