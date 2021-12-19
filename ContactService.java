package contactService;
import java.util.ArrayList;

import contactService.Contact;

public class ContactService {
	private ArrayList<Contact> contacts;
	  
	public ContactService()	{  //beginning call for the array list
	
	contacts = new ArrayList<>(); //Creates list of contacts
	}
	  
	//Add contact function using the contactID
	
	public boolean addContact(Contact contact){
	   boolean contactAlready= false;  //run through all the contacts in the list made
	
	   for (Contact contactList:contacts){    //test to see if contact exists if so make contact true	
	
	       if (contactList.equals(contact)){                               
	          contactAlready = true;	
	       }
	   }
	
	   if (!contactAlready) { //if not a contact add it as one	
	      contacts.add(contact);	
	      return true;//after adding is now true
	   }
	   else {
	   return false;
	   }
	
	}
	  
	//delete contact using contactID
	public boolean deleteContact(String contactID)	{
	//run through list of contacts
	   for (Contact contactList:contacts)	{
	//if contactID matches will remove and return
	      if (contactList.getContactID().equals(contactID))	{
	//remove and return true
	      contacts.remove(contactList);
	      return true;
	      }
	      
	   } 
	
	   return false;//else return false
	}
	  
	//update is trickiest due to needing to make sure still fits parameters
	//nothing means no change
	public boolean updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address)	{
	
	   for (Contact contactList:contacts) {//run through loop again
	
	   //Checks the contactID first then checks each individual contact requirement
	   
	      if (contactList.getContactID().equals(contactID))	{
	         if(!firstName.equals("") && !(firstName.length()>10))	{
	            contactList.setFirstName(firstName);
	         }
	         if(!lastName.equals("") && !(lastName.length()>10))	{
	            contactList.setFirstName(lastName);
	         }
	         if(!phoneNumber.equals("") && (phoneNumber.length()==10))	{
	            contactList.setFirstName(phoneNumber);
	         }
	         if(!address.equals("") && !(address.length()>30))	{
	            contactList.setFirstName(address);
	         }
	         return true;
	      }
	   }
	
	return false;//else return false
	}

}
