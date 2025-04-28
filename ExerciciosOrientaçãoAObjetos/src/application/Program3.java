package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		student.Name = sc.nextLine();
		student.Nota1 = sc.nextDouble();
		student.Nota2 = sc.nextDouble();
		student.Nota3 = sc.nextDouble();
		sc.close();

		if (student.finalGrade() > 60) {
			System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
			System.out.println("PASS");
		} else {
			System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missing());
		}
	}
}
