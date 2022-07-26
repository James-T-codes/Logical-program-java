package org.vol;

import java.util.*;
public class CyclicNumVerification {

	public static int check(long im,long am)
	{
		int i=0,a[]=new int[20],b[]=new int[20],j=0,x,y,c=1,d=1,m=0;
		while(im!=0)
		{
			a[i++]=(int)(im%10);
			im/=10;
		}
		while(am!=0)
		{
			b[j++]=(int) (am%10);
			am/=10;
		}
		
		if(i==j)
		{
			for(x=0;x<i;x++)
			{
				for(y=0;y<j;y++)
				{
				  if(a[x]==b[y])
				  {
					  m++;
					  break;
				  }
				}
			}
			if(m==i)
			{
				return 1;
			}
			else
				return 0;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		
		System.out.println("enter the number");
		long a=m.nextInt();
		long p=0;
		
		for(int i=1;i<6;i++)
		{
			long mul=i*a;
			 p=check(mul,a);
			 if(p!=1)
			 {
				 System.out.println("not cyclic");
				 return ;
			 }
		}
		if(p==1)
		{
			System.out.println("its cyclic");
		}
		

	}

}
