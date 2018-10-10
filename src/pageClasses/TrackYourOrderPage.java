package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TrackYourOrderPage {

	WebDriver driver;

	public TrackYourOrderPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

}
