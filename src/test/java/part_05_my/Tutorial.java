package part_05_my;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // navigate.back():
        driver.navigate().back();

        // navigate.forward():
        driver.navigate().forward();

        // navigate.refresh():
        driver.navigate().refresh();

        // navigate.to():
        driver.navigate().to("https://example.com");
    }
}
