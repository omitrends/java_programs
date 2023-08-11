package deepak.pack;

import java.util.Scanner;

public class LargeNum {
	
	public static void main(String args[]) {
		
		int a,b,c, l, f;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Value of a: ");
		a = sc.nextInt();
		
		System.out.println("Value of b: ");
		b = sc.nextInt();
		
		System.out.println("Value of c: ");
		c = sc.nextInt();
		
		l = (a>b)?a:b;
		System.out.println("The largerst of "+a+"and "+b+"is "+l);
		
		f = (a>b && a>c)?a:(b>a && b>c)?b:c;
		System.out.println("The largerst of "+a+" and "+b+ " and "+c+" is "+f);
		
		
		
		sc.close();
	}

}
