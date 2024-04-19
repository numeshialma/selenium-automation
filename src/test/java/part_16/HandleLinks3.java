package part_16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleLinks3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Normal for loop
        for(int i=0; i<links.size(); i++){
            System.out.println(links.get(i).getText());
            System.out.println(links.get(i).getAttribute("href"));
        }

        /* output : Number of links present : 142


         */
    }


}
