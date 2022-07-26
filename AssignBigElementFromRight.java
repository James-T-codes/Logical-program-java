package org.vol;

import java.util.*;
public class AssignBigElementFromRight {

	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		
		System.out.println("enter the size of the array");
		int n=m.nextInt();
		
		int arr[]=new int[n],i=0;
		
		System.out.println("enter the elements to the array");
		for(i=0;i<n;i++)
		{
			arr[i]=m.nextInt();
		}
		
		int temp,min;
		
		min=-2;
		for(i=n-1;i>=0;i--)
		{
			temp=min;
			if(temp<arr[i])
			{
				min=arr[i];
			}
			arr[i]=temp;
		}
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
