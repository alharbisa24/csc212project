import java.util.Date;
import java.util.Scanner;

public class PhoneBook {
	static LinkedList<Contact> conts = new LinkedList();
	static LinkedList<Event> events = new LinkedList();
	static Scanner input = new Scanner(System.in);

	
	public static void Searchcontact() {
		System.out.println("Enter search criteria:");
		System.out.println("1.Name");
		System.out.println("2.Phone Number");
		System.out.println("3.Email Address");
		System.out.println("4.Address");
		System.out.println("5.Birthday");
		System.out.print("Enter your choies");
		int Choice = input.nextInt();
		if (conts.empty())
			System.out.println("Contact its empty");
		else {
			conts.findFirst();
			switch (Choice) {
			case 1: {
				System.out.print("Enter the contacts name:");
				String n = input.next();
				boolean found = false;
				while (!conts.findlast()) {
					if (conts.retrieve().getContact_name().equalsIgnoreCase(n)) {
						System.out.println("Contact found!");
						System.out.println("Name: " + conts.retrieve().getContact_name());
						System.out.println("Phone number: " + conts.retrieve().getContact_number());
						System.out.println("Email address: " + conts.retrieve().getContact_mail());
						System.out.println("Address: " + conts.retrieve().getContact_address());
						System.out.println("Birthday: " + conts.retrieve().getContact_birthDay());
						System.out.println("Notes: " + conts.retrieve().getContact_notes());
found = true;
						
					}
					conts.findNext();
				}
				if(found == false)
					System.out.print("Contact not found !\n");
			}
				break;
			case 2: {
				System.out.println("Enter the contacts phone number");
				String phonenumber = input.next();
				boolean found = false;
				while (!conts.findlast()) {
					if (conts.retrieve().getContact_number().compareTo(phonenumber) == 0) {
						System.out.println("Contact found!");
						System.out.println("Name: " + conts.retrieve().getContact_name());
						System.out.println("Phone number: " + conts.retrieve().getContact_number());
						System.out.println("Email address: " + conts.retrieve().getContact_mail());
						System.out.println("Address: " + conts.retrieve().getContact_address());
						System.out.println("Birthday: " + conts.retrieve().getContact_birthDay());
						System.out.println("Notes: " + conts.retrieve().getContact_notes());
					found = true;
					}
					conts.findNext();

				}
				if(found == false)
					System.out.print("Contact not found !\n");
			}
				break;

			case 3: {
				System.out.println("Enter the contacts Email Address");
				String email = input.next();
				boolean found = false;
				while (!conts.findlast()) {
					if (conts.retrieve().getContact_mail().compareTo(email) == 0) {
						System.out.println("Contact found!");
						System.out.println("Name: " + conts.retrieve().getContact_name());
						System.out.println("Phone number: " + conts.retrieve().getContact_number());
						System.out.println("Email address: " + conts.retrieve().getContact_mail());
						System.out.println("Address: " + conts.retrieve().getContact_address());
						System.out.println("Birthday: " + conts.retrieve().getContact_birthDay());
						System.out.println("Notes: " + conts.retrieve().getContact_notes());
						found = true;
					}
					conts.findNext();
				}
				if(found == false)
					System.out.print("Contact not found !\n");
			}
				break;
			case 4: {
				System.out.println("Enter contacts address");
				String address = input.next();
				boolean found = false;
				while (!conts.findlast()) {
					if (conts.retrieve().getContact_address().compareTo(address) == 0) {
						System.out.println("Contact found!");
						System.out.println("Name: " + conts.retrieve().getContact_name());
						System.out.println("Phone number: " + conts.retrieve().getContact_number());
						System.out.println("Email address: " + conts.retrieve().getContact_mail());
						System.out.println("Address: " + conts.retrieve().getContact_address());
						System.out.println("Birthday: " + conts.retrieve().getContact_birthDay());
						System.out.println("Notes: " + conts.retrieve().getContact_notes());
						found = true;
					}
					conts.findNext();
					
				}
				if(found == false)
					System.out.print("Contact not found !\n");

			}
				break;
			case 5: {
				System.out.println("Enter contacts Birthday");
				Date date = new Date(input.next());
				boolean found = true;
				while (!conts.findlast()) {
					if (conts.retrieve().getContact_birthDay().compareTo(date) == 0) {
						System.out.println("Contact found!");
						System.out.println("Name: " + conts.retrieve().getContact_name());
						System.out.println("Phone number: " + conts.retrieve().getContact_number());
						System.out.println("Email address: " + conts.retrieve().getContact_mail());
						System.out.println("Address: " + conts.retrieve().getContact_address());
						System.out.println("Birthday: " + conts.retrieve().getContact_birthDay());
						System.out.println("Notes: " + conts.retrieve().getContact_notes());
						found = true;
					}
					conts.findNext();
				}
				if(found == false)
					System.out.print("Contact not found !\n");
			}
				break;
			}

		}
	}

	public static void deletcontact(String name) {
		if (conts.empty())
			System.out.println("Contact list its empty");
		else {
			Contact resultfound = searchByName(name);
			if(resultfound != null) {

			if(conts.retrieve().event == null || conts.retrieve().event.empty()) { // check if contact have events or not
				
				
				conts.remove(resultfound);
				System.out.println("the contact dont have event");
				System.out.println("Contact deleted successfully ");
				
				
		
				} else {
					conts.retrieve().event.findFirst(); 
					while (!conts.retrieve().event.findlast()) {
						Event e = events.retrieve();
						if (events.search(e)) {
							events.remove(e);

						}
						conts.remove(resultfound);

						conts.retrieve().event.findNext();
					}
			

					
					System.out.println("Contact deleted successfully \n");

			}
			
		
			
			
			
			

		}else {
			
			System.out.print("contact not found !\n");
		}
		
		}
	}
	
		
		/*
		 * this method for search in contacts list by name to get object
		 */
		public static Contact searchByName(String name) {
			/*
			 * in the first will check if list is empty then return false (not found);
			 */
			if (conts.empty()) {//1
				return null;//1
			}
			/*
			 * current will be in first element in list.
			 */
			conts.findFirst(); //1
	/*
	 * here we will check all elements from the first element to before last elemeny (n-1)
	 */
			while (!conts.last()) {  // n
				if (conts.retrieve().getContact_name().equalsIgnoreCase(name)) {  // n
																				
					return conts.retrieve();///1
			}
				conts.findNext(); //n

				}
			if (conts.retrieve().getContact_name().equalsIgnoreCase(name)) {  // n
				
				return conts.retrieve();///1
		}
			return null;
			}
			
	
	/*
	 * this method for search in contacts list by number
	 */
	public static boolean search_number(String number) {
		/*
		 * in the first will check if list is empty then return false (not found);
		 */
		if (conts.empty()) {
			return false;
		}
		/*
		 * current will be in first element in list.
		 */
		conts.findFirst(); //1
/*
 * here we will check all elements from the first element to before last elemeny (n-1)
 */
		while (!conts.last()) { 
			if (conts.retrieve().getContact_number().equals(number)) { 
																			
				return true;
		}
			conts.findNext(); 

			}
		/*
		 * here we will check last element in the list if it its have same contact number or not
		 */
		if (conts.retrieve().getContact_number().equals(number)) { 
			return true;
			
		

	}
		return false; //1
	}

	public static void print_firstname(String name) {
		if (conts.empty()) {
			
			System.out.println("contacts is empty !");
			return;
		}
		
		if(searchByName(name) == null) {
			System.out.println("contacts not found !");
return;
		}else {
		conts.findFirst();


		while (!conts.last()) {
			if(conts.retrieve().getContact_name().equalsIgnoreCase(name))
System.out.print("Name:" + conts.retrieve().getContact_name()
		+ "\nPhone Number:" + conts.retrieve().getContact_number()
		+ "\nEmail Address:" + conts.retrieve().getContact_mail()
		+ "\nAddress: " + conts.retrieve().getContact_address()
		+ "\nBirthday:" + conts.retrieve().getContact_birthDay()
		+ "\nNotes:" + conts.retrieve().getContact_notes());
System.out.print("\n");

conts.findNext();
		}
		if(conts.retrieve().getContact_name().equalsIgnoreCase(name))
		System.out.print("Name:" + conts.retrieve().getContact_name()
				+ "\nPhone Number:" + conts.retrieve().getContact_number()
				+ "\nEmail Address:" + conts.retrieve().getContact_mail()
				+ "\nAddress: " + conts.retrieve().getContact_address()
				+ "\nBirthday:" + conts.retrieve().getContact_birthDay()
				+ "\nNotes:" + conts.retrieve().getContact_notes());
		System.out.print("\n");

	}
	}
	

	public static void print_alph() {
		if (events.empty()) {
			System.out.println("There are no events\n");
			return; 
		}
		events.findFirst();
		while (!events.last()) {

			System.out.println("Event title:" + events.retrieve().getEvent_title());
			System.out.println("\nContact name:" + events.retrieve().Contact.getContact_name());
			System.out.println("\nEvent date and time:" + events.retrieve().getEvent_date_time());
			System.out.println("\nEvent location:" + events.retrieve().getEvent_location());
			System.out.print("\n");
			events.findNext();
		}
		System.out.println("Event title:" + events.retrieve().getEvent_title());
		System.out.println("\nContact name:" + events.retrieve().Contact.getContact_name());
		System.out.println("\nEvent date and time:" + events.retrieve().getEvent_date_time());
		System.out.println("\nEvent location:" + events.retrieve().getEvent_location());
		System.out.print("\n");
		}

	public static void main(String[] args) {

		
	
	
		Scanner input = new Scanner(System.in);
		int choice = 0;

		System.out.println("\nWelcome to the Linked Tree Phonebook !");
		do {
			System.out.println("Please choose an option");
			System.out.println("1. Add a contact");
			System.out.println("2. Search for a contact");
			System.out.println("3. Delete a contact");
			System.out.println("4. Schedule an event");
			System.out.println("5. Print event details");
			System.out.println("6. Print contacts by first name");
			System.out.println("7. Print all events alphabetically");
			System.out.println("8. Exit\n");
			System.out.print("Enter your choice: ");
			choice = input.nextInt();
			System.out.println();
			switch (choice) {
				case 1:

					System.out.print("Enter the contact's name: ");
					String contact_name = input.next();
					while(searchByName(contact_name) != null) {
						System.out.print("Contact is already exists! ");
						
						System.out.print("\nEnter contact's name: ");
						 contact_name = input.nextLine();

					}
			
					System.out.print("Enter the contact's phone number: ");
					String contact_phone = input.next();
					
					while(search_number(contact_phone)) {
						System.out.print("Contact number is already exists! ");
						
						System.out.print("Enter the contact's phone number: ");
						contact_phone = input.next();

					}
					System.out.print("Enter the contact's email address: ");
					String contact_mail = input.next();
					
					System.out.print("Enter the contact's address: ");
					String contact_address = input.next();
					
					System.out.print("Enter the contact's birthday: ");
					Date contact_birthday = new Date(input.next());
					
					System.out.print("Enter any notes for the contact: ");
					String contact_note = input.next();


						Contact newcont = new Contact(contact_name, contact_phone, contact_mail, contact_address, contact_birthday, contact_note);
						conts.insert(newcont);
						System.out.println("Contact added successfully!");
						
					break;

					
				case 2:
					Searchcontact();

					break;
				case 3:
					// delete contact and events of there in big events list (in phonebook class)
					
					System.out.print("Enter Contact name: ");
					String cont_delete_name = input.next();
					deletcontact(cont_delete_name);
					break;
				case 4:
				
					break;
			
				case 5:
					
					break;
				case 6:
					
					System.out.print("Enter the first name: ");
					String firstname = input.next();

					print_firstname(firstname);

					break;
				case 7:
					print_alph();
					break;

				default:
					System.out.println("Invalid input! \n");
			}

		} while (choice != 8);
		System.out.println("Goodbye!");


	}



}