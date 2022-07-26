package org.vol;

import java.util.*;
public class FrequencyOfWord {

	public static void main(String[] args) {
		
		Scanner m=new Scanner(System.in);
		System.out.println("enter the string");
		String n=m.nextLine();
		
		String mat[]=n.split(" ");
		int i,j,k,mat1[]=new int[5],c;
		int y=mat.length;
		
		for(i=0;i<y;i++)
		{
			c=1;
			for(j=i+1;j<y&&i<y-1;j++)
			{
				
				if(mat[i]!=null&&mat[i].equals(mat[j]))
				{
					c++;
					mat[j]=null;
					
				}
				
			}
			mat1[i]=c;
		}
		for(i=0;i<y;i++)
		{
			if(mat[i]!=null)
			{
				System.out.println(mat[i]+" "+mat1[i]);
			}
		}

	}

}
