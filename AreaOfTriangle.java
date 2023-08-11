package deepak.pack;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		double height, base, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Value of height:");
		height = sc.nextDouble();
		
		System.out.println("Value of base:");
		base = sc.nextDouble();
		
		area = height * base / 2;
		System.out.println("Area of triangle is "+ area);
		
		sc.close();
	}
}
