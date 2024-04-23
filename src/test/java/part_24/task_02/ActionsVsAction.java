package part_24.task_02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https:/automationpractice.com/index.php");
        driver.manage().window().maximize();

        WebElement features = driver.findElement(By.xpath("//a[@title='Women']"));

        // mouse over action
        Actions act = new Actions(driver);
        act.moveToElement(features).perform();
    }
}
