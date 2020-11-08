import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class base {

    @BeforeMethod
    public void setUp() {
        System.out.println("This is before test");
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
    }


    @Test
    void isAlive() {
        System.out.println("This is test case");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa-sandbox.apps.htec.rs/");
        System.out.println("Web application is alive");
    }

    @Test(dependsOnMethods = "isAlive")
    void loginWithRightCredentials() {
        System.out.println("This is test case");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa-sandbox.apps.htec.rs/");
        driver.findElement(By.linkText("Login")).click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        if (url == "https://qa-sandbox.apps.htec.rs/"){
            System.out.println("Login page is not found!");
            driver.close();
        }else{
            WebElement email = driver.findElement(By.name("email"));
            WebElement password = driver.findElement(By.name("password"));
            email.sendKeys("nikodinovicf@gmail.com");
            password.sendKeys("ExecomHTec");
            driver.findElement(By.cssSelector(".btn")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
    }

    @Test(dependsOnMethods = "loginWithRightCredentials")
    public void useCase(){
        System.out.println("This is test case");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa-sandbox.apps.htec.rs/login");
        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("password"));
        email.sendKeys("nikodinovicf@gmail.com");
        password.sendKeys("ExecomHTec");
        driver.findElement(By.cssSelector(".btn")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navigate on use cases and create new use case
        driver.findElement(By.cssSelector(".col-sm-3:nth-child(2) .card-title")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".mb-4")).click();

        //Elements for use case
        WebElement title = driver.findElement(By.name("title"));
        title.sendKeys("1st test case");
        WebElement description = driver.findElement(By.name("description"));
        description.sendKeys("1st test case description");
        WebElement expectedResult = driver.findElement(By.name("expected_result"));
        expectedResult.sendKeys("first expected result");
        WebElement useCaseStep = driver.findElement(By.id("stepId"));
        WebElement addStep = driver.findElement(By.cssSelector(".text-primary:nth-child(2)"));
        //creates test steps
        for (int i = 0; i <= 10; i++){
            driver.findElement(By.cssSelector(".text-primary:nth-child(2)")).click();
        }
    }




    @Test(dependsOnMethods = "isAlive")
    void loginWithWrongCredentials() {
        System.out.println("This is test case");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qa-sandbox.apps.htec.rs/");
        driver.findElement(By.linkText("Login")).click();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        if (url == "https://qa-sandbox.apps.htec.rs/"){
            System.out.println("Login page is not found!");
            driver.close();
        }else{
            WebElement email = driver.findElement(By.name("email"));
            WebElement password = driver.findElement(By.name("password"));
            email.sendKeys("test@test.com");
            password.sendKeys("test123");
            driver.findElement(By.cssSelector(".btn")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
    }
}
