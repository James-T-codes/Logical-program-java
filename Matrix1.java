
package org.vol;
import java.util.Scanner;

public class Matrix1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mo=new Scanner(System.in);
		String strA="WELCOMETOZOHOCORPORATION";
		
		char arr[][]=new char[5][5];
		
		int i=0,j=0,k=0;
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(k<strA.length())
				{
			      arr[i][j]=strA.charAt(k);
			      k++;
				}
			    
			}
		}
		
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print(arr[i][j]+"  ");
				
			}
			System.out.println();
		}
		System.out.println("enter the string");
		String num=mo.next();
		char nu[]=num.toCharArray();
		  int r=nu.length;
		  for(i=0;i<5;i++)
		  {
			for(j=0;j<5;j++)
			{
				if(arr[i][j]==nu[0])
				{
					int x=0,y=0,c=0;
					if(j<3)
					{
					  for(x=j;x<j+r;x++)
					  {
						if(arr[i][x]!=nu[y])
						{
							break;
						}
						c++;
						y++;
					  }
					   if(c==r)
					  {
						System.out.println("start"+i+","+j+"  end index"+i+","+x );
						
					  }
					}
				}
				if(arr[i][j]==nu[0])
				{
					int x=0,y=0,c=0;
					if(i<3)
					{
				     	for(x=j;x<j+r;x++)
				     	{
						if(arr[x][i]!=nu[y])
						{
							break;
						}
						c++;
						y++;
					    }
					    if(c==r)
				    	{
						System.out.println("s"+j+","+i+" e"+x+","+i);
				     	}
					}
				}
			}
		}

	}

}
