package pageClasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TestSeries {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='ng-binding']")
	WebElement testSeriesCourseList;

	public TestSeries(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public List<WebElement> testSeriesCourseList() {
		List<WebElement> testSeriesCourselist = driver.findElements(By.xpath("//a[@class='ng-binding']"));
		//System.out.println(testSeriesCourselist);
		return testSeriesCourselist;
	}
	
	
}
