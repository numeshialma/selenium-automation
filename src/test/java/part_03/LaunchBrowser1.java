package part_03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser1 {

    public static void main(String[] args) {

        // chrome browser
        System.setProperty("webdriver.chrome.driver","C:\\Path\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        
    }
}
