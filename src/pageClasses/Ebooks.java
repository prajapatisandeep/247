package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Ebooks {

	WebDriver driver;
	
	public Ebooks(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
