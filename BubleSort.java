package org.vol;

import java.util.Scanner;


public  class BubleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		System.out.println("enter the number");
		int n=num.nextInt();
		int arr[]=new int[n],i,j,f;

		System.out.println("enter the array");
		for(i=0;i<n;i++)
		{
			arr[i]=num.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			f=0;
			int b=n-i-1;
			for(j=0;j<b;j++)
			{

				if(arr[j]>arr[j+1])
				{
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
					f=1;


				}
			}
			if(f==0)
			{

				break;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}


	}

}
