import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class updateUseCase {

    @BeforeMethod
    public void setUp() {
        System.out.println("This is before test");
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
    }


    @Test
    void useCase2() {
        System.out.println("This is update of test case");
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
        driver.findElement(By.linkText("1st test case")).click();

        //start reading from fields

        WebElement useCaseStep1 = driver.findElement(By.id("stepId"));
        WebElement useCaseStep2 = driver.findElement(By.name("testStepId-1"));
        WebElement useCaseStep3 = driver.findElement(By.name("testStepId-2"));
        WebElement useCaseStep4 = driver.findElement(By.name("testStepId-3"));

        //update first test step
        useCaseStep1.click();
        String updateUseCaseStep1 = useCaseStep1.getAttribute("value");
        int lengthOfStep1 = updateUseCaseStep1.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep1 + " characters");
        String updateStep1 = "this field previously had " + lengthOfStep1 + " characters";
        useCaseStep1.clear();
        useCaseStep1.sendKeys(updateStep1);

        //update second test step
        useCaseStep2.click();
        String updateUseCaseStep2 = useCaseStep1.getAttribute("value");
        int lengthOfStep2 = updateUseCaseStep1.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep2 + " characters");
        String updateStep2 = "this field previously had " + lengthOfStep2 + " characters";
        useCaseStep2.clear();
        useCaseStep2.sendKeys(updateStep2);

        //update second third step
        useCaseStep3.click();
        String updateUseCaseStep3 = useCaseStep1.getAttribute("value");
        int lengthOfStep3 = updateUseCaseStep1.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep3 + " characters");
        String updateStep3 = "this field previously had " + lengthOfStep3 + " characters";
        useCaseStep3.clear();
        useCaseStep3.sendKeys(updateStep3);

        //update second fourth step
        useCaseStep4.click();
        String updateUseCaseStep4 = useCaseStep1.getAttribute("value");
        int lengthOfStep4 = updateUseCaseStep1.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep4 + " characters");
        String updateStep4 = "this field previously had " + lengthOfStep4 + " characters";
        useCaseStep4.clear();
        useCaseStep4.sendKeys(updateStep4);

        WebElement saveUseCase = driver.findElement(By.cssSelector(".btn-primary"));
        saveUseCase.click();
    }

    @Test
    void updateSecondUseCase() {
        System.out.println("This is update of test case");
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
        driver.findElement(By.linkText("2nd test case")).click();

        //start reading from fields

        WebElement useCaseStep1 = driver.findElement(By.id("stepId"));
        WebElement useCaseStep2 = driver.findElement(By.name("testStepId-1"));
        WebElement useCaseStep3 = driver.findElement(By.name("testStepId-2"));
        WebElement useCaseStep4 = driver.findElement(By.name("testStepId-3"));

        //update first test step
        useCaseStep1.click();
        String updateUseCaseStep1 = useCaseStep1.getAttribute("value");
        int lengthOfStep1 = updateUseCaseStep1.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep1 + " characters");
        String updateStep1 = "this field previously had " + lengthOfStep1 + " characters";
        useCaseStep1.clear();
        useCaseStep1.sendKeys(updateStep1);

        //update second test step
        useCaseStep2.click();
        String updateUseCaseStep2 = useCaseStep1.getAttribute("value");
        int lengthOfStep2 = updateUseCaseStep1.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep2 + " characters");
        String updateStep2 = "this field previously had " + lengthOfStep2 + " characters";
        useCaseStep2.clear();
        useCaseStep2.sendKeys(updateStep2);

        //update second third step
        useCaseStep3.click();
        String updateUseCaseStep3 = useCaseStep1.getAttribute("value");
        int lengthOfStep3 = updateUseCaseStep1.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep3 + " characters");
        String updateStep3 = "this field previously had " + lengthOfStep3 + " characters";
        useCaseStep3.clear();
        useCaseStep3.sendKeys(updateStep3);

        //update second fourth step
        useCaseStep4.click();
        String updateUseCaseStep4 = useCaseStep1.getAttribute("value");
        int lengthOfStep4 = updateUseCaseStep1.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep4 + " characters");
        String updateStep4 = "this field previously had " + lengthOfStep4 + " characters";
        useCaseStep4.clear();
        useCaseStep4.sendKeys(updateStep4);

        WebElement saveUseCase = driver.findElement(By.cssSelector(".btn-primary"));
        saveUseCase.click();
    }

    @Test
    void updateThirdUseCase() {
        System.out.println("This is update of test case");
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
        driver.findElement(By.linkText("3th test case")).click();

        //start reading from fields

        WebElement useCaseStep1 = driver.findElement(By.id("stepId"));
        WebElement useCaseStep2 = driver.findElement(By.name("testStepId-1"));
        WebElement useCaseStep3 = driver.findElement(By.name("testStepId-2"));
        WebElement useCaseStep4 = driver.findElement(By.name("testStepId-3"));

        //update first test step
        useCaseStep1.click();
        String updateUseCaseStep1 = useCaseStep1.getAttribute("value");
        int lengthOfStep1 = updateUseCaseStep1.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep1 + " characters");
        String updateStep1 = "this field previously had " + lengthOfStep1 + " characters";
        useCaseStep1.clear();
        useCaseStep1.sendKeys(updateStep1);

        //update second test step
        useCaseStep2.click();
        String updateUseCaseStep2 = useCaseStep1.getAttribute("value");
        int lengthOfStep2 = updateUseCaseStep1.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep2 + " characters");
        String updateStep2 = "this field previously had " + lengthOfStep2 + " characters";
        useCaseStep2.clear();
        useCaseStep2.sendKeys(updateStep2);

        //update second third step
        useCaseStep3.click();
        String updateUseCaseStep3 = useCaseStep1.getAttribute("value");
        int lengthOfStep3 = updateUseCaseStep1.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep3 + " characters");
        String updateStep3 = "this field previously had " + lengthOfStep3 + " characters";
        useCaseStep3.clear();
        useCaseStep3.sendKeys(updateStep3);

        //update second fourth step
        useCaseStep4.click();
        String updateUseCaseStep4 = useCaseStep1.getAttribute("value");
        int lengthOfStep4 = updateUseCaseStep1.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep4 + " characters");
        String updateStep4 = "this field previously had " + lengthOfStep4 + " characters";
        useCaseStep4.clear();
        useCaseStep4.sendKeys(updateStep4);

        WebElement saveUseCase = driver.findElement(By.cssSelector(".btn-primary"));
        saveUseCase.click();
    }

    @Test
    void updateFourthUseCase() {
        System.out.println("This is update of test case");
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
        driver.findElement(By.linkText("4th test case")).click();

        //start reading from fields

        WebElement useCaseStep1 = driver.findElement(By.id("stepId"));
        WebElement useCaseStep2 = driver.findElement(By.name("testStepId-1"));
        WebElement useCaseStep3 = driver.findElement(By.name("testStepId-2"));
        WebElement useCaseStep4 = driver.findElement(By.name("testStepId-3"));

        //update first test step
        useCaseStep1.click();
        String updateUseCaseStep1 = useCaseStep1.getAttribute("value");
        int lengthOfStep1 = updateUseCaseStep1.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep1 + " characters");
        String updateStep1 = "this field previously had " + lengthOfStep1 + " characters";
        useCaseStep1.clear();
        useCaseStep1.sendKeys(updateStep1);

        //update second test step
        useCaseStep2.click();
        String updateUseCaseStep2 = useCaseStep1.getAttribute("value");
        int lengthOfStep2 = updateUseCaseStep1.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep2 + " characters");
        String updateStep2 = "this field previously had " + lengthOfStep2 + " characters";
        useCaseStep2.clear();
        useCaseStep2.sendKeys(updateStep2);

        //update second third step
        useCaseStep3.click();
        String updateUseCaseStep3 = useCaseStep1.getAttribute("value");
        int lengthOfStep3 = updateUseCaseStep1.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep3 + " characters");
        String updateStep3 = "this field previously had " + lengthOfStep3 + " characters";
        useCaseStep3.clear();
        useCaseStep3.sendKeys(updateStep3);

        //update second fourth step
        useCaseStep4.click();
        String updateUseCaseStep4 = useCaseStep1.getAttribute("value");
        int lengthOfStep4 = updateUseCaseStep1.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep4 + " characters");
        String updateStep4 = "this field previously had " + lengthOfStep4 + " characters";
        useCaseStep4.clear();
        useCaseStep4.sendKeys(updateStep4);

        WebElement saveUseCase = driver.findElement(By.cssSelector(".btn-primary"));
        saveUseCase.click();
    }

}
