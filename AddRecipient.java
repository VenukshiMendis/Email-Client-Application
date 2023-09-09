package pc_assignment;

public class AddRecipient {
	
	private Recipient new_rec ;
	
	private File_class file= new File_class();
	
	public void create_an_recipient_object(String rec_data,Recipient_Obj_Factory rec_obj_fac) {
		new_rec =rec_obj_fac.create_recipient_object(rec_data);
		
		
		try{ 
			
			file.write_file(rec_data);
					
		    }
		catch(Exception e){
			System.out.println("exception handled");
		} 
		
		
		
       }

		
	
	
	public void send_bday_mail_to_the_new_recipient(String today,HasBirthday  has_birthday) {
		if(new_rec instanceof Office_friend || new_rec instanceof Personal) {
			System.out.println(today);
			Mail_sendable element = (Mail_sendable)new_rec;
			if(has_birthday.has_birthday_on_the_given_date(element,today)) {
				element.sendmail();
			}
			
		}
		
	}
		
		 
}
