package classtest.collectionframework.collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		
		if(len == 0) {
			System.out.println("큐가 비어있음!");
			return null;
		}
		return(arrayQueue.remove(0));
	}
}

public class QueueTest {
	public static void main(String[] args) {
		
		MyQueue q = new MyQueue();
		
		q.enQueue("A");
		q.enQueue("B");
		q.enQueue("C");
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}
}
