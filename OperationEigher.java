package org.vol;

import java.util.*;
public class OperationEigher {

	public static int remz(int i)
	{
		int r=0,b=1;
		while(i!=0)
		{
			int s=i%10;
			if(s!=0)
			{
			 r+=s*b;
			 b*=10;
			}
			i/=10;
		}
		return r;
	}
	public static void main(String[] args) {
	
      Scanner m=new Scanner(System.in);
      
      int i,j;
      System.out.println("enter the number");
      i=m.nextInt();
      
      System.out.println("enter the number");
      j=m.nextInt();
      
      if(remz(i)+remz(j)==remz(i+j))
      {
    	  System.out.println("true");
      }
      else
    	  System.out.println("false");
      
	}

}
