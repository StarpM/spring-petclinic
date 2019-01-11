package StepDefinition;		

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;		

public class Steps {				
		
    WebDriver driver;			
    		
    @Given("^I open the Chrome and launch the application$")					
    public void open_the_Chrome_and_launch_the_application() throws Throwable							
    {		
        System.setProperty("webdriver.chrome.driver", "C://Users//MARCOLIVIERPrats//Downloads//chromedriver.exe");					
        
        ChromeOptions chromeOptions = new ChromeOptions();
        
        //chromeOptions.addArguments("--headless");
        //driver= new ChromeDriver(chromeOptions);
        
        driver= new ChromeDriver();
        
        driver.manage().window().maximize();			
        driver.get("http://localhost:8080");					
     }
	
    @When("^I create one owner$")					
    public void Create_Owner() throws Throwable 							
    {		
    	driver.findElement(By.xpath("//div[@id='main-navbar']/ul/li[3]/a/span[2]")).click();
    	driver.findElement(By.cssSelector("a.btn.btn-default")).click();
    	driver.findElement(By.name("firstName")).sendKeys("Hello");							
    	driver.findElement(By.name("lastName")).sendKeys("World");							
    	driver.findElement(By.name("address")).sendKeys("41 rue de Valmy");							
    	driver.findElement(By.name("city")).sendKeys("Paris");							
    	driver.findElement(By.name("telephone")).sendKeys("0102030405");							
    	driver.findElement(By.cssSelector("button.btn.btn-default")).click();						
    }		

    @Then("^The previously created user should exists$")					
    public void find_Owner() throws Throwable 							
    {
    	driver.findElement(By.cssSelector("a[title=\"find owners\"]")).click();
    	driver.findElement(By.name("lastName")).sendKeys("World");
    	driver.findElement(By.cssSelector("button.btn.btn-default")).click();
    }
}			