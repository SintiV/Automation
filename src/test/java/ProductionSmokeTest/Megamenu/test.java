package ProductionSmokeTest.Megamenu;

import ProductionSmokeTest.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class test extends BaseTest {

    @Test
    public void testTest() {
        //driver.get(siteLaunch.MKSite);

//        WebElement[] locales = {
//                localeSwitcherOnSiteLaunch.LaunchCA_EN,
//                localeSwitcherOnSiteLaunch.LaunchCA_FR,
//                localeSwitcherOnSiteLaunch.LaunchUSA,
//                localeSwitcherOnSiteLaunch.LaunchUK,
//                localeSwitcherOnSiteLaunch.LaunchEU_DE,
//                localeSwitcherOnSiteLaunch.LaunchEU_EN,
//                localeSwitcherOnSiteLaunch.LaunchEU_FR
//        };
//
//        for (WebElement locale : locales) {
//            wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='language-selector-modal']")));
//            locale.click();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//            try {
//                wait.until(ExpectedConditions.visibilityOf(homepageElements.ltkPopup));
//                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//                homepageElements.ltkPopupCloseButton.click();
//                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//            } catch (TimeoutException ignored) {}
//
//            wait.until(ExpectedConditions.visibilityOf(homepageElements.headerLocaleSwitchButton));
//            homepageElements.headerLocaleSwitchButton.click();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        }
    }
}
