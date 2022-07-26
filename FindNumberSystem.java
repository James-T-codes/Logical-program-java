package org.vol;

public class FindNumberSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t=0,temp=0,h=0,f;
		
		while(t<10000)
		{
			f=1;
			temp=t;
			while(temp>10)
			{
				h=temp%10;
				temp/=10;
				if(h!=3&&h!=4)
				{
					f=0;
				}
				
			}
			if((temp==3||temp==4)&&(f==1))
			{
				System.out.println(t);
			}
			t++;
		}
	}

}
