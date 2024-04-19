package part_08.task_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropDown1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.opencart.com/index.php?route=account/register");

        WebElement dropCountryEle = driver.findElement(By.id("input-country"));

        Select dropCountry = new Select(dropCountryEle);

        // Selecting option from dropdown without using methods
        List<WebElement> allOptions = dropCountry.getOptions();
        for(WebElement option :allOptions){
            if(option.getText().equals("Cuba")){
                option.click();
                break;
            }
        }

    }
}
