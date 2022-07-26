package org.vol;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner n=new Scanner(System.in);
		System.out.println("enter the string");
		String y=n.next();
		
		int i,j;
		for(i=0;i<y.length();i++)
		{
			for(j=0;j<y.length();j++)
			{
				if(i==j||i+j==y.length()-1)
				{
					System.out.print(y.charAt(j));
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
