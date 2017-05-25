import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApptimizeAutomation {
	
	public ApptimizeAutomation() {
		
		// Run the test 5 times
		for(int i = 0; i < 5; i++) {
			System.setProperty("webdriver.gecko.driver", "browsers//geckodriver");
			WebDriver driver = new FirefoxDriver();
			driver.get(url);
			
			// Click on Sign Up
			driver.findElement(By.xpath(".//*[@id='nav-main']/ul[2]/li[1]/a")).click();
			
			// Wait for Sign Up button to show up before entering data to ensure the page has loaded
			WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='submit']")));
			
			// Enter First Name
			driver.findElement(By.xpath(".//*[@id='fname']")).sendKeys(firstName);;
			// Enter Last Name
			driver.findElement(By.xpath(".//*[@id='lname']")).sendKeys(lastName);
			// Enter Email
			driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(emails[i]);
			// Enter Company
			driver.findElement(By.xpath(".//*[@id='company']")).sendKeys(company);
			// Enter Phone Number
			driver.findElement(By.xpath(".//*[@id='phone']")).sendKeys(phone);
			// Enter Password
			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(password);
			// Click "No" radio button
			driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div[1]/div/div[2]/div[6]/div[2]/input[2]")).click();
			// Click EULA check box
			driver.findElement(By.xpath(".//*[@id='eula']")).click();
			// Click Sign Up button
			driver.findElement(By.xpath(".//*[@id='submit']")).click();
			// Close browser after completion
			driver.close();
		}
		
	}
	public static void main(String[] args) {
		ApptimizeAutomation test = new ApptimizeAutomation();
	}
	
	private String url = "https://apptimize.com";
	private String firstName = "Nam";
	private String lastName = "Lam";
	private String[] emails = { "namlamapptimize+test1@gmail.com", "namlamapptimize+test2@gmail.com", "namlamapptimize+test3@gmail.com",
								"namlamapptimize+test4@gmail.com", "namlamapptimize+test5@gmail.com" };
	private String company = "Apptimize Candidate";
	private String phone = "408-666-9160";
	private String password = "apptimizeTest#123";
	
}
