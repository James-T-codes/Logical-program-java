package org.vol;

import java.util.*;
public class SortMonthYear {

	public static void main(String[] args) {
	
		Scanner n=new Scanner(System.in);
		
		System.out.println("enter the number of dates");
		int a=n.nextInt();
		int[][] mat=new int[a][3];	
		int i,j;
		System.out.println("enter the dates");
		for(i=0;i<a;i++)
		{
			for(j=0;j<3;j++)
			{
				mat[i][j]=n.nextInt();
			}
		}
		System.out.println("the dates");

		int t1,t2,t3;
		for(i=0;i<a-1;i++)
		{
			for(j=i+1;j<a;j++)
			{
				if(mat[i][2]>mat[j][2])
				{
					t1=mat[i][0];
					t2=mat[i][1];
					t3=mat[i][2];
					mat[i][0]=mat[j][0];
					mat[i][1]=mat[j][1];
					mat[i][2]=mat[j][2];
					mat[j][0]=t1;
					mat[j][1]=t2;
					mat[j][2]=t3;
				}
				if(mat[i][2]==mat[j][2]&&mat[i][1]>=mat[j][1])
				{
					t1=mat[i][0];
					t2=mat[i][1];
					t3=mat[i][2];
					mat[i][0]=mat[j][0];
					mat[i][1]=mat[j][1];
					mat[i][2]=mat[j][2];
					mat[j][0]=t1;
					mat[j][1]=t2;
				    mat[j][2]=t3;
				}
				if(mat[i][2]==mat[j][2]&&mat[i][1]==mat[j][1]&&mat[i][0]>=mat[j][0])
				{
					t1=mat[i][0];
					t2=mat[i][1];
					t3=mat[i][2];
					mat[i][0]=mat[j][0];
					mat[i][1]=mat[j][1];
					mat[i][2]=mat[j][2];
					mat[j][0]=t1;
					mat[j][1]=t2;
					mat[j][2]=t3;
				}
			}
		}
		System.out.println("the new sorted dates");
		for(int k[]:mat)
		{
			for(int u:k)
			{
				System.out.print(u+" ");
			}
			System.out.println();
		}
		
	}

}
