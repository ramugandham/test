package com.rameshsoft.automaton.gmail.businessscripts;

interface BankAtm
{
	String name = "RBI";//public static final
	void cashWithDraw();//public abstract
	void pinChange();
	public abstract void balEnq();
}
class RBIImpl implements BankAtm
{
	@Override
	public void cashWithDraw() {
	System.out.println("CashWithDraw");	
	}
	@Override
	public void pinChange() {
		System.out.println("PinChange");
	}
	@Override
	public void balEnq() {
		System.out.println("BalEnq");
	}
	public void display() {
		System.out.println("PLZ Practice");
	}
}
class SBHImpl extends RBIImpl
{
	public void bankName() {
		System.out.println("SBH Services");
	}
}
class ABImpl extends RBIImpl
{
	public void bankName() {
		System.out.println("AB Services");
	}
}
public interface InterfaceTest {
public static void main(String[] args) {

	/*RBIImpl r = new RBIImpl();
	r.balEnq();
	r.cashWithDraw();
	r.display();
	r.pinChange();
	*/
	
	BankAtm a = new RBIImpl();
	a.balEnq();
	a.cashWithDraw();
	a.pinChange();
	//a.display(); CE
	
	BankAtm bankAtm = new SBHImpl();
	bankAtm.balEnq();
	bankAtm.cashWithDraw();
	bankAtm.pinChange();	
	
}
}
