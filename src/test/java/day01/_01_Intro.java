package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _01_Intro {
//    public static void main(String[] args) {
//        // go to the page
//        // login
//        // add to cart
//        // check out
//    }


    //If you don't give the order it runs the tests in alphabetical order
    @Test(priority = 1) // first test to be run
    public void loginTest(){
        System.out.println("Login test is successful");
    }

    @Test(priority = 2) // second test to be run
    public void addToCartTest(){
        System.out.println("Add to Cart test is successful");
    }

    @Test(priority = 3) // third test to be run
    public void checkOutTest(){
        System.out.println("Checkout test is successful");
    }
}
