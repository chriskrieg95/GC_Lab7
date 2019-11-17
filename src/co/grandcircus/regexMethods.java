package co.grandcircus;

import java.util.Scanner;

public class regexMethods {

	public static void main(String[] args) {
//		System.out.println(isValidName("Chris"));
//		System.out.println(isValidEmail("chriskrieg95@gmail.com"));
//		System.out.println(isValidPhoneNumber("(248)317-1273"));
//		System.out.println(isValidDate("07/12/1995"));
//		System.out.println(isValidHTML("<'br />"));
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter a valid name: ");
		String name = "";
		name = scnr.nextLine();
		do {
			 if (!isValidName(name)) {
				 System.out.println("Sorry, name is not valid! Please try again.");
				 System.out.println("Please enter a valid name: ");
				 name = scnr.nextLine();
				 
			 } 
		} while (!isValidName(name));
		
			
		System.out.println("Fulfilled the requirements for name.");
		System.out.println("");
		System.out.println("Please enter a valid email address: ");
		String email = "";
		email = scnr.nextLine();
		do {
			if (!isValidName(email)) {
				System.out.println("Sorry, email address is not properly formatted!");
				System.out.println("Please enter a valid email address: ");
				email = scnr.nextLine();
			} 
		} while (!isValidEmail(email));
		
		System.out.println("Fulfilled the requirements for email.");
		System.out.println("");
		System.out.println("Please enter a valid date: ");
		String date = "";
		date = scnr.nextLine();
		do {
			if (!isValidName(date)) {
				System.out.println("Sorry, date entered is not properly formatted!");
				System.out.println("Please enter a valid date: ");
				date = scnr.nextLine();
			}
		} while (!isValidDate(date));
		
		
		System.out.println("Fulfilled the requirements for date.");
		
		scnr.close();
	}
		 
	
	private static boolean isValid(String name, String regex) {
		return name.matches(regex);
	}
	
	public static boolean isValidName(String name) {
		return isValid(name, "[A-Z][a-z]{1,30}");
	}
	
	public static boolean isValidEmail(String email) {
		return isValid(email, "\\w{1,30}[@][a-z]{5,10}[.]\\w{2,3}");
	}
	
	public static boolean isValidPhoneNumber(String phoneNumber) {
		return isValid(phoneNumber,"\\(\\d{3}\\)\\d{3}-\\d{4}");
	}
	
	public static boolean isValidDate(String date) {
		return isValid(date, "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$"); 
	}
	
	public static boolean isValidHTML(String html) {
		return isValid(html, "<(\"[^\"]*\"|'[^']*'|[^'\">])*>");
	}
	

}
