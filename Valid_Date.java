package pc_assignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Valid_Date {
	public boolean check_valid_date(String date) {
		
			// format = "YYYY/MM/DD";
			String[] arrDate = date.trim().split("/", 3);
			
			if(arrDate.length==3) {
				if(arrDate[0].length()==4 && arrDate[1].length()==2 && arrDate[2].length()==2) { //valid format
					
					// String is of the format y-M-d or yyyy-MM-d
					String string = arrDate[0]+"-"+arrDate[1]+"-"+arrDate[2];
					try {
					       //Using parse method to convert the string to LocalDate object
					       LocalDate date_d = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
					 
					      
					       return true;
					 
					       }
					       // If the String pattern is invalid
				  catch (IllegalArgumentException e) {
					}
					       // If the String was unable to be parsed.
				  catch (DateTimeParseException e) {
					           System.out.println("Exception: " + e);
				}

					return false;
				
				}
			}
			return false;
			
	    }
		
	}


