package pc_assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Serialize_Deserialize {
	DateTimeFormatter date_time_format = DateTimeFormatter.ofPattern("yyyy_MM_dd");
	LocalDateTime today1 = LocalDateTime.now();
	String today = date_time_format.format(today1);
	
	public void serialize(Email email) {
		String fileName= today+ ".ser";
		File tempFile = new File(fileName);

		boolean exists = tempFile.exists();
		
		if(!exists) {
			try {
				serialize_firts_object(email, fileName);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			try {
				serialize_sec_or_other_obj(email, fileName);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	private void serialize_firts_object(Email email_object,String file_name) throws FileNotFoundException, IOException {
		ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream(file_name));
	         
	       
	        os1.writeObject(email_object);
	        System.out.println("successfully serialized.........");
	        os1.close();

	}
	
	private void serialize_sec_or_other_obj(Email email_object,String file_name) throws FileNotFoundException, IOException {
		ObjectOutputStream os2 = new ObjectOutputStream(new FileOutputStream(file_name, true)) {
            protected void writeStreamHeader() throws IOException {
                reset();
                //System.out.println("I am called");  
               // super.writeStreamHeader();
            	
            }
        };

	        os2.writeObject(email_object);
	        System.out.println("successfully serialized.........sec");
	        os2.close();

	}
	
	public void de_serialize(String file_name) throws FileNotFoundException, IOException {
		ObjectInputStream is = new ObjectInputStream(new FileInputStream(file_name));
		  while(true)
	      {
			  
	           try
	           {
	        	Email email = (Email)is.readObject();
	           //System.out.println("successfully deserialized.........showing details of object.");
	           System.out.println("RECIPIENT: "+email.getEmail_address_of_recipient()+"		SUBJECT: "+ email.getSubject()+" 	CONTENT: "+ email.getContent());
	           }

	           catch(Exception e)
	           {
	               if(e instanceof java.io.EOFException)
	               {
	               System.out.println("All objects read and displayed");
	               is.close();
	               break;
	               }
	               else
	               {
	                   System.out.println("Some Exception Occured.");
	                   e.printStackTrace();

	               }
	             }
	      }
	       
	}

}
