package ProductionSmokeTest.PageObject;

import ProductionSmokeTest.PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocaleSwitcherOnSiteLaunch extends PageObjectModel {

    public LocaleSwitcherOnSiteLaunch(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }

    @FindBy(xpath = "//div[@role='presentation']//li[1]")
    public WebElement LaunchCA_EN;

    @FindBy(xpath = "//div[@role='presentation']//li[2]")
    public WebElement LaunchCA_FR;

    @FindBy(xpath = "//div[@role='presentation']//li[3]")
    public WebElement LaunchUSA;

    @FindBy(xpath = "//div[@role='presentation']//li[4]")
    public WebElement LaunchUK;

    @FindBy(xpath = "//div[@role='presentation']//li[5]")
    public WebElement LaunchEU_DE;

    @FindBy(xpath = "//div[@role='presentation']//li[6]")
    public WebElement LaunchEU_EN;

    @FindBy(xpath = "//div[@role='presentation']//li[7]")
    public WebElement LaunchEU_FR;
}
