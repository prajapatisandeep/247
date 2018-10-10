package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Publications {

	
	WebDriver driver;
	
	
	public Publications(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}

}
