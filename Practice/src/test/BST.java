package test;

public class BST {

	public static void main(String[] args) {
		Queue q = new BookShelf();
		
		q.enQueue("자바1");
		q.enQueue("자바2");
		q.enQueue("자바3");
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}

}
