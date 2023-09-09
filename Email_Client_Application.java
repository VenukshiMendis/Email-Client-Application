package pc_assignment;

import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  


public class Email_Client_Application {

	private ArrayList<Recipient> recipients_array=new ArrayList<Recipient>();
	private ArrayList<Mail_sendable> bday_mail_recipients_array= new ArrayList<Mail_sendable>(); 
	
	private Recipient_Obj_Factory rec_obj_fac=new Recipient_Obj_Factory(recipients_array,bday_mail_recipients_array);
	private HasBirthday  has_birthday = new HasBirthday(bday_mail_recipients_array);
	private File_class file= new File_class();
	private String today = get_todays_date();
	
	
	public Email_Client_Application() {
		//Since this is the constructor when the email client application is first created it reads the 
		//existing text file and create an object list called "recipients_array" for all the objects
		//and another object list called  "bday_mail_recipients_array" for personal and office_frined objects
		try{
			file.create_file();
			file.read_file(rec_obj_fac);
			
		}
		catch(Exception e){
			System.out.println("exception handled"+e);
		}
		
		//array of those who have their birthdays today
        ArrayList<Mail_sendable> bday_rec_today = has_birthday.array_of_recipients_with_bday_on_the_given_date(today);
        
       //send b'day mails to those who have their birthdays today
        for (Mail_sendable element:bday_rec_today) {
        	element.sendmail();
          	
		 }

         
       }
		
		
	//case1 
	public void add_a_new_recipient(String rec_data) {
		AddRecipient add_recipient = new AddRecipient();
		add_recipient.create_an_recipient_object(rec_data, rec_obj_fac);
		
		//send birthday mail to the newly added recipient if that person has his birthday today
		add_recipient.send_bday_mail_to_the_new_recipient(today, has_birthday);
	
	
	}
	//case 2
	
	public void send_email(String data_for_mail ) {
		SendEmailOption send_email_option = new SendEmailOption();
		send_email_option.send_email(data_for_mail);
	
	}
	
	//case 3
	public void bday_names(String date) {
		BirthdayNamesOption bday_names_option = new BirthdayNamesOption(has_birthday);
		bday_names_option.bday_names(date);
	}
	
	//case 4
	public void get_mail_history_on_a_given_date(String history_date) {
		MailHistoryOption mail_history_option = new MailHistoryOption();
		mail_history_option.get_mail_history_on_a_given_date(history_date);
		
	}
	
	//case 5
	public int get_number_of_recipients() {
		return Recipient.getNo_of_recipients();
		
		
	}
	
	//get today's date as a string in the format  "2000/12/12"
	private String get_todays_date() {
	    DateTimeFormatter date_time_format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime today1 = LocalDateTime.now();
		String today = date_time_format.format(today1);
		
		return today;
		
	}
	
	

}
