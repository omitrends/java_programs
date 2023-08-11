package deepak.pack;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num:");
		num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("Positive");
		}
		else if(num < 0){
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
		
		sc.close();
	}
}
