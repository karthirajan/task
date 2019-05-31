package org.Sample;

public class Employee {
	// depends on datatype
	private void dataBase(int id) {
		System.out.println(id);
	}

	// Depends on datatype order
	private void dataBase(int id, String name) {
		System.out.println("My id and name is:" + id + "\t" + name);
	}

	private void dataBase(long mobno, String email, String dob) {
		System.out.println("my mobno,email and dob is:" + mobno + "\t" + email + "\t " + dob);
	}

//depends on datatype count or number
	private void dataBase(float salary, char block, String doj) {
		System.out.println("my salry,block and doj is:" + salary + "\t" + block + "\t" + doj);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
         e.dataBase(123);
         e.dataBase(1234, "Farith");
         e.dataBase(23.5f, 'A', "12.12.2019");
         e.dataBase(9500746453l, "Syed@gmail.com", "12.12.2018");
         
	}
}
