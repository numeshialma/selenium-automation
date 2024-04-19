package part_11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckDropDownSorted {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.twoplugs.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Live Posting']")).click();   // Live Posting

        WebElement drpElement = driver.findElement(By.name("category_id"));
        Select drpSelect = new Select(drpElement);

        List<WebElement> options = drpSelect.getOptions();

        ArrayList originalList = new ArrayList<>();
        ArrayList tempList = new ArrayList<>();

        for(WebElement option : options){
            originalList.add(option.getText());
            tempList.add(option.getText());
        }

        System.out.println("Original list : " +originalList);
        System.out.println("Temp list : " +tempList);

        Collections.sort(tempList);  // sorting

        System.out.println("Original list after sorting : " +originalList);
        System.out.println("Temp list after sorting : " +tempList);

        if(originalList.equals(tempList)){
            System.out.println("Dropdown sorted .. ");
        }
        else{
            System.out.println("Dropdown unsorted ..");
        }

        driver.close();

    }
}
