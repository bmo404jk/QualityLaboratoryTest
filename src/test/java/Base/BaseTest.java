package Base;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public abstract class BaseTest
{
    protected static WebDriver driver = new ChromeDriver();
    @BeforeAll
    public static void driverConfiguration()
    {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        BasePage.setDriver(driver);
    }
    @AfterAll
    public static void driverClose()
    {
        driver.close();
        driver.quit();
    }
}
