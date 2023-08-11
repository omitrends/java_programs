package deepak.pack;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		double radius, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Value of radius:");
		radius = sc.nextDouble();
		
		area = Math.PI * radius * radius;
		System.out.println("The area of the circle is: " + area);
		
		sc.close();
		}
}
