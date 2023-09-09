package pc_assignment;

public abstract class Recipient {
	private String name;
	private String email_address;
	private String rec_type;
	private static int no_of_recipients = 0;
	
	
	
	public Recipient(String name,String email,String rec_type) {
		this.name=name;
		this.email_address=email;
		this.rec_type= rec_type;
		no_of_recipients +=1;
		//System.out.println(no_of_recipients);
	}


	public String getName() {
		return name;
	}


	public String getEmail_address() {
		return email_address;
	}


	public static int getNo_of_recipients() {
		return no_of_recipients;
	}


	public String getRec_type() {
		return rec_type;
	}

	
	


}
