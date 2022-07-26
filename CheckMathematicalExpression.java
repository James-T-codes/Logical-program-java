package org.vol;

import java.util.*;
public class CheckMathematicalExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner mp=new Scanner(System.in);
     
     System.out.println("enter the expression");
     String m=mp.next();
     
     int i,j=0,k=0;
     
     char[] n=m.toCharArray();
     
		for(i=0;i<n.length;i++)
		{
			if(n[i]=='(')
			{
				k++;
			}
			if(n[i]==')')
			{
				k--;
			}
			if(n[i]=='+'||n[i]=='*'||n[i]=='/'||n[i]=='-')
			{
				if((n[i-1]<='z'&&n[i-1]>='a')&&(n[i+1]>='a'&&n[i+1]<='z'))
				{
					j=1;
					continue;
				}
				else
				{
					System.out.println("invalid");
					return;
				}
			}
		}
		if(k==0&&j==1)
		{
			System.out.println("valid");
		}
		else
			System.out.println("invalid");
	}

}
