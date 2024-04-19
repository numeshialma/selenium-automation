package part_14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckbox2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://itera-qa-azurewebsites.net/home/automation");

        // 2. Select all the checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checknox' and contains(@id,'day']"));
        System.out.println("Total No of checkboxes : " +checkboxes.size());

        // Using for.. each loop
        for (WebElement cchbox: checkboxes) {
            cchbox.click();
        }

    }
}
