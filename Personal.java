package pc_assignment;

public class Personal extends Recipient implements Mail_sendable {
	private String nick_name;
	private String birthday;
		
	public Personal(String name,String nickname,String email,String birthday) {
		super(name,email,"Personal");
		this.nick_name = nickname;
		this.birthday= birthday;
		
	}

	public String getNick_name() {
		return nick_name;
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
		email.setContent("Hugs and love on your birthday.Venukshi Mendis");
		
		Send_Mail sm = new Send_Mail();
		sm.send_email(email);
		return email;
	}	

}
