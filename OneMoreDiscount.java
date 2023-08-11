package deepak.pack;

import java.util.Scanner;

public class OneMoreDiscount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float price, amt,disc;
		
		System.out.println("Enter the price of product:");
		price = sc.nextFloat();
		
		if (price>0 && price<= 1000) {
			disc = price*0.02f;
			amt = price - disc ;
		}
		else if (price>1000 && price<= 3000) {
			disc = price*0.1f;
			amt = price - disc ;
		}
		else {
			disc = price*0.15f;
			amt = price - disc ;
		}
		System.out.println(amt);
		sc.close();

	}

}
