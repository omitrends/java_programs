package deepak.pack;

import java.util.Scanner;

public class EmployeDetail {

	public static void main(String[] args) {
		int e_id, e_age, e_salary;
		String e_name, e_depart;
		char e_gender;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee ID");
		e_id = sc.nextInt();
		
		System.out.println("Enter employee age:");
		e_age = sc.nextInt();
		
		System.out.println("Enter employee salary");
		e_salary = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter employee name:");
		e_name = sc.nextLine();
		
		System.out.println("Enter employee department:");
		e_depart = sc.nextLine();
		
		System.out.println("Enter employee gender:");
		e_gender = sc.next().charAt(0);
		
		sc.close();
		}
}
