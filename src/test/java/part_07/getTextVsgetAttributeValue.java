package part_07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextVsgetAttributeValue {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://admin-demo.nopcommerce.com/login");

        WebElement emailInputBox = driver.findElement(By.id("Email"));
        emailInputBox.clear();
        emailInputBox.sendKeys("admin123@gmail.com");
    }
}
