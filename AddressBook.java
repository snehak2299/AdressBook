
package com.bridglab.addressbook;
import java.util.Scanner;
import java.util.LinkedList;

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

		public String getFirstName() {  //getters and setters
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getZipCode() {
			return zipCode;
		}

		public void setZipCode(int zipCode) {
			this.zipCode = zipCode;
		}

		public int getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
	}
	
	public class AddressBook {
		public LinkedList<Contacts> addressbook=new LinkedList<Contacts>(); //created linked list
		int totalRecords=0;
		public static int j = 0;
		public  Contacts[]contact = new Contacts[10];//to store the added contacts
		public void addContact() {  // method to add contact
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
				Contacts addressBookCollection=new Contacts(firstName,lastName,address,city,state,email,
						zipCode,phoneNumber);

	            addressbook.add(addressBookCollection);
				
				totalRecords--; 
			}
			
			
			
		}
		public void editContact() {  // method to edit contact
			System.out.println("enter the name you want to change");
			Scanner sc = new Scanner (System.in);
			String name = sc.nextLine();
			for (int i=0;i<addressbook.size();i++) {
				String confirm =(String)this.addressbook.get(i).firstName;
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
					       addressbook.get(i).firstName=newfn;
					       break;
						case 2:System.out.println("enter last name you want to change");
					       Scanner sc3 = new Scanner(System.in);
					       String newln =sc3.nextLine();
					       addressbook.get(i).lastName=newln;
					       break; 
						case 3:System.out.println("enter address you want to change");
					       Scanner sc4 = new Scanner(System.in);
					       String newadd =sc4.nextLine();
					       addressbook.get(i).address=newadd;
					       break; 
						case 4:System.out.println("enter city you want to change");
					       Scanner sc5 = new Scanner(System.in);
					       String newct =sc5.nextLine();
					       addressbook.get(i).city=newct;
					       break;
						case 5:System.out.println("enter state you want to change");
					       Scanner sc6 = new Scanner(System.in);
					       String newst =sc6.nextLine();
					       addressbook.get(i).city=newst;
					       break;
						case 6:System.out.println("enter new email");
					       Scanner sc7 = new Scanner(System.in);
					       String newem =sc7.nextLine();
					       addressbook.get(i).email=newem;
					       break;
						case 7:System.out.println("enter new zipcode");
					       Scanner sc8 = new Scanner(System.in);
					       int newzc =sc8.nextInt();
					       addressbook.get(i).zipCode=newzc;
					       break;
						case 8:System.out.println("enter new number");
					       Scanner sc9 = new Scanner(System.in);
					       int newpn =sc9.nextInt();
					       addressbook.get(i).phoneNumber=newpn;
					       break;
						case 9:ck = false;
						    System.out.println("changes are made");
						    System.out.println();
					       break;   
						}
					}
				}
			}
			
		}
		
		public void deleteContact() { //method to delete contact
			System.out.println("enter the first name whos contact you want to delete" );
			Scanner sc10 = new Scanner(System.in);
			String name = sc10.nextLine();
			for (int i=0;i< addressbook.size();i++) {
				if(addressbook.get(i).firstName.equals(name)&&addressbook.get(i)!=null) {
					addressbook.remove(i);
				}
				System.out.println("contact is deleted");
			}
		}
		
		public void showContact() {  //method to show contact
			if(addressbook.size()==0) {
				System.out.println("no contact present");
				System.out.println();
			}
			for( int i = 0 ; i < addressbook.size() ; i++ ) {
			
					
					System.out.println("Firstname: " +  addressbook.get(i).firstName);
					System.out.println("Lastname: " + addressbook.get(i).lastName);
					System.out.println("Address: " + addressbook.get(i).address);
					System.out.println("State: " + addressbook.get(i).state);
					System.out.println("City: " + addressbook.get(i).city);
					System.out.println("Emailid: " + addressbook.get(i).email);
					System.out.println("Zipcode: " + addressbook.get(i).zipCode);
					System.out.println("Phone number: " + addressbook.get(i).phoneNumber);
				
			}	
			

		}
		
	
	
	
	public static void main (String[]args) {
		AddressBook obj=new AddressBook();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("options: 1) To add contacts"+ " 2) To edit contacts" + " 3) To delete contact" + " 4) To show contact");
			System.out.println("enter your option");
			int option = sc.nextInt();
			switch(option) {
			case 1:
				obj.addContact(); // add contact
				break;
			case 2:
				obj.editContact(); // edit contact
				break;
			case 3:
				obj.deleteContact(); //delete contact
				break;
			case 4:
				obj.showContact(); //show contact
				break;
				
			}
			
		}
		
	}
}	
		

