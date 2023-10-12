public class Contact implements Comparable<Contact> {
	private String contact_name;
	private int contact_number;
	private String contact_mail;
	private String contact_address;
	private String contact_birthDay;
	private String contact_notes;



	public Contact(String contact_name, int contact_number, String contact_mail, String contact_address,
			String contact_birthDay, String contact_notes) {
		this.contact_name = contact_name;
		this.contact_number = contact_number;
		this.contact_mail = contact_mail;
		this.contact_address = contact_address;
		this.contact_birthDay = contact_birthDay;
		this.contact_notes = contact_notes;
	}

	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}

	public void setContact_number(int contact_number) {
		this.contact_number = contact_number;
	}

	public void setContact_mail(String contact_mail) {
		this.contact_mail = contact_mail;
	}

	public void setContact_address(String contact_address) {
		this.contact_address = contact_address;
	}

	public void setContact_birthDay(String contact_birthDay) {
		this.contact_birthDay = contact_birthDay;
	}

	public void setContact_notes(String contact_notes) {
		this.contact_notes = contact_notes;
	}


	public String getContact_name() {
		return contact_name;
	}

	public int getContact_number() {
		return contact_number;
	}

	public String getContact_mail() {
		return contact_mail;
	}

	public String getContact_address() {
		return contact_address;
	}

	public String getContact_birthDay() {
		return contact_birthDay;
	}

	public String getContact_notes() {
		return contact_notes;
	}

	public int compareTo(Contact o) {
		return this.contact_name.compareTo(o.contact_name); 
	}

	
}