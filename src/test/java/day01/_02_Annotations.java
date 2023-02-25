package day01;

import org.testng.annotations.*;

public class _02_Annotations {
    // BeforeClass --> This code will be run before the class
        // @BeforeMethod --> This code will be run before all test annotations
            // @Test --> To write our tests
            // @Test --> To write our tests
        //AfterMethod --> This code will be run after all test annotations
    // AfterClass --> This code will be run after the class

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method is working");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method is working");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class is working");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class is working");
    }

    @Test
    void test1(){
        System.out.println("Test 1 is successful");
    }

    @Test
    void test2(){
        System.out.println("Test 2 is successful");
    }
}
