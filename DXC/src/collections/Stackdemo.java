package collections;
import java.util.Stack;
public class Stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> names = new Stack<>();
		names.push("abdul");
		names.push("ansari");
		System.out.println(names);
		System.out.println(names.pop());
		System.out.println(names);


	}

}
