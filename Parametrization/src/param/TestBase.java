package param;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestBase {

	// declaring WebDriver as null in the beginning so we can use it as we please through this public class (our case in the else if and outside of it) - Globally defined 
	public WebDriver driver=null;
	
	@Test
	public void Login () throws IOException 
	{
		Properties prop = new Properties(); // 
		FileInputStream fis=new FileInputStream("G:\\Florin Work\\Selenium workplace\\Parametrization\\src\\param\\datadriven.properties"); // for the argument - right click on the properties file, go to Properties and copy the location 
		
			prop.load(fis); // for loading the file 
			System.out.println(prop.getProperty("username")); // printing the username which is taken from the prop file 
		
		
		
		// parametrizing the browser which will be used for running the tests  - code block for picking the browser from the properties file 
		// Note: selenium server standalone was added as an external jar to the project 
		
			
		if(prop.getProperty("browser").contains("chrome"))
			{
				driver = new ChromeDriver();
			}
		else if (prop.getProperty("browser").contains("firefox"))
			{
				driver = new FirefoxDriver();
			}
		else 
			{
				driver = new InternetExplorerDriver();
			}
		
		driver.get(prop.getProperty("url"));  // we get the url from the properties document 
	}
	
	
	
	
}
