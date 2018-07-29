package by.htp.test.simple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import by.htp.testng.entity.Letter;

public class SimpleGroupTestMaskExample {
	
	@DataProvider (name = "userDP")
	public Object [][] defaultUserData (){
		
		Object [][] users = new Object [][] {
			{"user1","pass1"},
			{"user2","pass2"},
			{"user3","pass3"},
			{"user4","pass4"},
			{"user5","pass5"}
		};
		return users;
	}
	
	@DataProvider (name = "loginDP")
	public Iterator<String> stringUserData (){
		List<String> userLogins = new ArrayList<> ();
		userLogins.add("Kate");
		userLogins.add("Petr");
		userLogins.add("Olga");
		userLogins.add("Igor");
		
		return userLogins.iterator();
	}

	@DataProvider (name = "letterDP")
	public Iterator<Letter> stringLetterData (){
		List<Letter> letters = new ArrayList<> ();
		letters.add(new Letter ("a@mail.ru", "HelloA", "aaaa"));
		//letters.add(new Letter ("b@mail.ru", "HelloB", "bbbb"));
		//letters.add(new Letter ("c@mail.ru", "HelloC", "cccc"));
		
		return letters.iterator();
	}
	
	@Test (groups = "ie.login", dataProvider = "letterDP")
	public void testSendLetter (Letter letter ) {
		Letter expected = new Letter ("a@mail.ru", "HelloA", "aaaa"); 
		System.out.println(letter);
		//Assert.assertEquals(letter,  expected, "Letters are not equals");
	}
	
	@Parameters ({"intVal"})
	@Test (groups = "firefox.login")
	 public void testOne (@Optional ("1") int value) {
		System.out.println("firefox: " + value );
	}
	
	@Parameters({"login","pass"})
	@Test (groups = "chrome.login", dependsOnGroups = {"ie.*"})
	public void testTwo (String login, String pass) {
		System.out.println("chrome: " + login + " , " + pass );
	}

	@Test (groups = "ie.login", dataProvider = "userDP")
	 public void testTree (String login, String pass) {
		System.out.println("ie: " + login + " , " + pass);
	}
	
	@Test (groups = "ie.login", dataProvider = "loginDP")
	public void testFour (String login) {
		System.out.println("testFour: " + login);
	}

}
