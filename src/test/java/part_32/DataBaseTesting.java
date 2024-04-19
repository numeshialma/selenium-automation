package part_32;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*;
import java.time.Duration;

public class DataBaseTesting {
    public static void main(String[] args) throws SQLException {

        // Data
        String cust_firstName = "John";
        String cust_lastName = "Kenedy";
        String cust_email = "John@gmail.com";
        String cust_telPhone = "1234567890";
        String cust_password = "John123";

        // User registration
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://localhost/opencart/upload");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();

        driver.findElement(By.name("firstname")).sendKeys(cust_firstName);
        driver.findElement(By.name("lastname")).sendKeys(cust_lastName);
        driver.findElement(By.name("email")).sendKeys(cust_email);
        driver.findElement(By.name("telephone")).sendKeys(cust_telPhone);
        driver.findElement(By.name("password")).sendKeys(cust_password);
        driver.findElement(By.name("confirm")).sendKeys(cust_password);
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//input[@value='Continue")).click();

        String confmsg = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!")).getText();

        try{
            if(confmsg.equals("Your Account Has Been Created!")){
                System.out.println("Registration successful from UI/Application");
            }else{
                System.out.println("Registration not successful");
            }
        }catch (Exception e){
            System.out.println("Some problem in the application");
        }

        // DataBase validation
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/openshop","root","password");  // url username password

        Statement stmt = con.createStatement();

        String query = "select firstname,lastname,email,telephone from oc-customer";

        ResultSet rs = stmt.executeQuery(query);

        boolean status = false;
        while(rs.next()){
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            String email = rs.getString("email");
            String telephone = rs.getString("telephone");


            if(cust_firstName.equals(firstname) && cust_lastName.equals(lastname)
                && cust_email.equals(email) && cust_telPhone.equals(telephone)){
                System.out.println(" Record found in the table || Test Passed");
                status=true;
                break;
            }
        }
        if(status==false){
            System.out.println(" Record not found || Test Failed");
        }

    }
}
