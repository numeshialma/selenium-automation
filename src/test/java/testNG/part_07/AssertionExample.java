package testNG.part_07;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {

    WebDriver driver;
    @Test
    public void testAssertEquals() {
        String expected = "Hello";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Strings do not match");
    }

    @Test
    public void testAssertTrue() {
        boolean condition = true;
        Assert.assertTrue(condition, "Condition is not true");
    }

    @Test
    public void testAssertFalse() {
        boolean condition = false;
        Assert.assertFalse(condition, "Condition is not false");
    }

    @Test
    public void testAssertNotNull() {
        Object obj = new Object();
        Assert.assertNotNull(obj, "Object is null");
    }

    @Test
    public void testAssertNull() {
        Object obj = null;
        Assert.assertNull(obj, "Object is not null");
    }

    @Test
    public void testAssertNotEquals() {
        int expected = 5;
        int actual = 10;
        Assert.assertNotEquals(actual, expected, "Values should not be equal");
    }

    @Test
    public void testAssertSame() {
        Object obj1 = new Object();
        Object obj2 = obj1;
        Assert.assertSame(obj1, obj2, "Objects are not the same");
    }

    @Test
    public void testAssertNotSame() {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Assert.assertNotSame(obj1, obj2, "Objects should not be the same");
    }
}
