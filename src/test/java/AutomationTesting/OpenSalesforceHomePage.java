package AutomationTesting;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSalesforceHomePage {

    @Test
    public void openSalesforceHomePage() {

       
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=in");

        String title = driver.getTitle();
        System.out.println("Page Title = " + title);
        Assert.assertTrue(title.contains("Login | Salesforce"));
        
        driver.quit();
    }



}
