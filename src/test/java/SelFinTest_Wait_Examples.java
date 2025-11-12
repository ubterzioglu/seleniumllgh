import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelFinTest_Wait_Examples {



    @Test

    void Setup()
// throws InterruptedException
     {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
//  Thread.sleep(1000);

        // WAIT COMMAND HERE // Implicit Waits

        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // WAIT COMMAND HERE // Explicit Waits

       WebDriverWait wait = new WebDriverWait(driver, 10) ;
       WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
       autocompleteResult.click();



        driver.quit();








    }
}
