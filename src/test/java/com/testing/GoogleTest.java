//https://svn2.sliksvn.com/sejsoft_sejalbhayana

// sejal 
// pass@1234
package com.testing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class GoogleTest{
	
	@Test
	public void testGoogle(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.quit();
	}
  
}
