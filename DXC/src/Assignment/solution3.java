package Assignment;

import java.io.*;
import java.util.*;

public class Solution3 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
         if(A.equalsIgnoreCase(new StringBuffer(A).reverse().toString()))
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}



