package Hashset1;
import java.util.*;
public class Hashset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<String> set=new HashSet<String>();  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("Ajay");  
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  

	}

}
