import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get ("https://auto.pragmatic.bg/manage/");
    }

    @Test
    public void SuccessfulLogin(){
        WebElement usernameInputField = driver.findElement(By.id("input-username"));
        usernameInputField.sendKeys("admin");
        WebElement passwordInputField = driver.findElement(By.id("input-password"));
        passwordInputField.sendKeys("parola123!");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        WebElement dashboardHeader = driver.findElement(By.xpath("//h1[text()='Dashboard']"));
        Assert.assertTrue(dashboardHeader.isDisplayed(), "Dashboard header is not displayed!");
        //String currentURL = driver.getCurrentUrl();
        //Assert.assertTrue(currentURL.contains("https://auto.pragmatic.bg/manage/index.php?route=common/dashboard"), "The URL does not contain '/dashboard'!");
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
