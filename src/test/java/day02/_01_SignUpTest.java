package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_SignUpTest {
/** Go to "https://opencart.abstracta.us/index.php?route=account/login"
 * Click on My Accout
 * Click on Register
 * Fill int he form with valid informations
 * Accept the agreement
 * Click on Continue button
 * Verify that you are signed up
 */

    @Test
    void signUp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        WebElement myAccount = driver.findElement(By.xpath("//a[@title='My Account']"));
        myAccount.click();

        WebElement register = driver.findElement(By.xpath("(//*[@id=\"top-links\"]//a)[3]"));
        register.click();

        WebElement firstname = driver.findElement(By.id("input-firstname"));
        firstname.sendKeys("John");

        WebElement lastname = driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("Snow");

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("johnsnow2@gmail.com");

        WebElement telephone = driver.findElement(By.id("input-telephone"));
        telephone.sendKeys("6547893215");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("john1234");

        WebElement passwordConfirm = driver.findElement(By.id("input-confirm"));
        passwordConfirm.sendKeys("john1234");

        WebElement checkBox = driver.findElement(By.name("agree"));
        checkBox.click();

        WebElement continueButton = driver.findElement(By.cssSelector("input[value='Continue']"));
        continueButton.click();

        WebElement successMessage = driver.findElement(By.xpath("//div[@id='content']//p"));

        Assert.assertEquals(successMessage.getText(),"Congratulations! Your new account has been successfully created!","Your test is not passed");
        Thread.sleep(3000);
        driver.quit();
    }














}
