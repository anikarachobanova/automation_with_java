import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AjaxWaitTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://pragmatic.bg/automation/ajax-waits/ajax.html");
    }

    @Test
    public void testWaitForText() {
        WebElement firstStepButton = driver.findElement(By.cssSelector("#demo > button"));
        firstStepButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement firstStepText = wait.until(new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver firstStepText) {
                return firstStepText.findElement(By.id("hello-message"));
            }
        });

        Assert.assertEquals(firstStepText.getText(), "Hello Pragmatic Student, please assert this text.", "Text after first step is incorrect");

        // Step 4: Click the "Click the button please!" button
        WebElement secondButton = driver.findElement(By.xpath("//*[@id=\"container\"]/button"));
        secondButton.click();

        // Step 5: Wait for the final text and assert it
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement finalText = wait2.until(new ExpectedCondition<WebElement>() {
            @Override
            public WebElement apply(WebDriver finalText) {
                return finalText.findElement(By.xpath("//div[@id='anotherDoc']//p[1]"));
            }
        });

        Assert.assertEquals(finalText.getText(), "You did a good job!", "Final text is incorrect");


        //Another way with lambda function
        //WebElement firstStepText = waitForElementWithText(By.id("hello-message"), "Hello Pragmatic Student, please assert this text.");
        //WebElement finalText = waitForElementWithText(By.cssSelector("#anotherDoc > div > p"), "You did a good job!");
        //Assert.assertEquals(firstStepText.getText(), "Hello Pragmatic Student, please assert this text.", "Text after first step is incorrect");
        //Assert.assertEquals(finalText.getText(), "You did a good job!", "Final text is incorrect");
        

        //private WebElement waitForElementWithText(By locator, String text) {
        //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //  return wait.until((WebDriver driver) -> {
        //  WebElement element = driver.findElement(locator);
        //  if (element.isDisplayed() && element.getText().contains(text)) {
        //      return element;
        //  }
        //   return null;
        //});
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
