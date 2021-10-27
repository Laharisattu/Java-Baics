package collections;
import java.util.ArrayList;
import java.util.Collections;

public class Sortarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("mango");
		fruits.add("pineapple");
		fruits.add("apple");
		fruits.add("grapes");
		fruits.add("banana");
		System.out.println(fruits);
		Collections.sort(fruits);
		System.out.println(fruits);


	}

}
