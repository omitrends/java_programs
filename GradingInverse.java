package deepak.pack;

import java.util.Scanner;

public class GradingInverse {
	
public static void main(String[] args) {
		
		char marks;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter students marks:");
		marks = sc.next().charAt(0);
		
		if (marks == 'A' || marks == 'a') {
			System.out.println("Marks is between 90 to 100");
		}
		
		else if (marks == 'B' || marks == 'b') {
			System.out.println("Marks is between 70 to 89");
		}
		
		else if (marks == 'C' || marks == 'c') {
			System.out.println("Marks is between 50 to 69");
		}
		else if (marks == 'D' || marks == 'd') {
			System.out.println("Marks is between 0 to 49");
		}
		
		else {
			System.out.println("Enter valid grade");
		}
		
		sc.close();
		

	}

}
