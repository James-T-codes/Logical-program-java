package org.vol;

import java.util.*;
public class SortTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mo=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=mo.nextInt(),i,j;
        int arr[]=new int[n];
    
         System.out.println("enter the elements to the array");
         for(i=0;i<n;i++)
         {
        	 arr[i]=mo.nextInt();
         }
         
         for(i=0;i<n;i++)
         {
        		 int p=i;
        		 for(j=i+1;j<n;j++)
        		 {
        			 if(i%2==0)
        			 {
        			   if(arr[p]<arr[j])
        			   {
        				 p=j;
        			   }
        			 }
        			 else
        			 {
        				 if(arr[p]>arr[j])
             			{
             				p=j;
             			}
        			 }
        		 }
        		 if(p!=i)
        		 {
        			 int t=arr[i];
        			 arr[i]=arr[p];
        			 arr[p]=t;
        		 }
         }
       
         System.out.println("the new array is");
         for(i=0;i<n;i++)
         {
        	 System.out.print(arr[i]+" ");
         }
    
     
		
	}

}
