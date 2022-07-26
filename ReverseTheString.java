package org.vol;

import java.util.*;

 
public class ReverseTheString {

	public static void method(String[] p,int k)
	 {
	    if(k<0)
	    {
	    	return;
	    }
	    else
	    {
	    	System.out.print(p[k]+" ");
	    	method(p,k-1);
	    }
	    
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.println("enter the string to reverse");
     String mo=s.nextLine(),no[];
     
     no=mo.split(" ");
     method(no,no.length-1);
     
     
     
		
	}
   
}
