# Email-Client-Application
Command line-based e-mail application using OOP concepts
## Java email client
This Java Email Client application is designed to provide an efficient email management experience with recipient categorization, automated birthday greetings, and easy command-line messaging. 
### Key Features
1. **Recipient Details Management**: Users can efficiently store and manage recipient details for their day-to-day email communications. The application allows users to categorize recipients into three distinct categories: "Officials," "Official Friends," and "Personal Friends".Depending on the recipient category, the application permits users to save recipient details in specific formats as follows:
    - Officials: : `<name>, <email>, <designation>`
    - Official Friends: `<name>, <email>, <designation>, <birthday>`
    - Personal Friends: `<name>, <nick-name>, <email>, <birthday>'`
2. **Automated Birthday Greetings**: Upon application startup, the system automatically checks for recipients whose birthdays occur on the current day. It then sends personalized birthday greetings to the respective email addresses, considering their assigned category.
3. **Command-Line Messaging**: Users can send messages  directly from the command line to any provided email address.
4. **Email History Retrieval**: The application facilitates users to retrieve information regarding all emails sent on a specific day.
5. **Persistent Storage**: All emails sent via the email client are stored on the local hard disk as serialized objects. This implementation uses the concepts of object serialization and deserialization for efficient data persistence.




