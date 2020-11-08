import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class login {

    @BeforeMethod
    public void beforeTest() {
        System.out.println("This is before test");
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
    }


    @AfterMethod
    public void afterTest(){
        System.out.println("This is after test");
        WebDriver driver = new FirefoxDriver();
        driver.close();
    }

    @Test
    void test(){
        System.out.println("This is test case");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa-sandbox.apps.htec.rs/");
        driver.findElement(By.linkText("Login")).click();
        driver.close();
    }
}
