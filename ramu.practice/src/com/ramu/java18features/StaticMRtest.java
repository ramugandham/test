package com.ramu.java18features;

interface PracticeTest{
	void practice();
}


public class StaticMRtest {
	public static void job() {
		System.out.println("this is static method refrence");
	}

	public static void main(String[] args) {
		/*PracticeTest test=()->{System.out.println("rameshsoft");
			
		};
		test.practice();*/
		PracticeTest test1=StaticMRtest::job;
		test1.practice();
		
	}

}
