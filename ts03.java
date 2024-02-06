import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//demo linkdin login using firefox firefox
//we need to download firefox driver before working with firefox browser
//we need to set and copy the path of  firefox driver


public class ts03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/nikeshchowdary/Downloads/geckodriver");

        // Use FirefoxOptions to set up the driver
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.linkedin.com/login");
        WebElement username= driver.findElement(By.id("username"));
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("pvilli143@gmail.com");
        /*pasword*/
        WebElement password= driver.findElement(By.id("password"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("Jnainkue");
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();

      /* used to close the browser, keeping in qutations if needed use it
        driver.quit(); */

    }
}
