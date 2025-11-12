import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelFinTest_Workflow_Form {



    @Test

    void Setup(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys(new CharSequence[]{"Meaghan"});
        driver.findElement(By.id("last-name")).sendKeys(new CharSequence[]{"Lewis"});
        driver.findElement(By.id("job-title")).sendKeys(new CharSequence[]{"QA Engineer"});
        driver.findElement(By.id("radio-button-2")).click();
        driver.findElement(By.id("checkbox-2")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        driver.findElement(By.id("datepicker")).sendKeys(new CharSequence[]{"05/28/2019"});
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();



        driver.quit();








    }
}
