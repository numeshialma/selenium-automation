package part_15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandleBrowserWindows1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        // getWindowHandles()

        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();  // opens another window - child window

        Set<String> windowIDS = driver.getWindowHandles();   // returns ID's of multiple windows

        // First method - iterator()
        Iterator<String> it = windowIDS.iterator();

        String  parentId = it.next();
        String  childId = it.next();

        System.out.println("Parent window Id" +parentId);
        System.out.println("Child window Id" +childId);



    }
}
