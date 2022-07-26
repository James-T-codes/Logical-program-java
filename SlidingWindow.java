package org.vol;

import java.util.*;
public class SlidingWindow {

	public static void main(String[] args) {
		
     Scanner m=new Scanner(System.in);
     
     System.out.println("enter the array lenth");
     int n=m.nextInt();
     int arr[]=new int[n],i,j;
       System.out.println("enter the elements to the array");
      for(i=0;i<n;i++)
      {
    	 arr[i]=m.nextInt();
       }
      
      System.out.println("enter the sliding window");
      int k=m.nextInt();
      int max;
      for(i=0;i<=n-k;i++)
      {
    	  max=arr[i];
    	  for(j=i;j<i+k;j++)
    	  {
    		  if(max<arr[j])
    		  {
    			  max=arr[j];
    		  }
    	  }
    	  System.out.print(max+" ");
    	  
      }
	}

}
