
package com.bridglab.addressbook;
import java.util.Scanner;
	
	class Contacts{
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		String email;
		int zipCode;
		int phoneNumber;
		
		//created constructor using filed 
		public Contacts(String firstName, String lastName, String address, String city, String state, String email,
				int zipCode, int phoneNumber) {
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.city = city;
			this.state = state;
			this.email = email;
			this.zipCode = zipCode;
			this.phoneNumber = phoneNumber;
			System.out.println("contact added succesfully");
			
		}
	}
	
	public class AddressBook {

		public static void main(String[] args) {
			System.out.println("welcome to address book");	//welcome message
			Scanner sc = new Scanner(System.in); // taking input
			System.out.println("how many records you want to add:");
			int totalRecords=sc.nextInt();
			Contacts[]arr = new Contacts[totalRecords]; //to store the added contacts
			while(totalRecords!=0) {
				System.out.println("enter first name: ");
				// to stop going to next line adding dummy value
				String dummy = sc.nextLine();
	            String firstName = sc.nextLine();
				System.out.println("enter last name:");
				String lastName = sc.nextLine();
				System.out.println("enter address: ");
				String address = sc.nextLine();
				System.out.println("enter city: ");
				String city = sc.nextLine();
				System.out.println("enter state");
				String state= sc.nextLine();
				System.out.println("enter email");
				String email= sc.nextLine();
				System.out.println("enter zip code:");
				int zipCode = sc.nextInt(); 
				System.out.println("enter phone number:");
				int phoneNumber = sc.nextInt(); 
				//creating new object
				Contacts contact = new Contacts(firstName,lastName,address,city,state, email,zipCode, phoneNumber);
				totalRecords--; 
			}
			
			
		}
	}	
		
		

