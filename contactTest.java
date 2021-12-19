package ContactServiceTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import contactService.ContactService;
import contactService.Contact;
import org.junit.jupiter.api.Test;

class contactTest {
	
	
	@Test
	void testContactIDToLong(){
	Assertions.assertThrows(IllegalArgumentException.class, ()->{
	new Contact("C0011111111", "JohnnyBoiDoe", "Doe", "123 His St.",
	"1234567890");
	}); }
	@Test
	void testContactFirstNameToLong(){
	Assertions.assertThrows(IllegalArgumentException.class, ()->{
	new Contact("C001", "John 111111", "Doe", "123 His St.",
	"1234567890");
	}); }
	@Test
	void testContactLastNameToLong(){
	Assertions.assertThrows(IllegalArgumentException.class, ()->{
	new Contact("C001", "John", "Doe 1111111", "123 His St.",
	"1234567890");
	}); }
	@Test
	void testContactStreetAddressToLong(){
	Assertions.assertThrows(IllegalArgumentException.class, ()->{
	new Contact("C001", "John", "Doe", "123 His St. 111111111111111111", "1234567890");
	}); }
	@Test
	void testContactPhoneNumberToLong(){
	Assertions.assertThrows(IllegalArgumentException.class, ()->{
	new Contact("C001", "John", "Doe", "123 His St.", "12345678900");
	}); }
	@Test
	void testContactPhoneNumberToShort(){
	Assertions.assertThrows(IllegalArgumentException.class, ()->{
	new Contact("C001", "John", "Doe", "123 His St.", "123456789");
    }); }
	
	

	

}
