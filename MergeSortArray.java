package org.vol;

import java.util.*;
public class MergeSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int n=10,m=10,i,j;
		
		System.out.println("enter the array size");
		n=s.nextInt();
		int arr1[]=new int[20];
		System.out.println("enter the elements to the array");
		for(i=0;i<n;i++)
		{
			arr1[i]=s.nextInt();
		}
		
		System.out.println("enter the second array size");
		m=s.nextInt();
		int[] arr2=new int[m];
		System.out.println("enter the elements to the array");
		for(i=0;i<m;i++)
		{
			arr2[i]=s.nextInt();
		}
		for(i=0;i<m;i++)
		{
			arr1[n+i]=arr2[i];
		}
		//System.out.println(arr1.length);
		int b=n+m;
		
		for(i=0;i<b-1;i++)
		{
			int p=i;
			for(j=i+1;j<b;j++)
			{
				if(arr1[p]>arr1[j])
				{
					p=j;
				}
			}
			if(p!=i)
			{
				int t=arr1[i];
				arr1[i]=arr1[p];
				arr1[p]=t;
			}
		}
		
		
		for(i=0;i<b-1;i++)
		{
			for(j=i+1;j<b;j++)
			{
				if(arr1[i]==arr1[j])
				{
					for(int k=j;k<b-1;k++)
					{
						arr1[k]=arr1[k+1];
					}
					b--;
					j--;
				}
			}
		}
		for(i=0;i<b;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
	}

}
