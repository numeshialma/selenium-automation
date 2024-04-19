package part_07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextVsgetAttributeValue2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://admin-demo.nopcommerce.com/login");

        WebElement emailInputBox = driver.findElement(By.id("Email"));

        // capturing text from input box

        System.out.println("Result from getAttribute() method : "+emailInputBox.getAttribute("value"));
        System.out.println("Result from getText() method : "+emailInputBox.getText());
        /* output : Result from getAttribute() method : admin@yourstore.com
                    Result from getText() method :
         */

        // Login button

        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));

        System.out.println(button.getAttribute("type"));
        System.out.println(button.getAttribute("class"));

        System.out.println(button.getText());

        /* output : submit
                    button-1 login-button
                    LOG IN
         */

        String title = driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        System.out.println(title);

        /* output : Admin area demo
         */

    }
}
