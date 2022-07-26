package org.vol;
import java.util.Scanner;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt(),j;
		int arr[]=new int[n];
		System.out.println("enter the elements to the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp;
		for(int i=1;i<n;i++)
		{
			temp=arr[i];
			j=i-1;
			while(j>=0&&temp<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
				
			}
			arr[j+1]=temp;
		}

	}

}
