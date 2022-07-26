package org.vol;

import java.util.*;
public class MatrixRotate {

	public static void main(String[] args) {
		
		Scanner n=new Scanner(System.in);
		
		System.out.println("enter the row size");
		int np=n.nextInt(),i,j,x,y;
		
		int[][] mp=new int[np][np];
		
		System.out.println("enter the elements to the matrix");
		for(i=0;i<np;i++)
		{
			for(j=0;j<np;j++)
			{
				mp[i][j]=n.nextInt();
			}
		}
		for(i=0;i<np;i++)
		{
			for(j=0;j<np;j++)
			{
				System.out.print(mp[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println();
		int b=1;
		for(i=0;i<np/2;i++)
		{
			for(j=i;j<np-i-1;j++)
			{
				int temp=mp[i][j];
				for(x=i,y=j;x<np-i-1;x++)
				{
					mp[x][y]=mp[x+1][y];
				}
				for(x=np-1-i,y=j;y<np-1-i;y++)
				{
					mp[x][y]=mp[x][y+1];
				}
				for(x=np-1-i,y=np-1-i;x>=b;x--)
				{
					mp[x][y]=mp[x-1][y];
				}
				for(x=i,y=np-i-1;y>=b;y--)
				{
					mp[x][y]=mp[x][y-1];
				}
				mp[i][j+1]=temp;
				b++;
				break;
				
			}
		}
		for(i=0;i<np;i++)
		{
			for(j=0;j<np;j++)
			{
				System.out.print(mp[i][j]+" ");
			}
			System.out.println();
			
		}
       
	}

}
