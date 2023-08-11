package deepak.pack;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		int length,breadth,area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length");
		length = sc.nextInt();
		
		System.out.println("Enter breadth");
		breadth = sc.nextInt();
		
		area = length*breadth;
		System.out.println("The area of reactangle of length="+length+" and breadth ="+breadth +" is "+area);
		
		sc.close();
	}
}
