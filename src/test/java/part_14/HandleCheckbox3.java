package part_14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckbox3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://itera-qa-azurewebsites.net/home/automation");

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checknox' and contains(@id,'day']"));
        System.out.println("Total No of checkboxes : " +checkboxes.size());

        // 3. Select multiple check boxes by choice
        // want to select Monday and Sunday

        for(WebElement chbox:checkboxes){
            String checkboxname= chbox.getAttribute("id");
            if (checkboxname.equals("monday") || checkboxname.equals("sunday")){
                chbox.click();
            }
        }
        

    }
}
