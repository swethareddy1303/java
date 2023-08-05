package queue;
import java.util.*;


public class LearnLinkedList {
	public static void main(String []args)
	{
		Queue<Integer>q=new LinkedList<>();
		q.offer(55);
		q.offer(85);
		q.offer(32);
		q.offer(7);
		System.out.println(q);
		q.poll();
		System.out.println(q.poll());//returns the removed element
		System.out.println(q.peek());
		Iterator<Integer>it=q.iterator();
		while(it.hasNext()) {
			System.out.println("the elements are" +it.next());
		}

	
	}
}
	
