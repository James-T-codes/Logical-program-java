package org.vol;
import java.util.*;
public class WeightFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner n=new Scanner(System.in);
   
   System.out.println("enter the array size");
   int m=n.nextInt();
		
		int[] a=new int[m],b=new int[m];
		int sum=0,i=0,j=0;
		System.out.println("enter the elements to the array");
		for(i=0;i<m;i++)
		{
			a[i]=n.nextInt();
			
		}
		
		for(i=0;i<m;i++)
		{
			float s=(int)Math.sqrt(a[i]);
			if(s*s==a[i])
			{
				sum+=5;
			}
			if(a[i]%4==0&&a[i]%6==0)
			{
				sum+=4;
			}
			if(a[i]%2==0)
			{
				sum+=3;
			}
			b[i]=sum;
			sum=0;
		}
		
		for(i=0;i<m;i++)
		{
			for(j=i+1;j<m;j++)
			{
				if(b[i]<b[j])
				{
					int t=b[i];
					int l=a[i];
					b[i]=b[j];
					a[i]=a[j];
					b[j]=t;
					a[j]=l;
				}
			}
		}
		
		for(i=0;i<m;i++)
		{
			System.out.println(a[i]+"->"+b[i]);
		}
		
	}

}
