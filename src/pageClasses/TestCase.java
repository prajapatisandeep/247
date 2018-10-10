package pageClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automationUtility.WebUIUtility;

public class TestCase {
	


	public static final String url = "https://store.adda247.com";
	public static final String userName = "sandeep.parjapati87@gmail.com";
	public static final String passWord = "Welcome@01";
	
	@FindBy(xpath="//a[text()='COURSES']")
	public static WebElement courses;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = WebUIUtility.getObjectOfWebUIUtility().launchBrowser("chrome");
		WebUIUtility.getObjectOfWebUIUtility().launchApplication(url);
		
		HomePage homePageObj = new HomePage(driver);
		//homePageObj.navigateToSignInPage();
		
		//SignInPage signInPageObj = new SignInPage(driver);
		//signInPageObj.userSignIn(userName, passWord);
		
		homePageObj.navigateToTestSeries();
		
		TestSeries testSeriesObj = new TestSeries(driver);
		List<WebElement> testSeriesCourseList = testSeriesObj.testSeriesCourseList();
		
		System.out.println(testSeriesCourseList);
		
		

	}

}
