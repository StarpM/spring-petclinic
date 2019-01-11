package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

import cucumber.api.java.en.*;

public class TestDataSets {
	WebDriver driver;

	@Given("^Open Chrome and launch the application$")
	public void open_the_Chrome_and_launch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C://Users//MARCOLIVIERPrats//Downloads//chromedriver.exe");

		// ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless");
		driver = new ChromeDriver();
		// driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("http://localhost:8080");
	}

	/*
	 * @When("^I enter his firstName$") public void Create_Owner(String firstName,
	 * String lastName, String address, String city, String telephone) throws
	 * Throwable {
	 * 
	 * driver.findElement(By.xpath("//div[@id='main-navbar']/ul/li[3]/a/span[2]")).
	 * click(); driver.findElement(By.cssSelector("a.btn.btn-default")).click();
	 * driver.findElement(By.name("firstName")).sendKeys(firstName);
	 * driver.findElement(By.name("lastName")).sendKeys(lastName);
	 * driver.findElement(By.name("address")).sendKeys(address);
	 * driver.findElement(By.name("city")).sendKeys(city);
	 * driver.findElement(By.name("telephone")).sendKeys(telephone);
	 * driver.findElement(By.cssSelector("button.btn.btn-default")).click(); }
	 */

	@When("^I go on the owner page$")
	public void Go_to_owner_page() throws Throwable {
		driver.findElement(By.xpath("//div[@id='main-navbar']/ul/li[3]/a/span[2]")).click();
	}

	@And("^I go on the create owner page$")
	public void Go_to_create_owner() throws Throwable {
		driver.findElement(By.cssSelector("a.btn.btn-default")).click();
	}

	/*
	 * @And("^I create a user '(.*)' '(.*)' '(.*)' '(.*)' '(.*)'$") public void
	 * Fill_Form(String firstName, String lastName, String address, String city,
	 * String telephone) throws Throwable {
	 * driver.findElement(By.name("firstName")).sendKeys(firstName);
	 * driver.findElement(By.name("lastName")).sendKeys(lastName);
	 * driver.findElement(By.name("address")).sendKeys(address);
	 * driver.findElement(By.name("city")).sendKeys(city);
	 * driver.findElement(By.name("telephone")).sendKeys(telephone); }
	 */
	@And("^I enter his firstName '(.*)'$")
	public void Enter_firstName(String firstName) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(firstName);
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File("C:\\tmp\\headless_screenshot-firstname.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@And("^I enter his lastName '(.*)'$")
	public void Enter_lastName(String lastName) throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys(lastName);
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File("C:\\tmp\\headless_screenshot-lastname.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@And("^I enter his address '(.*)'$")
	public void Enter_address(String address) throws Throwable {
		driver.findElement(By.name("address")).sendKeys(address);
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File("C:\\tmp\\headless_screenshot-address.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@And("^I enter his city '(.*)'$")
	public void Enter_city(String city) throws Throwable {
		driver.findElement(By.name("city")).sendKeys(city);
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\tmp\\headless_screenshot-city.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@And("^I enter his telephone '(.*)'$")
	public void Enter_telephone(String telephone) throws Throwable {
		driver.findElement(By.name("telephone")).sendKeys(telephone);
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\tmp\\headless_screenshot-phone.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@And("^I click on add user$")
	public void Add_User() throws Throwable {
		driver.findElement(By.cssSelector("button.btn.btn-default")).click();

	}

	@Then("^The previously created users should exist$")
	public void find_Owners() throws Throwable {
		driver.findElement(By.cssSelector("button.btn.btn-default")).click();
	}
}