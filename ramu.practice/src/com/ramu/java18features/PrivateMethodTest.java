package com.ramu.java18features;

public interface PrivateMethodTest {
	//java 1.9 version  to avoid duplicate code to introduced concept inside interface private methods decleard
	public static void login() {
		//System.out.println("hello hi how are u");
		hello();
	}
	public static void logout() {
		//System.out.println("hello hi how are u..xbxcg");
		hello();
	}
	static void hello(){
		System.out.println("hello hi how are u");
		System.out.println("hello hi how are u..xbxcg");
		
	}
	public static void main(String[] args) {
		
		login();
		logout();
	}
	
}
