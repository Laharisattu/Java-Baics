package collections1;

import java.util.*;

public class Demoarraylist4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Asish");
		stack.push("Garima");
		stack.pop();
	    Iterator<String> itr=stack.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());	
		}
	}

}
