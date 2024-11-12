package project_3;

import java.util.Scanner;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter your full name:");
		String fullName=scanner.nextLine();
		
		System.out.print("Enter your register number: ");
		String regNo=scanner.nextLine();
		
		System.out.print("Enter your grade: ");
		String grade=scanner.nextLine();
		
		System.out.print("Enter your percentage: ");
		float percentage=scanner.nextFloat();
		
		System.out.println("\n Your Details: ");
		System.out.println("Full Name: "+fullName);
		System.out.println("Register Number: "+regNo);
		System.out.println("Grade: "+grade);
		System.out.println("Percentage: "+percentage+"%");
		
		scanner.close();
	}

}
