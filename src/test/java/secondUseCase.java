import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class secondUseCase {

    @BeforeMethod
    public void setUp() {
        System.out.println("This is before test");
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
    }


    @Test
    void useCase3() {
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

        driver.findElement(By.cssSelector(".pt-1:nth-child(2)")).click();

        //Elements for use case
        WebElement title = driver.findElement(By.name("title"));
        title.sendKeys("2nd test case");
        WebElement description = driver.findElement(By.name("description"));
        description.sendKeys("2nd test case description");
        WebElement expectedResult = driver.findElement(By.name("expected_result"));
        expectedResult.sendKeys("Expected result");
        WebElement addStep = driver.findElement(By.cssSelector(".text-primary:nth-child(2)"));
        //creates test steps
        for (int i = 0; i <= 5; i++) {
            addStep.click();
            //driver.findElement(By.cssSelector(".text-primary:nth-child(2)")).click();
        }


        String firstStep = "this is a first step";
        //char counter
        int lengthOfStep1 = firstStep.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep1 + " characters");
        String updateStep1 = "this field previously had " + lengthOfStep1 + " characters";
        System.out.println(updateStep1);

        String secondStep = "this is a second step";
        //char counter
        int lengthOfStep2 = secondStep.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep2 + " characters");
        String updateStep2 = "this field previously had " + lengthOfStep2 + " characters";
        System.out.println(updateStep2);


        String thirdStep = "this is a third step";
        //char counter
        int lengthOfStep3 = secondStep.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep3 + " characters");
        String updateStep3 = "this field previously had " + lengthOfStep3 + " characters";
        System.out.println(updateStep3);

        String fourthStep = "this is a fourth step";
        //char counter
        int lengthOfStep4 = secondStep.replace(" ", "").length();
        System.out.println("this field previously had " + lengthOfStep4 + " characters");
        String updateStep4 = "this field previously had " + lengthOfStep4 + " characters";
        System.out.println(updateStep4);


        WebElement useCaseStep1 = driver.findElement(By.id("stepId"));
        useCaseStep1.sendKeys(firstStep);
        WebElement useCaseStep2 = driver.findElement(By.name("testStepId-1"));
        useCaseStep2.sendKeys(secondStep);
        WebElement useCaseStep3 = driver.findElement(By.name("testStepId-2"));
        useCaseStep3.sendKeys(thirdStep);
        WebElement useCaseStep4 = driver.findElement(By.name("testStepId-3"));
        useCaseStep4.sendKeys(fourthStep);

        WebElement saveUseCase = driver.findElement(By.cssSelector(".btn-primary"));
        saveUseCase.click();
    }

}
