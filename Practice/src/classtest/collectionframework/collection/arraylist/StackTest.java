package classtest.collectionframework.collection.arraylist;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		
		if(len == 0) {
			System.out.println("스택이 비어있음!");
			return null;
		}
		return(arrayStack.remove(len-1));
	}
}

public class StackTest {
	public static void main(String[] args) {
		
		MyStack s = new MyStack();
		
		s.push("A");
		s.push("B");
		s.push("C");
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
