
public class Event implements Comparable<Event> {
	private String event_title;
	private String event_date_time;
	private String event_location;
	public Contact Contact;

	


	public Event(String event_title, String event_date_time, String event_location, Contact contact) {
		this.event_title = event_title;
		this.event_date_time = event_date_time;
		this.event_location = event_location;
		Contact = contact;
	}

	public String getEvent_title() {
		return event_title;
	}

	public String getEvent_date_time() {
		return event_date_time;
	}
	
	public String getEvent_location() {
		return event_location;
	}
	public Contact getContact() {
		return Contact;
	}


	public int compareTo(Event e) {
		return this.event_title.compareTo(e.event_title);
	}

}