package part_17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopUp {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

       // driver.get("http://the-internet.herokuapp.com/basic_auth");

        // Syntax
        /*
        http://admin:admin@the-internet.herokuapp.com/basic_auth
        http://username:password@URL
         */

        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

    }
}
