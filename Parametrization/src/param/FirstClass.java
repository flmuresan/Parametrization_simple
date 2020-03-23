package param;

import java.io.IOException;

import org.testng.annotations.Test;

public class FirstClass extends TestBase{
	
	@Test
	public void OpeningBrowser() throws IOException {  // using the Login method definded in the TestBase 
		Login();
		System.out.println("success");
		
	}

}
