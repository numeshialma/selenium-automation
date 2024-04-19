package part_15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        // getWindowHandle()

        String windowID = driver.getWindowHandle();
        System.out.println(windowID);
        // return ID of the single browser window

        // output : F6C7AA8F823EA3FEE13730C2582FE34F
        // output : 25C2080EF94537B0F08F8455591695AD

    }
}
