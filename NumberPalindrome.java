package org.vol;

import java.util.*;
public class NumberPalindrome {

	public static void main(String[] args) {
		
		Scanner n=new Scanner(System.in);
		
		System.out.println("enter the number");
		int m=n.nextInt();
		int x=m%2,r=0;
		while(m!=0)
		{
			r=m%2;
			m/=2;
			
		}
		if(x==r)
		{
			System.out.println("it is palidrome");
		}
		else
			System.out.println("not palindrome");
		 

	}

}
