package day06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _02_DataProviderIterator {

    @Test(dataProvider = "myData")
    void searchTest(String searchText){
        System.out.println("search "+searchText);
    }

    @DataProvider
    public Iterator<Object[]> myData(){
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"mac"});
        data.add(new Object[]{"samsung"});
        data.add(new Object[]{"lenovo"});

        return data.iterator();
    }
}
