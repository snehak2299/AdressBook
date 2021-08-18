
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
		int totalRecords=0;
		public static int j = 0;
		public  Contacts[]contact = new Contacts[10];//to store the added contacts
		public void addContact() {
			System.out.println("welcome to address book");	//welcome message
			Scanner sc = new Scanner(System.in); // taking input
			System.out.println("how many records you want to add:");
			int totalRecords=sc.nextInt();
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
				contact[j++] = new Contacts(firstName,lastName,address,city,state, email,zipCode, phoneNumber);
				totalRecords--; 
			}
			
			
			
		}
		public void editContact() {
			System.out.println("enter the name you want to change");
			Scanner sc = new Scanner (System.in);
			String name = sc.nextLine();
			for (int i=0;i<j;i++) {
				String confirm =(String)this.contact[i].firstName;
				if(confirm.equals(name)) {
					boolean ck =true;
					while (ck) {
						System.out.println("what part you want to edit or change");
						System.out.println("1) firstName  2)LastName  3)address  4)city  5)state");
						System.out.println("6)email       7)zipCode   8)phonenumber    9)nothing");
						Scanner sc1 = new Scanner(System.in);
						int choice = sc1.nextInt();
						switch(choice) {
						case 1:System.out.println("enter first name you want to change");
					       Scanner sc2 = new Scanner(System.in);
					       String newfn =sc2.nextLine();
					       contact[i].firstName=newfn;
					       break;
						case 2:System.out.println("enter last name you want to change");
					       Scanner sc3 = new Scanner(System.in);
					       String newln =sc3.nextLine();
					       contact[i].lastName=newln;
					       break; 
						case 3:System.out.println("enter address you want to change");
					       Scanner sc4 = new Scanner(System.in);
					       String newadd =sc4.nextLine();
					       contact[i].address=newadd;
					       break; 
						case 4:System.out.println("enter city you want to change");
					       Scanner sc5 = new Scanner(System.in);
					       String newct =sc5.nextLine();
					       contact[i].city=newct;
					       break;
						case 5:System.out.println("enter state you want to change");
					       Scanner sc6 = new Scanner(System.in);
					       String newst =sc6.nextLine();
					       contact[i].state=newst;
					       break;
						case 6:System.out.println("enter new email");
					       Scanner sc7 = new Scanner(System.in);
					       String newem =sc7.nextLine();
					       contact[i].email=newem;
					       break;
						case 7:System.out.println("enter new zipcode");
					       Scanner sc8 = new Scanner(System.in);
					       int newzc =sc8.nextInt();
					       contact[i].zipCode=newzc;
					       break;
						case 8:System.out.println("enter new number");
					       Scanner sc9 = new Scanner(System.in);
					       int newpn =sc9.nextInt();
					       contact[i].phoneNumber=newpn;
					       break;
						case 9:ck = false;
						    System.out.println("changes are made");
					       break;   
						}
					}
				}
			}
			
		}
		
	
	
	
	public static void main (String[]args) {
		AddressBook obj=new AddressBook();
		Scanner sc = new Scanner(System.in);
		System.out.println("options: 1) To add contacts"+ " 2) To edit contacts");
		System.out.println("enter your option");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			obj.addContact(); // add contact
			
		case 2:
			obj.editContact(); // edit contact
			break;
		}
	}
	}	
		

