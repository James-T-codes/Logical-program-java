package org.vol;

import java.util.*;
public class CarPetrol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner n=new Scanner(System.in);
     
     int[]  punkd=new int[3],cap=new int[3];
     int i,c;
     char a[]=new char[3];
     System.out.println("enter the petrol punks");
     for(i=0;i<3;i++)
     {
    	 a[i]=n.next().charAt(0);
     }
     System.out.println("enter the punk distance");
     for(i=0;i<3;i++)
     {
    	 punkd[i]=n.nextInt();
     }
     System.out.println("enter the punk capacity");
     for(i=0;i<3;i++)
     {
    	 cap[i]=n.nextInt();
     }
     System.out.println("enter the petrol actually in the car");
      c=n.nextInt();
     
     for(i=0;i<3;i++)
     {
    	 c=c-punkd[i];
    	 c=c+cap[i];
     }
	System.out.println("the remaining petrol "+c+"LITRE");
	}

}
