package part_15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows4 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        // getWindowHandles()

        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();  // opens another window - child window

        Set<String> windowIDS = driver.getWindowHandles();   // returns ID's of multiple windows

        List<String> windowIDsList = new ArrayList<>(windowIDS); // converting Set --> List

        // for each loop
        for (String winid :windowIDsList){
            // System.out.println(winid);
            String title = driver.switchTo().window(winid).getTitle();
            System.out.println(title);
        }

        driver.close();  // close single browser window which pining
        driver.quit(); // close all the browser windows

    }
}
