import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SelFinTest {



    @Test

    void Setup(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/");



    }
}
