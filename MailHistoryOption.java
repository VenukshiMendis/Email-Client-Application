package pc_assignment;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MailHistoryOption {
	private String[] arrOfStr;
	private String file_name;
	
	public void get_mail_history_on_a_given_date(String history_date) {
	
	try{
		arrOfStr = history_date.trim().split("/", 3);
		file_name = arrOfStr[0]+"_"+arrOfStr[1]+"_"+arrOfStr[2]+".ser";
		System.out.println(file_name);
		Serialize_Deserialize sd = new Serialize_Deserialize();
		try {
			sd.de_serialize(file_name);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	catch (Exception e) {
		System.out.println("Date Error");
	}
	}

}
