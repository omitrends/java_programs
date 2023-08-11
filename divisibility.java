package deepak.pack;

import java.util.Scanner;

public class divisibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.println("Enter Number to Check divisibility: ");
		a = sc.nextInt();
		
		if(a == 0)
			System.out.println(a+ " is not divisible by 3 or 5");
		else if(a%3 == 0 && a%5 == 0)
			System.out.println(a+ " is divisible by 3 and 5");
		else if(a%3 == 0 && a%5!=0)
			System.out.println(a+ " is divibile by 3 but not 5");
		else if(a%3 != 0 && a%5==0)
			System.out.println(a+ " is divibile by 5 but not 3");
		sc.close();
		
	}

}
