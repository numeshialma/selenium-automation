package part_05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.snapdeal.com ");
        // driver.get("http://www.amazon.com");

        driver.navigate().to("http://www.amazon.com");

        driver.navigate().back();  // snapdeal
        driver.navigate().forward();  // amazon
        driver.navigate().refresh();   // refresh / reload the page

    }
}

