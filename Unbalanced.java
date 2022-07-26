package org.vol;

import java.util.Scanner;

public class Unbalanced {

public static void main(String[] args) {
		
		Scanner im=new Scanner(System.in);
		System.out.println("enter the string");
		String mo=im.next();
		int left[]=new int[15];
		int right[]=new int[15];
		int rem[]=new int[15];
		int i,j,lt=0,rt=0,max;
		char a[]=mo.toCharArray();
		for(i=0;i<a.length;i++)
		{
			if(a[i]=='(')
			{
				left[lt++]=i;
			}
			if(a[i]==')')
			{
				right[rt++]=i;
			}
		}
		max=lt<rt?1:2;
		
		int dif=Math.abs(lt-rt),z=0,m=0;
		
		for(i=0;i<dif;i++)
		{
			if(max==1)
			{
				rt--;
				rem[z++]=right[rt];
			}
			if(max==2)
			{
				lt--;
				rem[z++]=left[lt];
			}
		}
		int temp=0;
		if(z>0)
		{
			z--;
			temp=rem[z];
		}
		for(i=0;i<mo.length();i++)
		{
			if(i==temp)
			{
				if(z>0)
				{
				  z--;
				  temp=rem[z];
				}
			}
			else
			{
				System.out.print(mo.charAt(i));
			}
		}
		
		
	}

}
