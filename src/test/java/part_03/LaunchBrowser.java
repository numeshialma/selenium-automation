package part_03;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) {

        // chrome browser
        System.setProperty("webdriver.chrome.driver","C:\\Path\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();


    }
}
