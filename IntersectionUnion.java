package org.vol;

import java.util.*;

public class IntersectionUnion {

	public static void main(String[] args) {
		
		Scanner no=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=no.nextInt();
		System.out.println("enter the elemnts to the array");
		
		int[] arr=new int[n];
		int i,j,k1=0,k2=0,k3=0,union[]=new int[20],intersec[]=new int[10],exp[]=new int[10];
		
		for(i=0;i<n;i++)
		{
			arr[i]=no.nextInt();
		}
		System.out.println("enter the size of another array");
		int n1=no.nextInt();
		int arr1[]=new int[n1];
		System.out.println("enter the elements to the array");
		for(i=0;i<n1;i++)
		{
			arr1[i]=no.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n1;j++)
			{
				if(arr[i]==arr1[j])
				{
					intersec[k1++]=arr[i];
					break;
				}
			}
			union[k2++]=arr[i];
			if(arr[i]%2!=0)
			{
				exp[k3++]=arr[i];
			}
		}
		for(i=0;i<n1;i++)
		{
			int f=1;
			for(j=0;j<n;j++)
			{
				if(arr1[i]==arr[j])
				{
					f=0;
					break;
				}
			}
			if(f==1)
			{
				union[k2++]=arr1[i];
			}
			if(arr1[i]%2==0)
			{
				exp[k3++]=arr1[i];
			}
		}
		
		System.out.println("the intersection is");
		for(i=0;i<k1;i++)
		{
			System.out.print(intersec[i]+" ");
		}
		System.out.println();
		System.out.println("enter the union");
		for(i=0;i<k2;i++)
		{
			System.out.print(union[i]+" ");
		}
		System.out.println();
		System.out.println("the except");
		for(i=0;i<k3;i++)
		{
			System.out.print(exp[i]+" ");
		}

	}

}
