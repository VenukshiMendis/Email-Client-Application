package pc_assignment;

import java.util.ArrayList;

public class HasBirthday {
	private ArrayList<Mail_sendable> bday_mail_recipients_array;
	private Valid_Date vd = new Valid_Date();
	
	public HasBirthday(ArrayList<Mail_sendable> bday_mail_recipients_array) {
		this.bday_mail_recipients_array =bday_mail_recipients_array;
		
	}

	public ArrayList<Mail_sendable> array_of_recipients_with_bday_on_the_given_date(String date) {//needed
		
		ArrayList<Mail_sendable> recipients_with_bday_on_the_given_date= new ArrayList<Mail_sendable>();
		 if(vd.check_valid_date(date)) {
			 for (Mail_sendable element:bday_mail_recipients_array) {
				 
				 if(has_birthday_on_the_given_date(element,date)) {
					 recipients_with_bday_on_the_given_date.add(element);  
				 }
					
				}
		
		 }
		 
		 
		return recipients_with_bday_on_the_given_date;
		
	}
		public boolean has_birthday_on_the_given_date(Mail_sendable element,String date) {
			if(element instanceof Office_friend) {
	        	  Office_friend off_frind = (Office_friend) element;
	        	  
	        	  if(off_frind.getBirthday().equals(date)) {
	        		  
	        		  return true;
	        	  }
			}
			 else if(element instanceof Personal) {
		            Personal personal = (Personal) element;
		             if(personal.getBirthday().equals(date)) {
		            	
		            	 return true;
		        	  }
			 }
			return false;
			
		}
		
		
}
