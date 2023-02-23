package curso_programacao;


import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle triangle = new Triangle();
		
		System.out.println("Enter rectangle height and width: ");
		System.out.print("Height: ");
		triangle.height = sc.nextDouble();
		System.out.print("Width: ");
		triangle.width = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", triangle.CalculeArea());
		System.out.printf("PERIMETER = %.2f%n", triangle.CalculePerimeter());
		System.out.printf("DIAGONAL = %.2f%n", triangle.CalculeDiagonal());
		
		
		sc.close();
	}

}
