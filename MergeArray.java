package org.vol;

import java.util.*;
public class MergeArray {

	public static void main(String[] args) {
	
		Scanner n=new Scanner(System.in);
		int arr[]= {1,2,3,6,9};
		int arr1[]= {2,4,5,10};
		int merge[]=new int[arr.length+arr1.length],i,j;
		int m=0;
		for(i=0;i<arr.length+arr1.length;i++)
		{
			if(i<arr.length)
			merge[i]=arr[i];
			else
			merge[i]=arr1[m++];
		}
		int k;
		m=merge.length;
		for(i=0;i<m-1;i++)
		{
			for(j=i+1;j<m;j++)
			{
				if(merge[i]==merge[j])
				{
					for(k=j;k<m-1;k++)
					{
						merge[k]=merge[k+1];
						
					}
					j--;
					m--;
					
				}
				if(merge[i]>merge[j])
				{
					int t=merge[i];
					merge[i]=merge[j];
					merge[j]=t;
				}
				
			}
		}
		System.out.println("the new array is");
		for(i=0;i<m;i++)
		{
			System.out.print(merge[i]+" ");
		}
		

	}

}
