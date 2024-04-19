package part_07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextVsgetAttributeValue1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://admin-demo.nopcommerce.com/login");

        WebElement emailInputBox = driver.findElement(By.id("Email"));

        // capturing text from input box

        System.out.println("Result from getAttribute() method : "+emailInputBox.getAttribute("value"));
        // output : Result from getAttribute() method : admin@yourstore.com
    }
}
