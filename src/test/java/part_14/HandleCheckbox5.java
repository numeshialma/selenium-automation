package part_14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckbox5 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://itera-qa-azurewebsites.net/home/automation");

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checknox' and contains(@id,'day']"));
        System.out.println("Total No of checkboxes : " +checkboxes.size());

        // 5. Select first N check boxes

        int totalcheckboxes = checkboxes.size();

        for(int i=0; i<totalcheckboxes; i++){
            if(i<2)
            checkboxes.get(i).click();
        }

    }
}
