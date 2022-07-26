package org.vol;

import java.util.*;

public class AlphaNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner ni=new Scanner(System.in);
      System.out.println("enter the String");
		String p=ni.next();
		char[] s=p.toCharArray();
		
		int i,j=0,w;
		char k;
		
		for(i=0;i<s.length;i++)
		{
			if(s[i]>='0'&&s[i]<='9')
			{
				k=s[i-1];
				while(i<s.length&&s[i]>='0'&&s[i]<='9')
				{
					j=(j*10)+(s[i]-'0');
					i++;
	
				}
				for(w=0;w<j;w++)
				{
					System.out.print(k);
				}
				
			}
			j=0;
		}
	}

}
