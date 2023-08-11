package deepak.pack;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		int side, area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Value of side:");
		side = sc.nextInt();
		
		area = side * side;
		
		System.out.println("Area of square is "+ area);
		
		sc.close();
	}
}
