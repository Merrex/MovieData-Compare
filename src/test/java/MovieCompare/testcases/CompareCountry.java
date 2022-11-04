package MovieCompare.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MovieCompare.base.MovieCompareTestBase;
import MovieCompare.base.TestBase;
//import MovieCompare.util.TestUtil;

public class CompareCountry extends MovieCompareTestBase {

	@Test
	public void compareCountry() throws InterruptedException {

		log.debug("Comparing Country Values");
		System.out.println(countryWiki);
		System.out.println(countryIMDB);
		Assert.assertEquals(countryWiki, countryIMDB);
	}

	

	
}
