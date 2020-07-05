package base;

import org.openqa.selenium.WebDriver;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WDFunctions {

	WebDriver driver;
	
	public void getCurrentTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");  
		Date date = new Date();  
		System.out.println(formatter.format(date)); 
		System.out.println (" my test suite started at this time --> " +formatter.format(date));
	}
}
