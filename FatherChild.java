package org.vol;

import java.util.*;
public class FatherChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] dem= {{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},
		                  {"shaw","rooney"}
		};
		
		Scanner nt=new Scanner(System.in);
		System.out.println("enter the name to find ");
		String na=nt.next(),ya=null;
		int i;
		for(i=0;i<dem.length;i++)
		{
			if(na.equals(dem[i][1]))
			{
				ya=dem[i][0];
				break;
			}
		}

		int c=0;
		for(i=0;i<dem.length;i++)
		{
			if(ya.equals(dem[i][1]))
			{
				c++;
			}
		}
		System.out.println("the number of grand children is "+c);

	}

}
