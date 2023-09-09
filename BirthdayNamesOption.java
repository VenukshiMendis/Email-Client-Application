package pc_assignment;

import java.util.ArrayList;

public class BirthdayNamesOption {
	HasBirthday has_birthday;
	
	public BirthdayNamesOption(HasBirthday has_birthday){
		this.has_birthday = has_birthday;
	}
	

	public void bday_names(String date) {
		ArrayList<Mail_sendable> bday_rec = has_birthday.array_of_recipients_with_bday_on_the_given_date(date);
		System.out.print("recipients who have their bdays on "+ date+ " are :");
		for (Mail_sendable element:bday_rec) {
			if(element  instanceof Recipient) {
				Recipient bday_recipient = (Recipient) element;
				System.out.print(bday_recipient.getName()+" , ");
				
			}
		 }
		System.out.println();
	}
}
