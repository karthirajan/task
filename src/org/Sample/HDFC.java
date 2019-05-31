package org.Sample;

public class HDFC extends AxisBank {

	@Override
	public void deposit() {
		System.out.println("10%");
	}

	private void fixedAccount() {
		System.out.println("7%");
	}
 @Override
public void savingsAccount(String interest) {
	System.out.println(interest);
}

public static void main(String[] args) {
	HDFC h=new HDFC();
	h.deposit();
	h.savingsAccount("9%");
	h.fixedAccount();
}


}
