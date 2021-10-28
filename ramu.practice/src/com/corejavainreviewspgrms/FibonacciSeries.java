package com.corejavainreviewspgrms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num=12; 
		int a=0,b=1;
		
		for(int i=0;i<num;i++) {
			System.out.print(a+" ");	
			int sum=a+b;
			a=b;
			b=sum;
			//System.out.println(a+" ");	
		}

	}
	/*FibonacciExample1 
	public static void main(String args[])  
	{    
	 int n1=0,n2=1,n3,i,count=10;    
	 System.out.print(n1+" "+n2);//printing 0 and 1    
	    
	 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 }    
	  

	}*/

}
