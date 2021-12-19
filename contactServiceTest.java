package ContactServiceTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import contactService.Contact;
import contactService.ContactService;


class contactServiceTest {
	@Test
	public void testAdd()	{
	   ContactService contactService = new ContactService();
	   Contact test1 = new Contact("1413252", "Jane", "Doe", "4444444444", "Sample 24 Drive");
	   assertEquals(true, contactService.addContact(test1));
	}

	@Test
	public void testDelete()	{
	   ContactService contactService = new ContactService();	     
	   Contact test1 = new Contact("1413252", "Jane", "Doe", "4444444444", "Sample 24 Drive");
	   Contact test2 = new Contact("1309403", "Malleus", "Draconia", "2187123404", "Valley of Thorns");
	   Contact test3 = new Contact("9752319", "Vil", "Schoenheit", "9215501793", "Land of Proxynee");

	   contactService.addContact(test1);
	   contactService.addContact(test2);
	   contactService.addContact(test3);

	   assertEquals(true, contactService.deleteContact("1413252"));
	   assertEquals(false, contactService.deleteContact("1309404"));
	   assertEquals(false, contactService.deleteContact("1309403"));
	}

	@Test
	public void testUpdate()	{
	   ContactService contactService = new ContactService();
	     
	   Contact test1 = new Contact("1413252", "Jane", "Doe", "4444444444", "Sample 24 Drive");
	   Contact test2 = new Contact("1309403", "Malleus", "Draconia", "2187123404", "Valley of Thorns");
	   Contact test3 = new Contact("9752319", "Vil", "Schoenheit", "9215501793", "Land of Proxynee");

	   contactService.addContact(test1);
	   contactService.addContact(test2);
	   contactService.addContact(test3);

	   assertEquals(true, contactService.updateContact("9752319", "VilFirst", "SchoenheitLast", "9215501793", "Land of Proxynee"));
	   assertEquals(false, contactService.updateContact("9752322", "VilFirst", "SchoenheitLast", "9215501793", "Land of Proxynee"));
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
