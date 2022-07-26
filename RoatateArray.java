package org.vol;

import java.util.*;
public class RoatateArray {

	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		System.out.println("enter the array size ");
		int n=m.nextInt();
		
		int arr[]=new int[n],i,j,p=0;
		
		System.out.println("enter the elements to the array");
		for(i=0;i<n;i++)
		{
			arr[i]=m.nextInt();
		}
		
		System.out.println("enter the position to rotate");
		p=m.nextInt();
		
		for(i=0;i<p;i++)
		{
			int x=arr[0];
			for(j=0;j<n-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=x;
		}
		int ji='o';
		System.out.println((char)ji);
		
		System.out.println("the rotate array");
		for(int c:arr)
		{
			System.out.print(c+" ");
		}

	}

}
