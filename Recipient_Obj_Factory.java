package pc_assignment;

import java.util.ArrayList;

public class Recipient_Obj_Factory extends Obj_Factory_abstract_class {
		private ArrayList<Recipient> recipients_array;
		private ArrayList<Mail_sendable> bday_mail_recipients_array;

		public Recipient_Obj_Factory(ArrayList<Recipient> recipients_array,ArrayList<Mail_sendable> bday_mail_recipients_array) {
			this.recipients_array=recipients_array;
			this.bday_mail_recipients_array = bday_mail_recipients_array;
	    }
		
		@Override
		public Recipient create_recipient_object(String rec_data) {
			
			String[] arrOfStr = rec_data.trim().split(":", 2);
			String[] rec_details = arrOfStr[1].trim().split(",", 5);
			Recipient rec = null;
			
			String recipient_type =arrOfStr[0];
			
			
			if(recipient_type.equals("Official")) {
				
				try{
					Official official = new Official(rec_details[0],rec_details[1],rec_details[2]);
					rec=official;
				}
				catch (Exception e) {
					System.out.println("Invalid Input for Official"+e);
				}
				
				
				//System.out.println("official obj created");
				
				
			}
			
			else if(recipient_type.equals("Office_friend")) {
				try{
					Office_friend office_friend = new Office_friend(rec_details[0],rec_details[1],rec_details[2],rec_details[3]);
					rec = office_friend;
					bday_mail_recipients_array.add(office_friend);
				}
				catch (Exception e) {
					System.out.println("Invalid Input for Office Friend"+e);
				}
				
				
				//System.out.println("office friend obj created");
				
			}
			
			else if(recipient_type.equals("Personal")) {
				try{
					Personal personal = new Personal(rec_details[0],rec_details[1],rec_details[2],rec_details[3]);
				rec = personal;
				//System.out.println("personal obj created");
				
				bday_mail_recipients_array.add(personal);
				}
				catch (Exception e) {
					System.out.println("Invalid Input for Personal"+e);
				}
				
				
			}
			recipients_array.add(rec);
			return rec ;
		
		
		
	}
}
