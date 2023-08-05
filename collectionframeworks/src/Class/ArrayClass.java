package Class;
import java.util.*;
public class ArrayClass {
	public static void main(String []args) 
	{
		
		int[]num= {1,2,3,4,5,6,7,8};
		int index=Arrays.binarySearch(num, 4);
		System.out.println("the index of the element 4 in the array is:"  +index);
		int[]n= {6,54,87,2,73,82,128,11};
	//	Arrays.sort(n);
		//System.out.println(n);
		
		for(int i:n) {
			System.out.println(i +"  ");
			
		}
	}

}
