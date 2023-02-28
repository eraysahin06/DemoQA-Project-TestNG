package day02;

import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_UpdateNameTest extends DriverClass {
    /** Go to "https://opencart.abstracta.us/index.php?route=account/login"
     * Login
     * Click on Edit Account
     * Update name
     * Click on Continue
     * Verify the success message
     *
     * Then update the name with the old name
     */

    @Test
    void editNameTest(){
        editName("TestNG3");
        editName("TestNG");
    }

    public void editName(String name){
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
//
//        WebElement emailInput = driver.findElement(By.id("input-email"));
//        emailInput.sendKeys("testngusbatch@gmail.com");
//
//        WebElement password = driver.findElement(By.id("input-password"));
//        password.sendKeys("usbatch1234");
//
//        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
//        loginButton.click();

        WebElement editAccount = driver.findElement(By.xpath("//a[text()='Edit Account']"));
        editAccount.click();

        WebElement firstname = driver.findElement(By.id("input-firstname"));
        firstname.clear();
        firstname.sendKeys(name);

        WebElement continueButton = driver.findElement(By.cssSelector("input[type='submit']"));
        continueButton.click();

        WebElement successMessage = driver.findElement(By.cssSelector("div[class=\"alert alert-success alert-dismissible\"]"));
        Assert.assertEquals(successMessage.getText(),"Success: Your account has been successfully updated.");

    }
}
