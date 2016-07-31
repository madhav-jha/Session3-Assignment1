package session3.assignment1;

import java.lang.Math;
import java.util.Scanner;

public class MathsCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		double number = sc.nextDouble();
		System.out.println("Square root of "+number+" = "+Math.sqrt(number));
		System.out.println("Cube root of "+number+" = "+Math.cbrt(number));
	}

}
