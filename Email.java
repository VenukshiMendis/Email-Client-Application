package pc_assignment;

import java.io.Serializable;

public class Email implements Serializable{ //This is the Email Object
	private String name_of_recipient;
	private String email_address_of_recipient;
	private String subject;
	private String content;
	private String date;
	
	public Email() {
		
	}
	
	public Email(String email_address_of_recipient, String subject, String content) {
		this.email_address_of_recipient = email_address_of_recipient;
		this.subject = subject;
		this.content = content;
	} 

	public String getName_of_recipient() {
		return name_of_recipient;
	}

	public void setName_of_recipient(String name_of_recipient) {
		this.name_of_recipient = name_of_recipient;
	}

	public String getEmail_address_of_recipient() {
		return email_address_of_recipient;
	}

	public void setEmail_address_of_recipient(String email_address_of_recipient) {
		this.email_address_of_recipient = email_address_of_recipient;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	
	

}
