package part_26;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshots1 {

    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // Screenshot of section/portion of page

        WebElement section = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid"));

        File src = section.getScreenshotAs(OutputType.FILE);
        File trg = new File(".\\screenshots\\logo.png");

        FileUtils.copyFile(src,trg);

    }
}
