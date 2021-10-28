package com.rameshsoft.automation.seleniumcore;

class A
{
	public void login() {
		System.out.println("Login");
	}
	public void logout() {
		System.out.println("Logout");
	}
	public void hello() {
		System.out.println("Plz practice");
	}
}
class B extends A
{
	public void display() {
		System.out.println("Dependency indicates ..... emptiness ");
	}
}
public class InheritenceTest {
public static void main(String[] args) {
	//1. creating parent class object
	A a = new A();
	a.login();
	a.hello();
	a.logout();
	//a.display();CE
	
	//2. creating child class object
	B b = new B();
	b.login();
	b.hello();
	b.display();
	b.logout();
	
	//3. creating child class object using parent class reference
	A a1 = new B();
	a1.login();
	a1.hello();
	a1.logout();
	//a1.display(); CE
	
	//4. by using child class reference creating parent class object
	//B b1 = new A(); CE
	
	//5. using interface reference creating object for implementation classes
		
}
}


