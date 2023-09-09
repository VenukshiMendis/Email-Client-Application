package pc_assignment;

public class Office_friend extends Recipient implements Mail_sendable {
	private String designation;
	private String birthday;
	
	
	public Office_friend(String name,String email,String designation,String birthday) {
		super(name,email, "Office_friend");
		this.designation = designation;
		this.birthday= birthday;
		
	}
	
	public String getDesignation() {
		return designation;
	}

	public String getBirthday() {
		return birthday;
	}

	
	@Override
	public Email sendmail() {
		Email email = new Email();
		email.setName_of_recipient(super.getName());
		email.setEmail_address_of_recipient(super.getEmail_address());
		email.setSubject("HAPPY BIRTHDAY!");
		email.setContent("Wish you a Happy Birthday. Venukshi Mendis");
		
		Send_Mail sm = new Send_Mail();
		sm.send_email(email);
		return email;
		
	}
	

}
