package pc_assignment;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;


public class Send_Mail { //
	

	

		/**
		   Outgoing Mail (SMTP) Server
		   requires TLS or SSL: smtp.gmail.com (use authentication)
		   Use Authentication: Yes
		   Port for SSL: 465
		 */
		
		public void send_email(Email email) {
			final String fromEmail = "venukshinaradha@gmail.com"; //requires valid gmail id
			final String password = "wili pncb txmg evzy"; // correct password for gmail id 
			
			System.out.println("SSLEmail Start");
			Properties props = new Properties();
			props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
			props.put("mail.smtp.socketFactory.port", "465"); //SSL Port
			props.put("mail.smtp.socketFactory.class",
					"javax.net.ssl.SSLSocketFactory"); //SSL Factory Class
			props.put("mail.smtp.auth", "true"); //Enabling SMTP Authentication
			props.put("mail.smtp.port", "465"); //SMTP Port
			
			Authenticator auth = new Authenticator() {
				//override the getPasswordAuthentication method
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(fromEmail, password);
				}
			};
			
			Session session = Session.getDefaultInstance(props, auth);
			System.out.println("Session created");
		       
			EmailUtil.sendEmail(session,email);

		       
		}

	}

