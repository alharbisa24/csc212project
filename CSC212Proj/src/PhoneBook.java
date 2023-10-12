import java.util.Scanner;

public class PhoneBook {
	static LinkedList conts = new LinkedList();
	static LinkedListEvent events = new LinkedListEvent();
	
	
	public static boolean search_name(String name) {
		if (conts.empty()) {
			return false;
		}
		conts.findFirst(); 

		while (!conts.last()) { 
			if (conts.retrieve().getContact_name().equalsIgnoreCase(name)) { 
																			
				return true;
		}
			conts.findNext(); 

			}
		
			if (conts.retrieve().getContact_name().equalsIgnoreCase(name)) { 
			return true;
			
		

	}
		return false;
	}

	public static boolean search_number(int number) {
		if (conts.empty()) {
			return false;
		}
		conts.findFirst(); 

		while (!conts.last()) { 
			if (conts.retrieve().getContact_number() == number) { 
																			
				return true;
		}
			conts.findNext(); 

			}
		
		if (conts.retrieve().getContact_number() == number) { 
			return true;
			
		

	}
		return false;
	}

	public static void print_firstname(String name) {
		if (conts.empty()) {
			
			System.out.println("contacts is empty !");
			return;
		}
		
		if(!search_name(name)) {
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
					while(search_name(contact_name)) {
						System.out.print("Contact is already exists! ");
						
						System.out.print("\nEnter contact's name: ");
						 contact_name = input.nextLine();

					}
			
					System.out.print("Enter the contact's phone number: ");
					int contact_phone = input.nextInt();
					
					while(search_number(contact_phone)) {
						System.out.print("Contact number is already exists! ");
						
						System.out.print("Enter the contact's phone number: ");
						contact_phone = input.nextInt();

					}
					System.out.print("Enter the contact's email address: ");
					String contact_mail = input.next();
					
					System.out.print("Enter the contact's address: ");
					String contact_address = input.next();
					
					System.out.print("Enter the contact's birthday: ");
					String contact_birthday = input.next();
					
					System.out.print("Enter ay notes for the contact: ");
					String contact_note = input.next();


						Contact newcont = new Contact(contact_name, contact_phone, contact_mail, contact_address, contact_birthday, contact_note);
						conts.insert(newcont);
						System.out.println("Contact added successfully!");
					break;

					
				case 2:
					

					break;
				case 3:
					// delete contact and events of there in big events list (in phonebook class)
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