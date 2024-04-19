package testNG.part_01;

import org.testng.annotations.Test;

public class FirstTestCase1 {

    @Test(priority = 1)
    public void setup() {
        System.out.println("Opening browser");
    }

    @Test(priority = 2)
    public void login() {
        System.out.println("This is login test");
    }

    @Test(priority = 3)
    public void teardown() {
        System.out.println("Closing browser");
    }
}

/* output :
Opening browser
This is login test
Closing browser
 */