import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class DropDownTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://auto.pragmatic.bg/manage/");

    }
    @Test
    public void ordersSubMenu(){
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
        WebElement salesCollapseButton = driver.findElement(By.cssSelector("#menu-sale > a"));  //Find collapse menu and click on it
        salesCollapseButton.click();
        WebElement ordersSubMenu = driver.findElement(By.xpath("//*[@id=\"collapse-4\"]/li[1]/a")); //Find sub menu 'Orders'
        ordersSubMenu.click();
        WebElement orderStatus = driver.findElement(By.name("filter_order_status_id"));
        Select dropDown = new Select(orderStatus);
        assertFalse(dropDown.isMultiple()); //Verify Dropdown does not support multiple selection
        List<WebElement> allOptions = dropDown.getOptions();
        assertEquals(allOptions.size(), 16); //Get drop-down options
        List<String> expectedOptions = Arrays.asList("","Missing Orders","Canceled","Canceled Reversal","Chargeback","Complete","Denied","Expired","Failed","Pending","Processed","Processing","Refunded","Reversed","Shipped","Voided");
        List<String> actualOptions = new ArrayList<>();
        for(WebElement option : allOptions) {
            actualOptions.add(option.getText());
        }
        assertEquals(actualOptions.toArray(), expectedOptions.toArray());
        assertEquals(actualOptions, expectedOptions);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }



    }


