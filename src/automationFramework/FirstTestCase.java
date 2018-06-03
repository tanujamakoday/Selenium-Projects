package automationFramework;

public class FirstTestCase {
	Public static void main (String[] args)
	{
		//Create a new instance of the firefox driver 
		Webdriver driver = new FirefoxDriver();
		
		//Launch the online store website 
		driver.get ("http://www.store.demoqa.com");
		//Print a login message to the screen 
		
		System.out.println ( "Successfully opened the website www.store.Demoqa.com")
		
		//wait for 5 sec 
		
		Thread.sleep((5000);
		
		//Close the driver
		Driver.quit();
	}
}


