package org.vol;

import java.util.*;
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ne=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int p=ne.nextInt();
		
		int arr[]=new int[p],i=0,j=0,arr1[]=new int[5],arr2[]=new int[5],k=0,y=0;
		
		System.out.println("enter the elements to the array");
		for(i=0;i<p;i++)
		{
			arr[i]=ne.nextInt();
			if(i%2==0)
			{
				arr1[k++]=arr[i];
			}
			else
				arr2[y++]=arr[i];
		}
		int m=0;
		for(i=0;i<p;i++)
		{
			if(i%2==0)
			{
				while(m<k) {
					
					int x=m;
					for(int t=m+1;t<k;t++)
					{
						if(arr1[x]<arr1[t])
						{
							x=t;
						}
					}
					if(m!=x)
					{
						int t=arr1[m];
						arr1[m]=arr1[x];
						arr1[x]=t;
					}
					break;
				}
				System.out.print(arr1[m]+" ");
				m++;
			}
			else
			{
				while(j<y)
				{
         			int x=j;
					for(int t=j+1;t<y;t++)
					{
						if(arr2[x]>arr2[t]) {
							x=t;
						}
					}
					if(x!=j)
					{
						int t=arr2[j];
						arr2[j]=arr2[x];
						arr2[x]=t;
					}
					
					break;
				}
				System.out.print(arr2[j]+" ");
				j++;
			}
		}
	}

}
