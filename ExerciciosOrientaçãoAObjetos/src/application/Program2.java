package application;

import java.util.Locale;

import java.util.Scanner;

import entities.Employee;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: " + employee.name + ", "  + "$ %.2f%n", employee.netSalary() );
		
		System.out.println();
		System.out.printf("Which percentage to increase salary?");
		employee.IncreaseSalary(sc.nextDouble());
		
		System.out.println();
		System.out.printf("Update data: %s, $ %.2f%n", employee.name, employee.netSalary());
		
		sc.close();

	}

}
