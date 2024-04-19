package part_08.task_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleMultipleDropDowns1 {

    static  WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");

        // Approach 2

        WebElement noOfEmpEle = driver.findElement(By.name("NoOfEmployees"));
        selectOptionFromDropDown(noOfEmpEle,"16 - 20");

        WebElement industryEle = driver.findElement(By.name("Industry"));
        selectOptionFromDropDown(industryEle,"Healthcare");

        WebElement countryEle = driver.findElement(By.name("Country"));
        selectOptionFromDropDown(countryEle,"Ghana");
        
    }

    public static void selectOptionFromDropDown(WebElement ele, String value){
        Select drp = new Select(ele);

        List<WebElement> allOptions = drp.getOptions();
        for(WebElement option :allOptions){
            if(option.getText().equals(value)){
                option.click();
                break;
            }
        }

    }
}
