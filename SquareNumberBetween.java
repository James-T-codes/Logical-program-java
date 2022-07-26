package org.vol;

import java.util.*;
public class SquareNumberBetween {

	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		
		System.out.println("enter the number");
		int i=m.nextInt();
		
		System.out.println("enter the second number");
		int j=m.nextInt();
		
		for(int a=i;a<=j;a++)
		{
			int b=(int)Math.sqrt(a);
			if(b*b==a)
			{
				System.out.print(a+" ");
			}
		}

	}

}
