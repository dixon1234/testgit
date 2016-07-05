package com.psl.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.psl.client.UserManagement;

public class TestUserManagement {

	UserManagement user;
	@Before
	public void setUp() throws Exception {
		user = new UserManagement();
	}

	@After
	public void tearDown() throws Exception {
		user = null;
	}
	
	@Test
	public void testCreateUser(){
		assertEquals("done", user.createUser());
	}
	
	@Test
	public void testDeleteUser(){
		assertEquals("removed", user.deleteUser());
	}
	

}
