package part_08.task_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropDowns {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");

        // Approach 1

        Select noOfEmDrop = new Select(driver.findElement(By.name("NoOfEmployees")));
        noOfEmDrop.selectByVisibleText("16 - 20");

        Select industryDrop = new Select(driver.findElement(By.name("Industry")));
        industryDrop.selectByVisibleText("Travel");

        Select countryDrop = new Select(driver.findElement(By.name("Country")));
        countryDrop.selectByVisibleText("Aruba");
        
    }
}
