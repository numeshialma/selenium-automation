package testNG.part_09;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {


    @Test
    public void loginTest(String email, String pwd) {
        System.out.println(email+ "  " +pwd);
    }

    @DataProvider(name="LoginDataProvider")
    public Object[][] getData(){
        Object[][] data = { {"abc1@gmail.com","abc1"},{"abc2@gmail.com","abc2"},{"abc3@gmail.com","abc3"},{"abc4@gmail.com","abc4"}};
        return data;
    }
}
