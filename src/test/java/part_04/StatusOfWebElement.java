package part_04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebElement {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register");

        WebElement searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));

        System.out.println("Display status : " +searchStore.isDisplayed());  // Display status : true
        System.out.println("Enabled status : " +searchStore.isEnabled());  // Enabled status : true

        WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));

        System.out.println(male.isSelected()); // False
        System.out.println(female.isSelected()); // False

        male.click();  // selects male radio button

        System.out.println(male.isSelected()); // True
        System.out.println(female.isSelected()); // False

        female.click();// selects female radio button

        System.out.println(male.isSelected()); // False
        System.out.println(female.isSelected()); // True

    }
}
