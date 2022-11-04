package MovieCompare.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

public class MovieCompareTestBase extends TestBase {
	
	public static String countryWiki, countryIMDB, releaseWiki, releaseIMDB;
	
	

		
		
		
	
	@BeforeSuite
	public void getAndStoreData() throws InterruptedException{
		
		setUp();

		log.debug("Fetching data from Website 1: Wikipedia");
		driver.get(config.getProperty("website1"));
		//type("searchWiki_XPATH", searchMovie_var);
		driver.findElement(By.xpath(OR.getProperty("searchWiki_XPATH"))).sendKeys(config.getProperty("searchMovie"));
		click("searchWikiBtn_XPATH");
		//driver.findElement(By.xpath(OR.getProperty("searchWikiBtn_XPATH"))).click();
		countryWiki=driver.findElement(By.xpath(OR.getProperty("countryWiki_XPATH"))).getText();
		System.out.println(countryWiki);
		releaseWiki=driver.findElement(By.xpath(OR.getProperty("releaseWiki_XPATH"))).getText();
		System.out.println(releaseWiki);

		log.debug("Fetching data from Website 2: IMDB");
		//driver.switchTo().window(driver.getWindowHandle());
		driver.get(config.getProperty("website2"));
		//type("searchIMDB_XPATH", searchMovie_var);
		driver.findElement(By.xpath(OR.getProperty("searchIMDB_XPATH"))).sendKeys(config.getProperty("searchMovie"));
		//click("searchIMDBBtn_XPATH");
		driver.findElement(By.xpath(OR.getProperty("searchIMDBBtn_XPATH"))).click();
		WebElement ele=driver.findElement(By.partialLinkText("Pushpa: The Rise"));
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();

		countryIMDB=driver.findElement(By.xpath(OR.getProperty("countryIMDB_XPATH"))).getText();
		System.out.println(countryIMDB);
		releaseIMDB=driver.findElement(By.xpath(OR.getProperty("releaseIMDB_XPATH"))).getText();
		System.out.println(releaseIMDB);
		log.debug("Values fetched Successfully");
		Thread.sleep(5000);
		
		
		// type("searchWiki_XPATH", searchMovie_var);
		// click("searchWikiBtn_XPATH");

	}

}
