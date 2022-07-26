package org.vol;

import java.util.*;

public class FindSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mp=new Scanner(System.in);
		
		String ho="test123string";
		
		System.out.println("enter the substring to check");
		String no=mp.next();
		
		int k,i,j,f=0;
		char[] rt=ho.toCharArray(),mt=no.toCharArray();
		
		for(i=0;i<rt.length-mt.length;i++)
		{
			for(j=i;j<i+mt.length;j++)
			{
				f=1;
				if(rt[j]!=mt[j-i])
				{
					f=0;
					break;
				}
			}
			if(f==1)
			{
				System.out.println(i);
				return;
			}
		}
		if(f==0)
		{
			System.out.println(-1);
		}
	
	}

}
