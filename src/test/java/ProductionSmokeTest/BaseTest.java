package ProductionSmokeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

abstract public class BaseTest {
    public ChromeDriver driver;
    public ChromeOptions chromeOptions;
    public Actions actions;
    public WebDriverWait wait;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("lang=en-GB");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);

        driver.get("https://mooseknucklescanada.com");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
    }
}
