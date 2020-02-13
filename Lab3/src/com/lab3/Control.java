package com.lab3;
import java.util.Scanner;
public class Control {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your First name");
		String name = input.nextLine();
		System.out.println("Enter you surname");
		String surname = input.nextLine();
		System.out.println("Enter your staff number");
		int staffno = Integer.parseInt(input.nextLine());
		System.out.println("Enter you salary \n €");
		double salary = Double.parseDouble(input.next());
		
		Employee p1 = new Employee(name,surname,staffno,salary);
		p1.setFirstName(name);
		p1.setSurName(surname);
		p1.setStaffNumber(staffno);
		p1.setAnnualSalary(salary);
		
		System.out.println(p1.getFirstName());
		System.out.println(p1.getSurName());
		System.out.println(p1.getStaffNumber());
		System.out.println(p1.getAnnualSalary());
		System.out.println(p1.calculatePay(salary));
	}

}
