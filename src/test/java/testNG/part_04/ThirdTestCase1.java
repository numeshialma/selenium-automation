package testNG.part_04;

import org.testng.annotations.Test;

public class ThirdTestCase1 {

    @Test(priority = 1)
    public void setup() {
        System.out.println("Opening browser");
    }

    @Test(priority = 2)
    public void login() {
        System.out.println("This is login test");
    }

    @Test(priority = 3,enabled = false)  // this will not execute
    public void teardown() {
        System.out.println("Closing browser");
    }
}

/* output :
Opening browser
This is login test
Closing browser
 */