package deepak.pack;

import java.util.Scanner;

public class LargestFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3, num4, result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Num1: ");
		num1 = sc.nextInt();
		
		System.out.println("Num2: ");
		num2 = sc.nextInt();
		
		System.out.println("Num3: ");
		num3 = sc.nextInt();
		
		System.out.println("Num4: ");
		num4 = sc.nextInt();
		
		result = (num1<num2 && num1<num3 && num1<num4)?num1:(num2<num1 && num2<num3 && num2<num4)?num2:(num3<num1 && num3<num2 && num1<num4)?num3:num4;
		System.out.println("The largest num in"+num1+" and "+num2+" and "+num3+" and "+num4+" is "+result);
		
		sc.close();
	}
	

}
