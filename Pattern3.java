package org.vol;

public class Pattern3 {

	public static void main(String[] args) {
		
		int i,j,p;
		for(i=5;i>=1;i--)
		{
			int t=5;
			for(j=1;j<=5;j++)
			{
				System.out.print(t+" ");
				if(t>i&&t!=i)
					t--;
				
			}
			System.out.println();
		}

	}

}
