package testNG.part_08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
    WebDriver driver;

    @BeforeMethod
    @Parameters({"browser","url"})
    public void setUp(String browser,String app) {

        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
        }

        driver.get(app);
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

    }
}
