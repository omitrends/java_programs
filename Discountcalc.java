package deepak.pack;

import java.util.Scanner;

public class Discountcalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pname;
		float price, amt,disc;
		
		System.out.println("Enter the product name:");
		pname = sc.nextLine();
		
		System.out.println("Enter the price of product:");
		price = sc.nextFloat();
		
		if (price>0 && price<= 10000) {
			disc = price*0.05f;
			amt = price - disc ;
		}
		else if (price>10000 && price<= 20000) {
			disc = price*0.1f;
			amt = price - disc ;
		}
		else if (price>20000 && price<= 35000) {
			disc = price*0.15f;
			amt = price - disc ;
		}
		else {
			disc = price*0.2f;
			amt = price - disc ;
		}
		System.out.println(amt);
		sc.close();

	}

}
