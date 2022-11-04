package MovieCompare.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import MovieCompare.base.MovieCompareTestBase;

public class CompareReleaseDate extends MovieCompareTestBase {
	

		@Test
		public void compareDate() throws InterruptedException {

			log.debug("Comparing Date Values");
			System.out.println(releaseWiki);
			System.out.println(releaseIMDB);
			Assert.assertEquals(countryWiki, countryIMDB);
			driver.close();
		}

}
