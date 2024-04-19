package part_04_my;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register");

        //isDisplayed() Syntax:
        WebElement element1 = driver.findElement(By.xpath("your_xpath_here"));
        boolean isDisplayed = element1.isDisplayed();
        System.out.println("Element Displayed Status: " + isDisplayed);

        // isEnabled() Syntax:
        WebElement element2 = driver.findElement(By.xpath("your_xpath_here"));
        boolean isEnabled = element2.isEnabled();
        System.out.println("Element Enabled Status: " + isEnabled);

        // isSelected() Syntax:
        WebElement element3 = driver.findElement(By.xpath("your_xpath_here"));
        boolean isSelected = element3.isSelected();
        System.out.println("Element Selected Status: " + isSelected);
    }
}
