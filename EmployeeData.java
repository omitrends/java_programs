package deepak.pack;

import java.util.Scanner;

class Emp{
	
	int empid;
	String empname;
	int empage;
	int empsalary;
	
	void EmpData(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID");
		empid = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name");
		empname = sc.nextLine();
		
		System.out.println("Enter Age");
		empage = sc.nextInt();
		
		System.out.println("Enter Salary");
		empsalary = sc.nextInt();
		
		sc.close();
	}
	
	void EmpDisplay(){
		
		System.out.println("Employee Id : "+ empid);
		
		System.out.println("Employee Name : "+ empname);
		
		System.out.println("Employee Age : "+ empage);
		
		System.out.println("Employee Salary : "+ empsalary);
	}
	
}

public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp1 = new Emp();
		emp1.EmpData();
		emp1.EmpDisplay();

	}

}
