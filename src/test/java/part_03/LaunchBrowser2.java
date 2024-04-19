package part_03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser2 {

    public static void main(String[] args) {
/*
        // chrome browser
        System.setProperty("webdriver.chrome.driver","C:\\Path\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://frontend.nopcommerce.com/");

 */

        // firefox browser
        System.setProperty("webdriver.gecko.driver","C:\\Path\\geckodriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://frontend.nopcommerce.com/");
    }
}
