package pc_assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;

public class File_class {
	
		private File recipients_file = new File("clientList.txt"); 
		

		public void create_file() {
			if(!recipients_file.exists()) { //create the file if it does not exit.
				
				try {
					recipients_file.createNewFile();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				System.out.println("File created: " + recipients_file.getName());
			}
			
		}
		public void write_file(String rec_data) throws IOException  {
			
			
					
			FileWriter file_writer = new FileWriter(recipients_file,true);
			BufferedWriter buffered_writer = new BufferedWriter(file_writer);
		    buffered_writer.write(rec_data);
		    buffered_writer.newLine();
		    buffered_writer.close();
		    
		    System.out.println("Successfully wrote to the clientList.txt file");
		   
		
	}	
		//public ArrayList<Recipient> read_file() throws FileNotFoundException {
			public void read_file(Recipient_Obj_Factory rec_obj_fac) throws FileNotFoundException {
			
			FileReader  reader = new FileReader(recipients_file);
			BufferedReader b_reader = new BufferedReader(reader);
			
			String line=null;
			try {
				while((line= b_reader.readLine())!=null && line.length() > 0)  //while(sc.hasNextLine()) 
					
				{  
					
					rec_obj_fac.create_recipient_object(line);
					
				
				
				}
				b_reader.close();
				
			} catch (IOException e) {
				System.out.println("exeption****");
				e.printStackTrace();
			} 
			
			
		}

}

