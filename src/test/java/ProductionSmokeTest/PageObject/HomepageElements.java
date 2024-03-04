package ProductionSmokeTest.PageObject;

import ProductionSmokeTest.PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomepageElements extends PageObjectModel {
    public HomepageElements(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }

    @FindBy(xpath = "(//button)[1]")
    public WebElement headerLocaleSwitchButton;

    @FindBy(id = "ltkpopup-container")
    public WebElement ltkPopup;

    @FindBy(id = "ltkpopup-close-button")
    public WebElement ltkPopupCloseButton;
}
