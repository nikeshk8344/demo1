//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class ts02 {
    public ts02() {
    }

    public static void main(String[] args) {
        WebDriver driver = new SafariDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        WebElement email = driver.findElement(By.id("email"));
        email.isDisplayed();
        email.isEnabled();
        email.sendKeys(new CharSequence[]{"manikanta1196666@gmail.com"});
        WebElement pass = driver.findElement(By.id("pass"));
        pass.isDisplayed();
        pass.isEnabled();
        pass.sendKeys(new CharSequence[]{"Jnainkue"});
        driver.findElement(By.name("login")).click();
    }
}
