package part_03;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser4 {

    public static void main(String[] args) {

        // using WedDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://frontend.nopcommerce.com/");

        System.out.println("Title of the web driver is : " +driver.getTitle());

        System.out.println("Current URL of the web driver is : " +driver.getCurrentUrl());

        System.out.println(driver.getPageSource());
    }
}
