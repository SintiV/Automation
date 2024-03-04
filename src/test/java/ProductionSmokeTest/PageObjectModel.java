package ProductionSmokeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

abstract public class PageObjectModel {
    public WebDriver driver;
    public Actions actions;
    public WebDriverWait wait;

    public PageObjectModel(WebDriver driver, Actions actions, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.actions = actions;

        PageFactory.initElements(driver, this);
    }
}
