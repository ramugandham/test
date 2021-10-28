package com.ramu.java18features;

interface Job{
	int length(String str);
}
//1st way
/*class Two1 implements Job{

	
	@Override
	public int length(String str) {
		// TODO Auto-generated method stub
		return str.length();
	}
}
*///
public class FinterfaceVSlambdaexp2 {
public static void main(String[] args) {
	//1st way
		/*Job job=new Two1();
		int length=job.length("hello");
		System.out.println(length);
*/		//2nd way
		Job job1=( String s)	->	{ int length=s.length();
		                        return length;};
		                        System.out.println(  job1.length("gandham"));
		                        }
		}


