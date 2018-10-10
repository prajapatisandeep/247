package automationUtility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import pageClasses.HomePage;

public class WebUIUtility {

	public static WebUIUtility webUtilObj;
	public WebDriver driver;
	public Actions actionObj;

	private WebUIUtility() {

	}

	public static WebUIUtility getObjectOfWebUIUtility() {
		if (webUtilObj == null) {
			webUtilObj = new WebUIUtility();
		}
		return webUtilObj;
	}

	public WebDriver launchBrowser(String browserName) {
		if (driver == null) {
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "WebDriver/chromedriver");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "WebDriver/geckodriver");
				driver = new FirefoxDriver();
			}
		}
		driver.manage().window().fullscreen();
		return driver;
	}

	public void launchApplication(String url) {
		driver.get(url);
		
	}
	
	

	public void scrollArrowDown(int numberOfTimes) {
		actionObj = new Actions(driver);
		for (int i = 0; i < numberOfTimes; i++) {
			actionObj.sendKeys(Keys.ARROW_DOWN).build().perform();
		}

	}

	public void scrollPageDown(int timeout, int numberOfTimes, WebDriver driver) {
		WebUIUtility.getObjectOfWebUIUtility().timeOut(timeout);
		Actions actionObj = new Actions(driver);
		for (int i = 0; i < numberOfTimes; i++) {
			actionObj.sendKeys(Keys.PAGE_DOWN).build().perform();

		}
	}

	public void mouseHoverOnElement(WebElement element) {
		actionObj = new Actions(driver);
		actionObj.moveToElement(element).perform();

	}

	public void mouseHoverOnElementAndClick(WebElement mainElement, WebElement subElement) {
		actionObj = new Actions(driver);
		actionObj.moveToElement(mainElement).perform();
		WebUIUtility.getObjectOfWebUIUtility().timeOut(1);
		actionObj.click(subElement).build().perform();

	}

	public void acceptAlert() {
		WebUIUtility.getObjectOfWebUIUtility().timeOut(1);
		driver.switchTo().alert().accept();
	}

	public void timeOut(long seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
