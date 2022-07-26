package org.vol;

import java.util.*;
public class NumberWord {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one[]= {"zero","one","two","three","four","five","six","seven",
				       "eight","nine","ten"};
		String two[]= {"twenty","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
				       "seventeen","eighteen","nineteen"};
		String three[]= {""," ","twenty","thirty","fourty","fifty","sixty","seventy","eighty",
				           "ninety"};
		Scanner m=new Scanner(System.in);
		System.out.println("enter the number");
		int a=m.nextInt();
		
		if(a<=10)
		{
			System.out.println(one[a]);
			return;
		}
		if(a>10&&a<21)
		{
			System.out.println(two[a%10]);
			return;
		}
        if(a>20&&a<100)
        {
        	System.out.print(three[a/10]+" ");
        	a%=10;
        	System.out.print(one[a]);
        	return;
        	
        }
        if(a>=100&&a<1000)
        {
        	System.out.print(one[a/100]+" ");
        	System.out.print("hunderd and ");
        	int me=a-(a%100);
        	a=a-me;
        	if(a>20&&a<100)
        	{
        		System.out.print(three[a/10]+" ");
        		a=a%10;
        		System.out.print(one[a]);
        		return;
        	}
        	if(a<21&&a>10)
        	{
        		System.out.print(two[a%10]);
        		return;
        	}
        	if(a<=10)
        	{
        		System.out.print(one[a]);
        	}
        			
        }
	}

}
