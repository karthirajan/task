package org.test;

import org.Sample.Company;
import org.Sample.Employee;

public class Client {

	
	public void cliName() {
		System.out.println("cli  name is air canada");
	}
	
	
	public void cliId() {
		System.out.println("cli id is 234567");
	}
	
	
	public static void main(String[] args) {
		Client c=new Client();
		c.cliId();
		c.cliName();
		Company ci=new Company();
		ci.comId();
		ci.comName();
		Employee e=new Employee();
		e.empId();
		e.empName();
	}
}
