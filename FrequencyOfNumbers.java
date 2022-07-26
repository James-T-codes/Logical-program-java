package org.vol;


import java.util.*;
public class FrequencyOfNumbers {

	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		
		System.out.println("enter the size of the array");
		int  n=m.nextInt();
		
		int arr[]=new int[n],i,j,k,arr1[]=new int[n],c=0;;
		
		System.out.println("enter the elements to the array");
		for(i=0;i<n;i++)
		{
			arr[i]=m.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			c=1;
			for(j=i+1;j<n&&i<n-1;j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
					for(k=j;k<n-1;k++)
					{
						arr[k]=arr[k+1];
					}
					n--;
					j--;
				}
			}
			arr1[i]=c;
			
		}
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+" "+arr1[i]);
		}
		

	}

}
