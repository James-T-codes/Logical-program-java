package org.vol;

import java.util.*;
public class AccordingToFactors {

	public static int meta(int a)
	{
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				sum+=1;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mp=new Scanner(System.in);
		
		System.out.println("enter the array size");
		int n=mp.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elemnts to the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=mp.nextInt();
		}
		
		int arr1[]=new int[n],i=0;
		for(i=0;i<n;i++)
		{
			arr1[i]=meta(arr[i]);
		}
		
		for(i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr1[i]<arr1[j])
				{
					int t=arr1[i];
					int t1=arr[i];
					arr1[i]=arr1[j];
					arr[i]=arr[j];
					arr1[j]=t;
					arr[j]=t1;
				}
			}
			
		}
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		
	}

}
