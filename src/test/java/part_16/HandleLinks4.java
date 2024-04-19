package part_16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleLinks4 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Normal for loop
        for(WebElement link : links ){
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
        }

    }


}
