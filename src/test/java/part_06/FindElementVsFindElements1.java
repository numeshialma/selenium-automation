package part_06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementVsFindElements1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register");

        // findElements() --> Return multiple WebElements
        //  1.
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println("Number of elements captured : " +links.size());
            // output : Number of elements captured : 22

        // 2. single element
        List<WebElement> logo = driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println(logo.size());

        // 3. do not exist
        List<WebElement> elements = driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));
        System.out.println(elements.size());
            // return empty set
    }
}
