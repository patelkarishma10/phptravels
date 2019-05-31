package com.bae.phptravels.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhpTravelsTest {
	public static WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void methodTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/");
		WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"s2id_autogen3\"]/a"));
		checkElement.click();
		checkElement.sendKeys("london");
		WebElement newElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select2-drop\"]/ul")));
		WebElement newElement2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li[1]/div")));
		checkElement = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li[1]/div"));
		checkElement.click();
		checkElement = driver.findElement(By.xpath("//*[@id=\"dpd1\"]/div/input"));
		checkElement.click();
		checkElement.sendKeys("09/06/2019");
		checkElement = driver.findElement(By.xpath("//*[@id=\"dpd2\"]/div/input"));
		checkElement.click();
		checkElement.sendKeys("12/06/2019");
		checkElement = driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/tbody/tr[3]/td[4]"));
		checkElement.click();
		checkElement = driver.findElement(By.xpath("//*[@id=\"travellersInput\"]"));
		checkElement.click();
		WebElement newElement3 = (new WebDriverWait(driver, 10)).until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"options\"]/div[1]/div[1]/div")));
		checkElement = driver.findElement(By.xpath("//*[@id=\"adultPlusBtn\"]"));
		checkElement.click();
		checkElement = driver.findElement(By.xpath("//*[@id=\"hotels\"]/form/div[5]/button"));
		checkElement.click();
		driver.get("https://www.phptravels.net/hotels/listing/2");
		// checkElement =
		// driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[5]/div/div[3]/div[2]/ul/li[3]/a"));
		// checkElement.click();

		checkElement = driver.findElement(By.xpath(
				"//*[@id=\"body-section\"]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[3]/td/div[2]/div/h4/a/b"));
		checkElement.click();

		checkElement = driver
				.findElement(By.xpath("//*[@id=\"body-section\"]/div[4]/div[2]/div/div[2]/form/div[1]/div/input"));
		// checkElement.click();
		checkElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		checkElement.sendKeys("09/06/2019");
		checkElement = driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/tbody/tr[3]/td[1]"));
		checkElement.click();

		checkElement = driver
				.findElement(By.xpath("//*[@id=\"body-section\"]/div[4]/div[2]/div/div[2]/form/div[2]/div/input"));
		checkElement.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
		checkElement.sendKeys("12/06/2019");
		checkElement = driver.findElement(By.xpath("/html/body/div[13]/div[1]/table/tbody/tr[3]/td[4]"));
		checkElement.click();

		checkElement = driver
				.findElement(By.xpath("//*[@id=\"body-section\"]/div[4]/div[2]/div/div[2]/form/div[3]/div"));

		Actions action = new Actions(driver);
		action.moveToElement(checkElement).doubleClick().perform();
		action.moveToElement(checkElement).sendKeys("3").perform();

		checkElement = driver.findElement(
				By.xpath("//*[@id=\"ROOMS\"]/div/table/tbody/tr[2]/td/div[2]/div[2]/div/div[3]/div/label/div"));
		checkElement.click();

		Thread.sleep(3000);
	}
}
