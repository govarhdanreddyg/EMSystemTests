package com.expense.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



public class ExpenseManagerSystemTest {

	
	@Test
	public void titleTest1() throws Exception{
		WebDriver driver;
		driver = new HtmlUnitDriver();
		
		driver.get("http://ec2-54-160-247-195.compute-1.amazonaws.com:8089/ExpenseApp-1/login.jsp");	
		Thread.sleep(60000);

		//Comment below line to make test pass
		//String expectedTitle = "Hello Page";
		
		//Uncomment below line to make test pass
		String expectedTitle = "Login page";
		
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
        System.out.println(actualTitle);
	}
	
	
}
