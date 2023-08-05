package queue;

import java.util.*;


public class LearnPriorityQueue {
	public static void main(String []args)
	{
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		pq.offer(132);
		pq.offer(2);
		pq.offer(43);
		pq.offer(70);
		System.out.println(pq);
		
		//here the minimum element is displayed frst ie 2
		pq.poll();
         System.out.println(pq);
         
         
}
}
// to reverse the order of minheap implementing in priority queue we have to use
//priorityQueue<Integer>pq=new PriorityQueue<>(comparator.reverseOrder());so that we get highest element 
//frst ie 132