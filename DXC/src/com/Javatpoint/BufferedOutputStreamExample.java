package com.Javatpoint;
import java.io.*;  
public class BufferedOutputStreamExample {
	public static void main(String args[])throws Exception{    
	     FileOutputStream fout=new FileOutputStream("C:\\Users\\slahari2\\Desktop\\testout.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     String s="Welcome to javaTpoint.";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("success");    
	}    

}
