package deepak.pack;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num:");
		num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
		
		sc.close();

	}

}
