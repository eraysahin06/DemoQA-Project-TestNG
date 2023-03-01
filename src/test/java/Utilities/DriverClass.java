package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class DriverClass {

    public static WebDriver driver;

    @BeforeClass
    public void startingSettings() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        login();
    }

    void login() {
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        WebElement emailInput = driver.findElement(By.id("input-email"));
        emailInput.sendKeys("testngusbatch@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("usbatch1234");

        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
        loginButton.click();
    }

//    @AfterClass
//    public void finishSettings(){
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.quit();
//    }


}
