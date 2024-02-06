import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ts01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/nikeshchowdary/Downloads/chromedriver-mac-arm64/chromedriver");
        WebDriver driver = new ChromeDriver();
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


    }
}
