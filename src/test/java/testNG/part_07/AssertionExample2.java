package testNG.part_07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AssertionExample2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(String browser,String app) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test(priority = 1)
    void logTest() {
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isSelected(),"Logo not displayed on the page");
    }

    @Test(priority = 2)
    public void homePageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title,"OrangeHRM","Title is not matched");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
