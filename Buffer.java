package deepak.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {
   public static void main(String[] args) throws NumberFormatException, IOException {
	int sid;
	String sname;
	float sfees;
	char sgender;
	 
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	System.out.println("Enter student id");
	sid = Integer.parseInt(br.readLine());
	 
	System.out.println("Enter name");
	sname=br.readLine();
	 
	System.out.println("Enter fees");
	sfees = Float.parseFloat(br.readLine());
	 
	System.out.println("Enter gender");
	sgender = (char)br.read();
	 
	System.out.println("Student Details");
	System.out.println("Id="+sid);
	System.out.println("Name="+sname);
	System.out.println("Fees="+sfees);
	System.out.println("Gender="+sgender);
	}
}