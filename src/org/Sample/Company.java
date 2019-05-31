package org.Sample;

public class Company extends Employee {
	public Company() {
		super(10);

		System.out.println("Child defult constructor");
	}

	public Company(int id) {
		System.out.println(id);
	}

	public static void main(String[] args) {
		Company c = new Company();
	}
}
