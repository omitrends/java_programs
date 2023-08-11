package deepak.pack;

import java.util.Scanner;

public class FindThelargestThree {

	public static void main(String[] args) {
		int n1,n2,n3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num1:");
		n1 = sc.nextInt();
		
		System.out.println("Enter the num2:");
		n2 = sc.nextInt();
		
		System.out.println("Enter the num3:");
		n3 = sc.nextInt();
		
		if (n1>n2 && n1>n3) {
			System.out.println("Num1 is largest");
		}
		
		else if (n2>n1 && n2>n3) {
			System.out.println("Num2 is largest");
		}
		
		else {
			System.out.println("Num3 is largest");
		}
		
		sc.close();

	}

}
