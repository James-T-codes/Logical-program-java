package org.vol;

import java.util.*;
public class MagicNumber {

	public static void main(String[] args) {
		
		Scanner n=new Scanner(System.in);
		System.out.println("enter the number to check magic number");
		
		int a=n.nextInt();
		int sum=0;
		while(a>0||sum>9)
		{
			if(a==0)
			{
				a=sum;
				sum=0;
			}
			sum+=(a%10);
			a/=10;
		}
		if(sum==1)
		{
			System.out.println("it is a magic number");
		}
		else
			System.out.println("it is not magic number");
		

	}

}
