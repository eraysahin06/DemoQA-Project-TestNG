package day06;

import org.testng.annotations.Test;

public class _03_DataProviderFromDifferentClass {

    @Test(dataProvider = "myData", dataProviderClass = _01_DataProvider.class)
    void test1(String username, String password){
        System.out.println("Test1 is running for "+username+" "+password);
    }
}
