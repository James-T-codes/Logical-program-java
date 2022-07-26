package org.vol;
import java.util.*;
public class MatrixMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr=new int[3][3],arr2=new int[3][3],arr3=new int[3][3];
		int i,j,k;
		Scanner m=new Scanner(System.in);
        System.out.println("enter the elements to the matrix");
        for(i=0;i<3;i++)
        {
        	for(j=0;j<3;j++)
        	{
        		arr[i][j]=m.nextInt();
        	}
        }
        System.out.println("enter the elements to the matrix");
        for(i=0;i<3;i++)
        {
        	for(j=0;j<3;j++)
        	{
        	arr2[i][j]=m.nextInt();
        	}
        }
        System.out.println("the matrix multiplication");
        for(i=0;i<3;i++)
        {
        	for(j=0;j<3;j++)
        	{
        		arr3[i][j]=0;
        		for(k=0;k<3;k++)
        		{
        		   arr3[i][j]+=arr[i][k]*arr2[k][j];	
        		}
        		System.out.print(arr3[i][j]+" ");
        	}
        	System.out.println();
        }
        
	}

}
