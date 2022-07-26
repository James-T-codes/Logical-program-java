package org.vol;

import java.util.*;
public class ImportantPattern {
 
	public static void method(int n)
	{
		int size,i,j;
		size=2*n-1;
		
		for(i=1;i<=size;i++)
		{
			for(j=1;j<=size;j++)
			{
				System.out.print(Math.max(Math.abs(i-n),Math.abs(j-n))+1+" ");
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner n=new Scanner(System.in);
     int i=9,j=8;
     System.out.println(Math.abs(j-i));
     System.out.println("enter the size");
     int np=n.nextInt();
     
     method(np);
	}

}
