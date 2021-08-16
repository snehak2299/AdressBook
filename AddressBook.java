<<<<<<< HEAD
package com.bridglab.addressbook;

public class AddressBook {
	
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
		}
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("welcome to address book program");
=======
package com.bridgelab.addressbook;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to address book program");
>>>>>>> 924217e76c06144898623cc08bb04aefbe66c721

	}

}
