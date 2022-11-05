package week2Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//start chromedriver with given webpage
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//login
		driver.findElement(By.id("username")).sendKeys("Democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		Thread.sleep(5000);
		//Navigate to create contact
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		String givenfirstname = "TestFirstname";
		driver.findElement(By.id("firstNameField")).sendKeys(givenfirstname);
		driver.findElement(By.id("lastNameField")).sendKeys("Testlastname");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		Thread.sleep(5000);
		//validate the browser and close it
		String loadedfirstName = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		if(givenfirstname.equals(loadedfirstName))
		{
			System.out.println("Contact saved successfully");
		}
		else
		{
			System.out.println("Contact is not saved properly");
		}
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.close();
	}
}