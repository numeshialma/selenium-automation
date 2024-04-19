package part_15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindows2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        // getWindowHandles()

        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();  // opens another window - child window

        Set<String> windowIDS = driver.getWindowHandles();   // returns ID's of multiple windows

        // Second method - using List/ArrayList

        List<String> windowIDsList = new ArrayList<>(windowIDS); // converting Set --> List

        String parentWindowID = windowIDsList.get(0);  // Parent window id
        String childWindowID = windowIDsList.get(1);   // child window id

        System.out.println("Parent window Id" +parentWindowID);
        System.out.println("Child window Id" +childWindowID);





    }
}
