package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationUtility.WebUIUtility;


public class HomePage {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='SIGNIN ']")
	WebElement signInPage;
	
	@FindBy(xpath="(//a['href=\"#!/testseries/list\"'])[21]")
	WebElement navigateToTestSeries;
	
	@FindBy(xpath="(//a['href=\"#!/books/list\"'])[22]")
	WebElement navigateToPublications;
	
	@FindBy(xpath="(//a['href=\"#!/ebooks/list\"'])[23]")
	WebElement navigationToEbook;
	
	@FindBy(xpath="(//a['href=\"#!/ebooks/list\"'])[24]")
	WebElement navigateToEbooks;
	
	@FindBy(xpath="(//a['href=\"#!/ebooks/list\"'])[25]")
	WebElement navigateToOnlineLiveClasses;
	
	@FindBy(xpath="(//a['href=\"https://www.adda247.com\"'])[1]")
	WebElement navigateToAdda247HomePage;
	
	@FindBy(xpath="(//a['href=\"https://www.adda247.com\"'])[2]")
	WebElement navigateToOnlineSupportPage;
	
	@FindBy(xpath="(//a['href=\"https://www.adda247.com\"'])[3]")
	WebElement navigateToTrackYourOrderPage;
	
	@FindBy(xpath="(//a['href=\"https://www.adda247.com\"'])[4]")
	WebElement downloadAppPage;
	
	@FindBy(xpath="//span[text()='HAVE A DOUBT']")
	WebElement naviagteToDoubtPage;
	
	@FindBy(xpath="//span[@class='icon-cart icons-topbar']")
	WebElement navigateToMyCartPage;
	
	
	
	
	
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public SignInPage navigateToSignInPage() {
		signInPage.click();
		SignInPage signInPageObj = new SignInPage(driver);
		return signInPageObj;
		
	}
	
	
	public TestSeries navigateToTestSeries() {
		WebUIUtility.getObjectOfWebUIUtility().timeOut(1);
		navigateToTestSeries.click();
		String title= driver.getTitle();
		//System.out.println(title);
		//(driver.getTitle().equals("Adda247 Store | Adda247 Store"));
		TestSeries testSeriesObj = new TestSeries(driver);
		return testSeriesObj;
	}
	
	
	public Publications navigateToPublication() {
		WebUIUtility.getObjectOfWebUIUtility().timeOut(1);
		navigateToPublications.click();
		Publications publicationsObj = new Publications(driver);
		return publicationsObj;
	}
	
	
	public Ebooks navigateToEbooks() {
		WebUIUtility.getObjectOfWebUIUtility().timeOut(1);
		navigateToEbooks.clear();
		Ebooks ebooksObj = new Ebooks(driver);
		return ebooksObj;
	}
	
	public Adda247HomePage navigateToAdda247Home() {
		WebUIUtility.getObjectOfWebUIUtility().timeOut(1);
		navigateToAdda247HomePage.click();
		Adda247HomePage add247HomePageObj = new Adda247HomePage(driver);
		return add247HomePageObj;
		
	}
	
	public DownloadAppPage navgateToDownloadAppPage() {
		WebUIUtility.getObjectOfWebUIUtility().timeOut(1);
		downloadAppPage.click();
		DownloadAppPage downloadAppPageObj = new DownloadAppPage(driver);
		return downloadAppPageObj;
	}
	
	public TrackYourOrderPage navigateToTrackYourOrderPage() {
		WebUIUtility.getObjectOfWebUIUtility().timeOut(1);
		navigateToTrackYourOrderPage.click();
		TrackYourOrderPage trackYourOrderPageObj = new TrackYourOrderPage(driver);
		return trackYourOrderPageObj;
		
	}
	
	public OnLineSupportPage navigateToOnlineSupport() {
		WebUIUtility.getObjectOfWebUIUtility().timeOut(1);
		navigateToOnlineSupportPage.click();
		OnLineSupportPage onlineSupportPageObj = new OnLineSupportPage(driver);
		return onlineSupportPageObj;
	}
	
	public DoubtPage navigateToDoubtPage() {
		WebUIUtility.getObjectOfWebUIUtility().timeOut(1);
		naviagteToDoubtPage.click();
		DoubtPage doubtPageObj = new DoubtPage(driver);
		return doubtPageObj;
	}
	
	public MyCartPage navigateToMyCartPage() {
		WebUIUtility.getObjectOfWebUIUtility().timeOut(1);
		navigateToMyCartPage.click();
		MyCartPage myCartPageObj = new MyCartPage(driver);
		return myCartPageObj;
		
	}
	
	

}
