package pc_assignment;

public class SendEmailOption {
	 private String[] arrOfStr;
	 private Send_Mail sm = new Send_Mail();
	
	public void send_email(String data_for_mail ) {
		arrOfStr = data_for_mail.trim().split(",", 3);
		try {
			sm.send_email(new Email(arrOfStr[0].trim(), arrOfStr[1].trim(), arrOfStr[2].trim()));
		}
		catch (Exception e) {
			System.out.println("Exception occured");
		}

}
	
}
