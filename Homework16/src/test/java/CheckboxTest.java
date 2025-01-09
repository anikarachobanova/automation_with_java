import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import java.time.Duration;

public class CheckboxTest {

        private WebDriver driver;

        @BeforeMethod
        public void setUp()	{
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://pragmatic.bg/automation/lecture13/Config.html");
        }

        @Test
public void testCheckbox() {
            WebElement option1 = driver.findElement(By.name("airbags"));
            WebElement option2 = driver.findElement(By.name("parksensor"));
            Actions builder = new Actions(driver);
            builder.click(option1);
            builder.click(option2);
            builder.perform();

            assertTrue(option1.isSelected(),"Air Bags checkbox is selected");
            assertTrue(option2.isSelected(),"Parking Sensor checkbox is selected");
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }
}
