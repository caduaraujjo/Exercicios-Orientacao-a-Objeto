package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height:");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("AREA = " + rectangle.Area() );
		System.out.println("PERIMETER = " + rectangle.Perimeter() );
		System.out.println("DIAGONAL = " + rectangle.Diagonal() );
		sc.close();
	}

}
