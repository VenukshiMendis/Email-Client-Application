package pc_assignment;

import java.util.InputMismatchException;
import java.util.Scanner;




public class Email_Client { //this is the demo

   public static void main(String[] args) {
	   
	   Email_Client_Application Email_c_a = new Email_Client_Application();
	   Scanner scanner = new Scanner(System.in);
	   	
	   while(true) {
		   
		   
	         System.out.println("Enter option type: \n"
	               + "1 - Adding a new recipient\n"
	               + "2 - Sending an email\n"
	               + "3 - Printing out all the recipients who have birthdays\n"
	               + "4 - Printing out details of all the emails sent\n"
	               + "5 - Printing out the number of recipient objects in the application");
	         
	         int option=0;
	        
	        	option=scanner.nextInt();
	       
	         scanner.nextLine();
	         

	         switch(option){
	               case 1:
	            	  // input format - Official: nimal,nimal@gmail.com,ceo
	            	   //               Office_friend: kamal,kamal@gmail.com,clerk,2000/12/12
	            	   //               Personal: sunil,bro,sunil@gmail.com,2000/10/10
	                  
	                   // code to add a new recipient
	              
	            	   System.out.println("Enter recipient details:");
	      
	                   String rec_data =scanner.nextLine();  
		               System.out.println(rec_data);
		            
	            	   Email_c_a.add_a_new_recipient(rec_data);
	                 
	                   break;
	                   
	               case 2:
	                   // input format - email, subject, content
	                   // code to send an email
	            	   System.out.println("Enter email address,subject and content :");
	         	      
	                   String data_for_mail =scanner.nextLine();  
		               System.out.println(data_for_mail);
	            	   
	            	   Email_c_a.send_email(data_for_mail);
	                   break;
	                   
	               case 3:
	                   // input format - yyyy/MM/dd (ex: 2018/09/17)
	                   // code to print recipients who have birthdays on the given date
	            	   System.out.println("Enter a date to find who has their bday on that date :");
	         	      
	                   String date =scanner.nextLine();  
		               System.out.println(date);
	            	   Email_c_a.bday_names(date.trim());
	                   break;
	                   
	               case 4:
	                   // input format - yyyy/MM/dd (ex: 2018/09/17)
	                   // code to print the details of all the emails sent on the input date
	            	   System.out.println("Enter a date to find email history :");
		         	      
	                   String history_date =scanner.nextLine();  
		               System.out.println(history_date);
	            	   Email_c_a.get_mail_history_on_a_given_date(history_date);
	                   break;
	                   
	               case 5:
	                   System.out.println(Email_c_a.get_number_of_recipients());
	                   break;
	              	            	   

	         }
	        
	   }
	  
	   
        
       
     }
}




