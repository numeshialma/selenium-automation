package part_17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Alert window with input box, capture text from alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(3000);

        Alert alertWindow = driver.switchTo().alert();
        System.out.println("The message displayed on alert : "+alertWindow.getText());

        alertWindow.sendKeys("Welcome");

        alertWindow.accept();





    }
}
