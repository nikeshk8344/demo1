import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

//demo facebook login using safari driver
//we need to click allow developers in settings before going forward with safari

public class ts02 {
    public static void main(String[] args) {
        // Set the Safari driver executable path if needed its automated for new versions
        // System.setProperty("webdriver.safari.driver", "/path/to/safaridriver");

        WebDriver driver = new SafariDriver();
        driver.get("https://www.facebook.com");

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        WebElement email = driver.findElement(By.id("email"));
        email.isDisplayed();
        email.isEnabled();
        email.sendKeys("manikanta1196666@gmail.com");

        WebElement pass = driver.findElement(By.id("pass"));
        pass.isDisplayed();
        pass.isEnabled();
        pass.sendKeys("Jnainkue");
        driver.findElement(By.name("login")).click();
        /* used to close the browser, keeping in qutations if needed use it
        driver.quit(); */


    }
}
