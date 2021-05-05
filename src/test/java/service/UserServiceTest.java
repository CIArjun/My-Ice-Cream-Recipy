package service;

import static org.junit.Assert.*;

import org.junit.Test;

import model.User;

import java.util.*;

public class UserServiceTest {

	@Test
	public void testIsAutherozied() {
		User u1=new User("A","P","1234","a.p@devops.com");
		assertEquals(true,new UserService().isAuthorized(u1));
	}

	@Test
	public void testUpdatePassword() {
		User u1=new User("","","9876","a.p@devops.com");
		assertEquals(true,new UserService().updatePassword(u1));
	}

	@Test
	public void testDoRegistration() {
		User u1=new User("RAM","RAJ","1234","raj@devops.com");
		assertEquals(true,new UserService().doRegistration(u1));
	}
        
        @Test
	public void testSeeRecipies() {
		UserService service = new UserService();
		Map<String,String> m = new HashMap<String,String>();
		m = service.seeRecipies();
		assertEquals(m,new UserService().seeRecipies());
	}
	@Test
	public void testAddRecipies() {
		UserService service = new UserService();
	
		String list= service.addRecipies("Dairy","Milk");
		assertEquals(list,new UserService().addRecipies("Dairy","Milk"));
	}

}
