package org.vol;

import java.util.*;
public class BooleanMatrix {

	public static void main(String[] args) {
		
	   Scanner m=new Scanner(System.in);
	 
	   System.out.println("enter the size of the matrix");
	   int n=m.nextInt();
	   int mat[][]=new int[n][n],i,j,row[]=new int[n],col[]=new int[n];
	   for(i=0;i<n;i++)
	   {
		   row[i]=0;
		   col[i]=0;
	   }
	   System.out.println("enter the elements to the matrix");
	   for(i=0;i<n;i++)
	   {
		   for(j=0;j<n;j++)
		   {
			   mat[i][j]=m.nextInt();
			   if(mat[i][j]==1)
			   {
				   row[i]=1;
				   col[j]=1;
			   }
		   }
	   }
	  
	   for(i=0;i<n;i++)
	   {
		   for(j=0;j<n;j++)
		   {
			   if(row[i]==1||col[j]==1)
			   mat[i][j]=1;
		   }
	   }
	   System.out.println("the matrix is");
	   for(i=0;i<n;i++)
	   {
		   for(j=0;j<n;j++)
		   {
			   System.out.print(mat[i][j]+" ");
		   }
		   System.out.println();
	   }

	}

}
