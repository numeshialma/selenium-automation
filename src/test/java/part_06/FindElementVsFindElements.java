package part_06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVsFindElements {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register");

        // findElement() --> Return single WebElement
        //  1.
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        searchBox.sendKeys("XYZ");

        // 2.   multiple webelements
        WebElement element = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(element.getText());

        // 3.  element does not exist
        //WebElement searchButton = driver.findElement(By.xpath("//button[contains(text(),'Search')]")); // exist
        WebElement searchButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]")); // not exist
        // returns no such element exception

    }
}
