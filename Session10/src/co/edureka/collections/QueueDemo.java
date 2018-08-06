package co.edureka.collections;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=10;i>0;i--){
			queue.add(i);
		}
		
		// FIFO
		// (head)10 9 8 7 6 5 4 3 2 1(tail)
		
		// PQ sorts the data internally
		// (head)1 2 3 4 5 6 7 8 9 10(tail)
		
		System.out.println("===peeking===");
		System.out.println(queue.peek()); // peek method returns head of the queue
		System.out.println(queue.peek()); // peek method returns head of the queue
		
		/*System.out.println("===polling===");
		System.out.println(queue.poll()); // poll methods returns the head of the queue after removing it
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());*/
		
		System.out.println("===polling===");
		for(int i=0;i<queue.size();i++){
			System.out.println(queue.poll()+" size is: "+queue.size());
		}
		
	}

}
