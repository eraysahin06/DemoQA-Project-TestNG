package day04;

import org.testng.annotations.Test;

public class _03_Groups {

    @Test(groups = "SmokeTest")
    void test1(){
        System.out.println("Test 1 Smoke Test");
    }

    @Test(groups = "RegressionTest")
    void test2(){
        System.out.println("Test 2 Regression");
    }

    @Test(groups = "RegressionTest")
    void test3(){
        System.out.println("Test 3 Regression");
    }

    @Test(groups = "SmokeTest")
    void test4(){
        System.out.println("Test 4 Smoke Test");
    }

    @Test(groups = {"SmokeTest","RegressionTest"})
    void test5(){
        System.out.println("Test 5 both smoke and regression");
    }
}
