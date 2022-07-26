package org.vol;

import java.util.*;
public class IdentifyNotSameCharacter {

	public static void main(String[] args) {
		
		Scanner n=new Scanner(System.in);
		
       System.out.println("enter the first string");
       String str1=n.next();
       
       System.out.println("enter the sec string");
       String str2=n.next();
       int i,j,k;
       char[] arr1=str1.toCharArray();
       char[] arr2=str2.toCharArray();
       
       for(i=0;i<arr1.length;i++)
       {
    	   if(arr1[i]!=arr2[i])
    	   {
    		   System.out.println(arr1[i]+" "+arr2[i]);
    	   }
       }
	}

}
