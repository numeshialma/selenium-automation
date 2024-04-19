package part_26;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshots2 {

    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // Screenshot of section/portion of page

        WebElement ele = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));

        File src = ele.getScreenshotAs(OutputType.FILE);
        File trg = new File(".\\screenshots\\featureproducts.png");

        FileUtils.copyFile(src,trg);

    }
}
