package testNG.part_01;

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test
    public void setup() {
        System.out.println("Opening browser");
    }

    @Test
    public void login() {
        System.out.println("This is login test");
    }

    @Test
    public void teardown() {
        System.out.println("Closing browser");
    }
}

/* output :
This is login test
Opening browser
Closing browser
 */