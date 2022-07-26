package org.vol;

import java.util.*;
public class RemoveUnbalance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner mt=new Scanner(System.in);
     
     System.out.println("enter the string");
     String ni=mt.next();
     
     int[]  left =new int[5],right =new int[5],tempre =new int[5];
     int max,fact,i,j,temp = 0,k=0,lt=0,rt=0;
     
     char[] n=ni.toCharArray();
     
     for(i=0;i<n.length;i++)
     {
    	 if(n[i]=='(')
    	 {
    		 left[lt++]=i;
    	 }
    	 if(n[i]==')')
    	 {
    		 right[rt++]=i;
    	 }
    	 
     }
     max=lt<rt?2:1;
     fact=Math.abs(lt-rt);
     
     for(i=0;i<fact;i++)
     {
    	 if(max==1)
    	 {
    		 lt--;
    		 tempre[k++]=left[lt]; 
    	 }
    	 else if(max==2)
    	 {
    		 rt--;
    		 tempre[k++]=right[rt];
    	 }
    	 
     }
     
     if(k>0)
     {
    	 k--;
    	 temp=tempre[k];
     }
     for(i=0;i<n.length;i++)
     {
    	 if(i==temp)
    	 {
    		 if(k>0)
    		 {
    			 k--;
    			 temp=tempre[k];
    		 }
    	 }
    	 else
    		 System.out.print(n[i]+" ");
     }
		
	}

}
