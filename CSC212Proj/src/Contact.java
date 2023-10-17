/*************Example***************
CLASS: Contact.java
CSC212 Data structures - Project phase I
Fall 2023
EDIT DATE:
8-10-2023
TEAM:
IT PhoneBook
AUTHORS:
meshari al-harbi , (443102229)
saud al-dossaari (441102913)
Omar al-juwayr (443101386)

***********************************/
import java.util.Date;

public class Contact implements Comparable<Contact> {
	private String contact_name;
	private String contact_number;
	private String contact_mail;
	private String contact_address;
	private Date contact_birthDay;
	private String contact_notes;
	LinkedList<Event>event;

	public Contact() {
		this.contact_birthDay = null;
	}

	public Contact(String contact_name, String contact_number, String contact_mail, String contact_address,
			Date contact_birthDay, String contact_notes) {
		this.contact_name = contact_name;
		this.contact_number = contact_number;
		this.contact_mail = contact_mail;
		this.contact_address = contact_address;
		this.contact_birthDay = contact_birthDay;
		this.contact_notes = contact_notes;
		event = new LinkedList<Event>();
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public void setContact_mail(String contact_mail) {
		this.contact_mail = contact_mail;
	}

	public void setContact_address(String contact_address) {
		this.contact_address = contact_address;
	}

	public void setContact_birthDay(Date contact_birthDay) {
		this.contact_birthDay = contact_birthDay;
	}

	public void setContact_notes(String contact_notes) {
		this.contact_notes = contact_notes;
	}


	public String getContact_name() {
		return contact_name;
	}

	public String getContact_number() {
		return contact_number;
	}

	public String getContact_mail() {
		return contact_mail;
	}

	public String getContact_address() {
		return contact_address;
	}

	public Date getContact_birthDay() {
		return contact_birthDay;
	}

	public String getContact_notes() {
		return contact_notes;
	}
@Override
	public int compareTo(Contact o) {
		return this.contact_name.compareTo(o.contact_name); //1
	}
// 1 O(1)
	
}