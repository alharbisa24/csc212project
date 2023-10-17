import java.util.Date;
import java.util.Scanner;

public class PhoneBook {
	static LinkedList<Contact> conts = new LinkedList();
	static LinkedList<Event> events = new LinkedList();
	static Scanner input = new Scanner(System.in);

	
	public static void Searchcontact() {
		System.out.println("Enter search criteria:"); //1
		System.out.println("1.Name"); //1
		System.out.println("2.Phone Number");//1
		System.out.println("3.Email Address");//1
		System.out.println("4.Address");//1
		System.out.println("5.Birthday");//1
		System.out.print("Enter your choise");//1
		int Choice = input.nextInt();//1
		if (conts.empty())//1
			System.out.println("Contact its empty");//1
		else {//1
			conts.findFirst();//1
			switch (Choice) {//1
			case 1: {//1
				System.out.print("Enter the contacts name:");//1
				String n = input.next();//1
				boolean found = false;//1
				while (!conts.findlast()) { // n
					if (conts.retrieve().getContact_name().equalsIgnoreCase(n)) { // n
						System.out.println("Contact found!");//n
						System.out.println("Name: " + conts.retrieve().getContact_name());//n
						System.out.println("Phone number: " + conts.retrieve().getContact_number());//n
						System.out.println("Email address: " + conts.retrieve().getContact_mail());//n
						System.out.println("Address: " + conts.retrieve().getContact_address());//n
						System.out.println("Birthday: " + conts.retrieve().getContact_birthDay());//n
						System.out.println("Notes: " + conts.retrieve().getContact_notes());//n
found = true;//n
						
					}
					conts.findNext();//n
				}
				if(found == false)//1
					System.out.print("Contact not found !\n");//1
			}
				break;//1
				
				// 11n + 20 O(n)
				
			case 2: {
				System.out.println("Enter the contacts phone number");//1
				String phonenumber = input.next();//1
				boolean found = false;//1
				while (!conts.findlast()) { // n
					if (conts.retrieve().getContact_number().compareTo(phonenumber) == 0) { //n
						System.out.println("Contact found!");//n
						System.out.println("Name: " + conts.retrieve().getContact_name());//n
						System.out.println("Phone number: " + conts.retrieve().getContact_number());//n
						System.out.println("Email address: " + conts.retrieve().getContact_mail());//n
						System.out.println("Address: " + conts.retrieve().getContact_address());//n
						System.out.println("Birthday: " + conts.retrieve().getContact_birthDay());//n
						System.out.println("Notes: " + conts.retrieve().getContact_notes());//n
					found = true;//n
					}
					conts.findNext();//n

				}
				if(found == false)//1
					System.out.print("Contact not found !\n");//1
			}
				break;//1
				
				// 11n + 6 O(n)
				
			case 3: {
				System.out.println("Enter the contacts Email Address");//1
				String email = input.next();//1
				boolean found = false;//1
				while (!conts.findlast()) {//n
					if (conts.retrieve().getContact_mail().compareTo(email) == 0) {//n
						System.out.println("Contact found!");//n
						System.out.println("Name: " + conts.retrieve().getContact_name());//n
						System.out.println("Phone number: " + conts.retrieve().getContact_number());//n
						System.out.println("Email address: " + conts.retrieve().getContact_mail());//n
						System.out.println("Address: " + conts.retrieve().getContact_address());//n
						System.out.println("Birthday: " + conts.retrieve().getContact_birthDay());//n
						System.out.println("Notes: " + conts.retrieve().getContact_notes());//n
						found = true;//n
					}
					conts.findNext();//n
				}
				if(found == false)//1
					System.out.print("Contact not found !\n");//1
			}
				break;//1
				// 11n + 6 O(n)
				
			case 4: {
				System.out.println("Enter contacts address");//1
				String address = input.next();//1
				boolean found = false;//1
				while (!conts.findlast()) {//n
					if (conts.retrieve().getContact_address().compareTo(address) == 0) {//n
						System.out.println("Contact found!");//n
						System.out.println("Name: " + conts.retrieve().getContact_name());//n
						System.out.println("Phone number: " + conts.retrieve().getContact_number());//n
						System.out.println("Email address: " + conts.retrieve().getContact_mail());//n
						System.out.println("Address: " + conts.retrieve().getContact_address());//n
						System.out.println("Birthday: " + conts.retrieve().getContact_birthDay());//n
						System.out.println("Notes: " + conts.retrieve().getContact_notes());//n
						found = true;//n
					}
					conts.findNext();//n
					
				}
				if(found == false)//1
					System.out.print("Contact not found !\n");//1

			}
				break;//1
				// 11n + 6 O(n)
				
			case 5: {
				System.out.println("Enter contacts Birthday");//1
				Date date = new Date(input.next());//1
				boolean found = true;//1
				while (!conts.findlast()) {//n
					if (conts.retrieve().getContact_birthDay().compareTo(date) == 0) {//n
						System.out.println("Contact found!");//n
						System.out.println("Name: " + conts.retrieve().getContact_name());//n
						System.out.println("Phone number: " + conts.retrieve().getContact_number());//n
						System.out.println("Email address: " + conts.retrieve().getContact_mail());//n
						System.out.println("Address: " + conts.retrieve().getContact_address());//n
						System.out.println("Birthday: " + conts.retrieve().getContact_birthDay());//n
						System.out.println("Notes: " + conts.retrieve().getContact_notes());//n
						found = true;//n
					}
					conts.findNext();//n
				}
				if(found == false)//1
					System.out.print("Contact not found !\n");//1
			}
				break;//1
				// 11n + 6 O(n)
				
			}

		}
	}

	//TimeComplexity ( 55n + 35 ) BigO(n)
	
	public static void deletcontact(String name) {//1
		if (conts.empty())//1
			System.out.println("Contact list its empty");//1
		else {//1
			Contact resultfound = searchByName(name); //1
			if(resultfound != null) {//1

			if(conts.retrieve().event == null || conts.retrieve().event.empty()) { // check if contact have events or not (1)
				
				
				conts.remove(resultfound);//1
				System.out.println("the contact dont have event");//1
				System.out.println("Contact deleted successfully ");//1
				
				
		
				} else {//1
					conts.retrieve().event.findFirst(); //1
					while (!conts.retrieve().event.findlast()) {// n
						Event e = events.retrieve(); //n
						if (events.search(e)) {//n
							events.remove(e);//n

						}
						conts.remove(resultfound);//n

						conts.retrieve().event.findNext();//n
					}
			

					
					System.out.println("Contact deleted successfully \n");//1

			}
			
		
			
			
			
			

		}else {//1
			
			System.out.print("contact not found !\n");//1
		}
		
		}
	}
	
		// 6n + 14 O(n)
		/*
		 * this method for search in contacts list by name to get object
		 */
		public static Contact searchByName(String name) {//1
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
			while (!conts.last()) {  // n-1
				if (conts.retrieve().getContact_name().equalsIgnoreCase(name)) {  // n
																				
					return conts.retrieve();//n
			}
				conts.findNext(); //n

				}
			if (conts.retrieve().getContact_name().equalsIgnoreCase(name)) {  // 1
				
				return conts.retrieve();///1
		}
			return null;//1
			}
			
	// 4n + 5
		
	/*
	 * this method for search in contacts list by number
	 */
	public static boolean search_number(String number) { //1
		/*
		 * in the first will check if list is empty then return false (not found);
		 */
		if (conts.empty()) {//1
			return false;//1
		}
		/*
		 * current will be in first element in list.
		 */
		conts.findFirst(); //1
/*
 * here we will check all elements from the first element to before last elemeny (n-1)
 */
		while (!conts.last()) { //n-1
			if (conts.retrieve().getContact_number().equals(number)) { //n
																			
				return true;//n
		}
			conts.findNext(); //n

			}
		/*
		 * here we will check last element in the list if it its have same contact number or not
		 */
		if (conts.retrieve().getContact_number().equals(number)) { //1
			return true; //1
			
		

	}
		return false; //1
	}
	
	//4n + 6 O(n)


	 //this method for schecule an Event                                                 time complexity      S/E      Freq      Total
	 public static void shceduleEvent(Event e) {                                                             //0       0           0 
		
		if(conts.empty() == true)                                                                        //1         1         1 
		{                                                                                                //0         0         0
			System.out.print("No contacts found");                                                   //1         1         1 
			return; 
		}
		
		else {
			if(Events.empty()) {                                                                       //1          1       1 
				events.insert(e);                                                                  //1          1       1 
			return; 
			}else {
				events.findFirst();                                                                 //1           1     1 
			while(!events.last()) {                                                                     //1           n     n
				if(events.retrieve().getEvent_date_time().equalIgnoreCase(e.getEvent_date_time()))  //1           n-1   n-1           
					{
						System.out.println("Sorry there is event this time");                //1          n-1    n-1             
						return;
					}                         
					
					events.findNext();                                                            //1         n-1    n-1                                                                                          
					
				}
				if(events.retrieve().getEvent_date_time().equalIgnoreCase(e.getEvent_date_time()))    //1            1     1 
				{
					System.out.println("Sorry there is event this time");                         //1            1     1 
					return; 
				}
				
				events.insert(e);                                                                     //1             1    1
							
			}                                                                                           //Total = 4n + 5    is O(n)
			
			
	}
}


	
	
	 
	 
	                                                                                                                               //Time Complexity  S/E        Freq           Total
	public void printEventDetails() {                                                                                                //0          0               0                            
		System.out.println("Enter search criteria:");                                                                               //1          1               1 
		System.out.println("1.contact name: ");                                                                                     //1          1               1
		System.out.println("2.Event Title: ");                                                                                      //1          1               1 
		System.out.println();                                                                                                       //1          1               1
		System.out.print("Enter your choice: ");                                                                                    //1          1               1
		int eventChoice = input.nextInt();                                                                                          //1          1               1
		
		if(conts.empty())                                                                                                           //1          1               1 
		{
			System.out.println("Sorry there is no contact");                                                                        //1          1               1 
			return;
		}
		
		else {
			switch(eventChoice) {                                                                                                   //1           1              1
			
			case 1: 
				System.out.print("Enter contact name: ");                                                                          //1            1              1                                            
			    String eventContactName = input.next();                                                                            //1            1              1 
			
				
				boolean foundCon = false;                                                                                          //1            1              1 
				conts.findFirst();                                                                                                 //1            1              1 
				while(!conts.last()) {                                                                                             //1            n              n
					if(conts.retrieve().getContact_name().equalsIgnoreCase(contactName)) {                                         //1           n-1            n-1 
						System.out.println("Event found!");                                                                        //1           n-1            n-1 
						System.out.println("Event title: " + events.retrieve().getEvent_title());                                  //1           n-1            n-1 
						System.out.println("contact name:"+ conts.retrieve().getName());                                           //1           n-1            n-1 
						System.out.println("Event date and time (MM/DD/YYYY HH:MM):"+ events.retrieve.getEvent_date_time());       //1           n-1            n-1 
						System.out.println("Event location: "+ events.retrieve.getEvent_location());                               //1           n-1            n-1 
					    foundCon = true;                                                                                           //1           n-1            n-1 
					}
					conts.findNext();                                                                                              //1           n-1            n-1 
				}
				
				if(conts.retrieve().getContact_name().equalsIgnoreCase(contactName)) {                                             //1             1              1 
 					System.out.println("Event found!");                                                                            //1             1              1 
					System.out.println("Event title: " + events.retrieve().getEvent_title());                                      //1             1              1 
					System.out.println("contact name:"+ conts.retrieve().getName());                                               //1             1              1 
					System.out.println("Event date and time (MM/DD/YYYY HH:MM):"+ events.retrieve.getEvent_date_time());           //1             1              1 
					System.out.println("Event location: "+ events.retrieve.getEvent_location());                                   //1             1              1 
					found = true;                                                                                                  //1             1              1 
					
				
			}
				
				if(found == false)                                                                                                 //1             1              1 
					System.out.println("Sorry there is No event");                                                                 //1             1              1 
				
				break;                                                                                                             
			
			
			case 2: 
				System.out.print("Enter the event title: ");                                                                       //1             1              1 
			    String eventTitle = input.next();                                                                                  //1             1              1 
			
			 
				  if(events.empty()) {                                                                                             //1             1              1 
					  System.out.println("Sorry No Event ");                                                                       //1             1              1 
					  return;
				  }
				 
					  boolean found = false;                                                                                       //1             1              1 
					  events.findFirst();                                                                                          //1             1              1 
					  while(!events.last()) {                                                                                      //1             n              n
						  if(events.getEvent_title().equalsIgnoreCase(eventTitle)) {                                               //1            n-1            n-1 
							  System.out.println("Event found!");                                                                      //1            n-1            n-1 
								System.out.println("Event title: " + events.retrieve().getEvent_title());                          //1            n-1            n-1 
								System.out.println("contact name:"+ conts.retrieve().getName());                                   //1            n-1            n-1 
								System.out.println("Event date and time (MM/DD/YYYY HH:MM):"+ events.retrieve.getEvent_date_time());//1           n-1            n-1 
								System.out.println("Event location: "+ events.retrieve.getEvent_location());                        //1           n-1            n-1  
								found = true;                                                                                       //1           n-1            n-1   
							  
						  }
 						  events.findNext();                                                                                            //1           n-1            n-1 
							  
					  }
					  
					  if(events.getEvent_title().equalsIgnoreCase(eventTitle)) {                                                           // 1             1              1 
						  System.out.println("Event found!");                                                                          //1              1              1 
							System.out.println("Event title: " + events.retrieve().getEvent_title());                              //1              1              1 
							System.out.println("contact name:"+ conts.retrieve().getName());                                       //1              1              1 
							System.out.println("Event date and time (MM/DD/YYYY HH:MM):"+ events.retrieve.getEvent_date_time());   //1              1              1 
							System.out.println("Event location: "+ events.retrieve.getEvent_location());                           //1              1              1 
							found = true;                                                                                          //1              1              1 
				  }
					  
					  if(found == false)                                                                                                    //1              1              1 
							System.out.println("Sorry there is No event");                                                         //1              1              1 
						 
						break;
					  
			
				
		}                                                                                                                                             //total = 18n + 12 is O(n)
			
   }
		
		
		
}
	
	
	
	










	
	
	public static void print_firstname(String name) {//1
		if (conts.empty()) {//1
			
			System.out.println("contacts is empty !");//1
			return;//1
		}
		
		if(searchByName(name) == null) {//1
			System.out.println("contacts not found !");//1
return;//1
		}else {//1
		conts.findFirst();//1


		while (!conts.last()) {//n-1
			if(conts.retrieve().getContact_name().equalsIgnoreCase(name))//n
System.out.print("Name:" + conts.retrieve().getContact_name()
		+ "\nPhone Number:" + conts.retrieve().getContact_number()
		+ "\nEmail Address:" + conts.retrieve().getContact_mail()
		+ "\nAddress: " + conts.retrieve().getContact_address()
		+ "\nBirthday:" + conts.retrieve().getContact_birthDay()
		+ "\nNotes:" + conts.retrieve().getContact_notes()); //n
System.out.print("\n");//n

conts.findNext();//n
		}
		if(conts.retrieve().getContact_name().equalsIgnoreCase(name))//1
		System.out.print("Name:" + conts.retrieve().getContact_name()
				+ "\nPhone Number:" + conts.retrieve().getContact_number()
				+ "\nEmail Address:" + conts.retrieve().getContact_mail()
				+ "\nAddress: " + conts.retrieve().getContact_address()
				+ "\nBirthday:" + conts.retrieve().getContact_birthDay()
				+ "\nNotes:" + conts.retrieve().getContact_notes());
		System.out.print("\n");//1

	}
	}
	
	//5n + 10 O(n)
	
	public static void print_alph() {//1
		if (events.empty()) {//1
			System.out.println("There are no events\n");//1
			return; //1
		}
		events.findFirst();//1
		while (!events.last()) {//n-1

			System.out.println("Event title:" + events.retrieve().getEvent_title());//n
			System.out.println("\nContact name:" + events.retrieve().Contact.getContact_name());//n
			System.out.println("\nEvent date and time:" + events.retrieve().getEvent_date_time());//n
			System.out.println("\nEvent location:" + events.retrieve().getEvent_location());//n
			System.out.print("\n");//n
			events.findNext();//n
		}
		System.out.println("Event title:" + events.retrieve().getEvent_title());//1
		System.out.println("\nContact name:" + events.retrieve().Contact.getContact_name());//1
		System.out.println("\nEvent date and time:" + events.retrieve().getEvent_date_time());//1
		System.out.println("\nEvent location:" + events.retrieve().getEvent_location());//1
		System.out.print("\n");//1
		}
	
	// 7n + 9

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
						 contact_name = input.next();

					}
			input.nextLine();
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
					Date contact_birthday = null;
					boolean accepted=false;
					try {
					contact_birthday = new Date(input.next());
					}catch(IllegalArgumentException i) {
						System.out.print("date is not correct, please enter correct date. \n");
						break;
					
					}
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
