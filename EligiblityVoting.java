package deepak.pack;

import java.util.Scanner;

public class EligiblityVoting {

	public static void main(String[] args) {
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		age = sc.nextInt();
		
		if(age>= 18) {
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("Not eligible for voting");
			}
		sc.close();
	}

}
