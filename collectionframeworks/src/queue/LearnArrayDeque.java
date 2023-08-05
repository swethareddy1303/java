package queue;
import java.util.*;

public class LearnArrayDeque {
	public static void main(String []args)
	{
		ArrayDeque<Integer>adq=new ArrayDeque<>();
		adq.offer(4);
		adq.offer(28);
		adq.offer(49);
		adq.offer(11);
		adq.offerFirst(34);
		adq.offerLast(5);
		System.out.println(adq);
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println("poll()"   +adq);
		System.out.println(adq.pollFirst());
		System.out.println(adq.pollLast());
		System.out.println("the final elements are"  +adq);

}
}

//here we can add and delete the elements from both sides of the queue ie from rear and front