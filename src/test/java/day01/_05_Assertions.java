package day01;


import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_Assertions {

    @Test
    void test1() {
        String str1 = "John";
        String str2 = "John";
        // checks if actual and expected are equal
        Assert.assertEquals(str1, str2, "Test is not successful");
    }

    @Test
    void test2() {
        String str1 = "John";
        String str2 = "Snow";

        Assert.assertEquals(str1, str2, "Test is not successful");
    }

    @Test
    void test3() {
        int n1 = 5;
        int n2 = 6;
//        String str1 = "John";
//        String str2 = "Snow";
        // checks if actual and expected are not equal
        Assert.assertNotEquals(n1, n2, "Test is not successful");
    }

    @Test
    void test4() {
        String str1 = "John";
        String str2 = "John";
        // checks if actual and expected are not equal
        Assert.assertNotEquals(str1, str2, "Test is not successful");
    }

    @Test
    void test5() {
        int num1 = 54;
        int num2 = 37;
        // checks if the condition is true
        Assert.assertTrue(num1 == num2, "Test is not successful");
    }

    @Test
    void test6() {
        int num1 = 54;
        int num2 = 54;

        Assert.assertTrue(num1 == num2, "Test is not successful");
    }

    @Test
    void test7() {
        String name = "John";
        Assert.assertNull(name, "Test is not successful");
    }

    @Test
    void test8() {
        String name = "John";

        Assert.fail("Test fails anyways");
    }

}
