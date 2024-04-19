package part_06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementVsFindElements2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register");

        // findElements() --> Return multiple WebElements
        //  1.
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println("Number of elements captured : " +links.size());
            // output : Number of elements captured : 22

        for(WebElement ele : links){
            System.out.println(ele.getText());
        }


    }
}
