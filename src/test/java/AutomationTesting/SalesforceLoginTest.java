package AutomationTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SalesforceLoginTest {

    WebDriver driver;

    @BeforeClass
    public void setup()
    {        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testing-hussain-dev-ed.develop.my.salesforce.com/");
    }
    
    @Test
    public void loginToSalesforce() throws InterruptedException 
    {
        // Test code for Salesforce login functionality will go here

        WebElement username = driver.findElement(By.id("username"));    // Locate username field   
        username.sendKeys("sshussain@salesforceqa.co.in");  // Enter username

        WebElement password = driver.findElement(By.id("password"));  // Locate password field
        password.sendKeys("Shabber@1412");  // Enter password

        WebElement loginbutton = driver.findElement(By.id("Login"));  // Locate login button
        loginbutton.click();  // Click login button


       //wait(9000); // Just for demonstration, better to use explicit waits

        // WebElement verificationcode = driver.findElement(By.id("Verification Code"));  // Locate verification code field
        //  verificationcode.sendKeys("386394");  // Enter verification code

        // WebElement verifybutton = driver.findElement(By.id("Verify"));  // Locate verify button
        // verifybutton.click();  // Click verify button

        Thread.sleep(9000); // Just for demonstration, better to use explicit waits

        Assert.assertTrue(driver.getTitle().contains("Home")
                || driver.getCurrentUrl().contains("lightning"),
                "Login failed or not redirected to Lightning Home page");
            
    }

    @AfterClass
        public void tearDown() // Close the browser after test execution
        {
            if (driver != null) {  // Check if driver is initialized
                driver.quit();  // Close the browser
            }

        }

}
