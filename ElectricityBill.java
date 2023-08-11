package deepak.pack;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int unit;
		float amt;
		String name;

		System.out.println("Enter the name of customer:");
		name = sc.nextLine();
		
		System.out.println("Enter the bill:");
		unit = sc.nextInt();
		
		if (unit > 0 && unit <= 200) {
			amt = unit * 3.80f;
		}
		else if (unit > 200 && unit <= 300) {
			amt = 200 * 3.80f + (unit%200)*4.40f;
		}
		else if (unit > 300 && unit <= 400) {
			amt = 200 * 3.80f + 100*4.40f + (unit%300)*5.10f ;
		}
		else {
			amt = 200 * 3.80f + 100*4.40f + 100*5.10f + (unit%400)*5.80f ;
		}
		System.out.println(name);
		System.out.println("You have to pay "+ amt +" for "+ unit+" units.");
		sc.close();
	}

}
