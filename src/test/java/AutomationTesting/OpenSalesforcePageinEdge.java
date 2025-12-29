package AutomationTesting;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;




public class OpenSalesforcePageinEdge {

    @Test
    public void openSalesforceInEdge() {
        // Set the path to the Edge WebDriver executable
        System.setProperty("webdriver.edge.driver", "/Users/SHIAK SHABBER/Documents/WebDrivers/msedgedriver.exe");

        // Initialize Edge WebDriver
        WebDriver driver = new EdgeDriver();

        // Navigate to Salesforce login page
        driver.get("https://login.salesforce.com/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Close the browser
        driver.quit();
    }
}

    // public static void main(String[] args) {
    //     // Set the path to the Edge WebDriver executable
    //     System.setProperty("webdriver.edge.driver", "/Users/SHIAK SHABBER/Documents/WebDrivers/msedgedriver.exe");

    //     // Initialize Edge WebDriver
    //     WebDriver driver = new EdgeDriver();

    //     // Navigate to Salesforce login page
    //     driver.get("https://login.salesforce.com/");

    //     // Maximize the browser window
    //     driver.manage().window().maximize();

    //     // Close the browser
    //     driver.quit();
    // }


