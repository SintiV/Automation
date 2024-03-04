package ProductionSmokeTest.Megamenu;

import ProductionSmokeTest.BaseTest;
import ProductionSmokeTest.PageObject.LocaleSwitcherOnSiteLaunch;
import ProductionSmokeTest.PageObject.MegamenuCategories;
import io.qameta.allure.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static io.qameta.allure.Allure.step;

public class Megamenu extends BaseTest {
    LocaleSwitcherOnSiteLaunch localeSwitcherOnSiteLaunch;
    MegamenuCategories megamenuCategories;

    @Test(testName = "Test megamenu")
    @Epic("Production smoke test")
    @Feature("Megamenu")
    @Story("Megamenu")
    @Description("test")
    public void MegamenuCA_ENTest() {
        localeSwitcherOnSiteLaunch = new LocaleSwitcherOnSiteLaunch(driver, actions, wait);
        megamenuCategories = new MegamenuCategories(driver, actions, wait);

        step("Launch locale", stepContext -> {
            localeSwitcherOnSiteLaunch.LaunchCA_EN.click();
        });

        step("Open \"New\" category and check URL", stepContext -> {
            megamenuCategories.openCategoryNew();
        });
//
//        step("Open \"Lunar New Year\" child category of the \"New\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryNew_LunarNY();
//        });
//
//        step("Open \"Pleasures\" child category of the \"New\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryNew_Pleasures();
//        });
//
        step("Open \"New Arrivals\" child category of the \"New\" main category and check URL", stepContext -> {
            megamenuCategories.openCategoryNew_NewArrivals();
        });
//
//        step("Open \"Women\" category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomenENG();
//        });
//
//        step("Open \"New Arrivals\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomenENG_NewArrivals();
//        });
//
//        step("Open \"New Arrivals - Sale\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_NewArrivals_Sale();
//        });
//
//        step("Open \"New Arrivals - Cloud\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_NewArrivals_Cloud();
//        });

//        step("Open \"New Arrivals - Sherpa and Fleece\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomenNonENG_NewArrivals_SherpaAndFleece();
//        });

//        step("Open \"New Arrivals - Lightweight Down\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_NewArrivals_LightweightDown();
//        });
//
//        step("Open \"New Arrivals - Bunny\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_NewArrivals_Bunny();
//        });
//
//        step("Open \"New Arrivals - Puffers\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_NewArrivals_Puffers();
//        });
//
//        step("Open \"New Arrivals - Shop All\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_NewArrivals_ShopAll();
//        });
//
//        step("Open \"Icons\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Icons();
//        });
//
//        step("Open \"Icons - Originals\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Icons_Originals();
//        });
//
//        step("Open \"Icons - Cloud\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Icons_Cloud();
//        });
//
//        step("Open \"Icons - Gold Series\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Icons_GoldSeries();
//        });
//
//        step("Open \"Icons - Onyx Series\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Icons_OnyxSeries();
//        });
//
//        step("Open \"Icons - Shop All\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Icons_ShopAll();
//        });
//
//        step("Open \"Outerwear\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Outerwear();
//        });
//
//        step("Open \"Outerwear - Bunny\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Outerwear_Bunny();
//        });
//
//        step("Open \"Outerwear - Lightweight Jackets\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Outerwear_LightweightJackets();
//        });
//
//        step("Open \"Outerwear - Coats and Jackets\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Outerwear_CoatsAndJackets();
//        });
//
//        step("Open \"Outerwear - Puffers\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Outerwear_Puffers();
//        });
//
//        step("Open \"Outerwear - Bomber Jackets\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Outerwear_BomberJackets();
//        });
//
//        step("Open \"Outerwear - Parkas\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Outerwear_Parkas();
//        });
//
//        step("Open \"Outerwear - Vests\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Outerwear_Vests();
//        });
//
//        step("Open \"Outerwear - Shop All\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Outerwear_ShopAll();
//        });
//
//        step("Open \"Clothing\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Clothing();
//        });
//
//        step("Open \"Clothing - Sherpa and Fleece\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Clothing_SherpaAndFleece();
//        });
//
//        step("Open \"Clothing - Sweatshirts and Hoodies\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Clothing_SweatshirtsAndHoodies();
//        });
//
//        step("Open \"Clothing - Pants and Shorts\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Clothing_PantsAndShorts();
//        });
//
//        step("Open \"Clothing - Shop All\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Clothing_ShopAll();
//        });
//
//        step("Open \"Accesories\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Accessories();
//        });
//
//        step("Open \"Accesories - Beanies and Hats\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Accessories_BeaniesAndHats();
//        });
//
//        step("Open \"Accesories - Winter Accesories\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Accessories_WinterAccessories();
//        });
//
//        step("Open \"Accesories - Pet\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Accessories_Pet();
//        });
//
//        step("Open \"Accesories - Socks, Belts and Bags\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Accessories_SocksBeltsAndBags();
//        });
//
//        step("Open \"Accesories - Shop All\" child category of the \"Women\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryWomen_Accessories_ShopAll();
//        });
//
//        step("Open \"Men\" category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen();
//        });
//
//        step("Open \"New Arrivals\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_NewArrivals();
//        });
//
//        step("Open \"New Arrivals - Sale\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_NewArrivals_Sale();
//        });
//
//        step("Open \"New Arrivals - Cloud\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_NewArrivals_Cloud();
//        });
//
//        step("Open \"New Arrivals - Sherpa and Fleece\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_NewArrivals_SherpaAndFleece();
//        });
//
//        step("Open \"New Arrivals - Lightweight Down\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_NewArrivals_LightweightDown();
//        });
//
//        step("Open \"New Arrivals - Bunny\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_NewArrivals_Bunny();
//        });
//
//        step("Open \"New Arrivals - Puffers\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_NewArrivals_Puffers();
//        });
//
//        step("Open \"New Arrivals - Shop All\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_NewArrivals_ShopAll();
//        });
//
//        step("Open \"Icons\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Icons();
//        });
//
//        step("Open \"Icons - Originals\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Icons_Originals();
//        });
//
//        step("Open \"Icons - Cloud\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Icons_Cloud();
//        });
//
//        step("Open \"Icons - Gold Series\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Icons_GoldSeries();
//        });
//
//        step("Open \"Icons - Onyx Series\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Icons_OnyxSeries();
//        });
//
//        step("Open \"Icons - Shop All\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Icons_ShopAll();
//        });
//
//        step("Open \"Outerwear\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Outerwear();
//        });
//
//        step("Open \"Outerwear - Bunny\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Outerwear_Bunny();
//        });
//
//        step("Open \"Outerwear - Lightweight Jackets\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Outerwear_LightweightJackets();
//        });
//
//        step("Open \"Outerwear - Coats and Jackets\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Outerwear_CoatsAndJackets();
//        });
//
//        step("Open \"Outerwear - Puffers\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Outerwear_Puffers();
//        });
//
//        step("Open \"Outerwear - Bomber Jackets\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Outerwear_BomberJackets();
//        });
//
//        step("Open \"Outerwear - Parkas\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Outerwear_Parkas();
//        });
//
//        step("Open \"Outerwear - Vests\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Outerwear_Vests();
//        });
//
//        step("Open \"Outerwear - Shop All\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Outerwear_ShopAll();
//        });
//
//        step("Open \"Clothing\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Clothing();
//        });
//
//        step("Open \"Clothing - Sherpa and Fleece\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Clothing_SherpaAndFleece();
//        });
//
//        step("Open \"Clothing - Polos and Tees\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Clothing_PolosAndTees();
//        });
//
//        step("Open \"Clothing - Sweatshirts and Hoodies\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Clothing_SweatshirtsAndHoodies();
//        });
//
//        step("Open \"Clothing - Pants and Shorts\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Clothing_PantsAndShorts();
//        });
//
//        step("Open \"Clothing - Shop All\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Clothing_ShopAll();
//        });
//
//        step("Open \"Accesories\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Accessories();
//        });
//
//        step("Open \"Accesories - Beanies and Hats\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Accessories_BeaniesAndHats();
//        });
//
//        step("Open \"Accesories - Winter Accessories\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Accessories_WinterAccessories();
//        });
//
//        step("Open \"Accesories - Pet\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Accessories_Pet();
//        });
//
//        step("Open \"Accesories - Socks, Belts and Bags\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Accessories_SocksBeltsAndBags();
//        });
//
//        step("Open \"Accesories - Shop All\" child category of the \"Men\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryMen_Accessories_ShopAll();
//        });
//
//        step("Open \"Kids\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryKids();
//        });
//
//        step("Open \"New Arrivals\" child category of the \"Kids\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryKids_NewArrivals();
//        });
//
//        step("Open \"New Arrivals - Sale\" child category of the \"Kids\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryKids_NewArrivals_Sale();
//        });
//
//        step("Open \"New Arrivals - Originals\" child category of the \"Kids\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryKids_NewArrivals_Originals();
//        });
//
//        step("Open \"New Arrivals - Gold\" child category of the \"Kids\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryKids_NewArrivals_Gold();
//        });
//
//        step("Open \"New Arrivals - Lightweights\" child category of the \"Kids\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryKids_NewArrivals_Lightweights();
//        });
//
//        step("Open \"New Arrivals - Clothing and Accessories\" child category of the \"Kids\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryKids_NewArrivals_ClothingAndAccessories();
//        });
//
//        step("Open \"New Arrivals - Shop All\" child category of the \"Kids\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryKids_NewArrivals_ShopAll();
//        });
//
//        step("Open \"Outerwear\" child category of the \"Kids\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryKids_Outerwear();
//        });
//
//        step("Open \"Outerwear - Shop All\" child category of the \"Kids\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryKids_Outerwear_ShopAll();
//        });
//
//        step("Open \"Lunar New Year\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryLunarNY();
//        });
//
//        step("Open \"Icons\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryIcons();
//        });
//
//        step("Open \"Shop Men's Icons\" child category of the \"Icons\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryIcons_Men();
//        });
//
//        step("Open \"Shop Women's Icons\" child category of the \"Icons\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryIcons_Women();
//        });
//
//        step("Open \"Men's Originals\" child category of the \"Icons\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryIcons_Men_Originals();
//        });
//
//        step("Open \"Women's Originals\" child category of the \"Icons\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryIcons_Women_Originals();
//        });
//
//        step("Open \"Originals\" child category of the \"Icons\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryIcons_Originals();
//        });
//
//        step("Open \"Women's Onyx Series\" child category of the \"Icons\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryIcons_Women_OnyxSeries();
//        });
//
//        step("Open \"Men's Onyx Series\" child category of the \"Icons\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryIcons_Men_OnyxSeries();
//        });
//
//        step("Open \"Onyx Series\" child category of the \"Icons\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryIcons_OnyxSeries();
//        });
//
//        step("Open \"Men's Cloud\" child category of the \"Icons\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryIcons_Men_Cloud();
//        });
//
//        step("Open \"Women's Cloud\" child category of the \"Icons\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryIcons_Women_Cloud();
//        });
//
//        step("Open \"Cloud\" child category of the \"Icons\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryIcons_Cloud();
//        });
//
//        step("Open \"Women's Gold Series\" child category of the \"Icons\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryIcons_Women_GoldSeries();
//        });
//
//        step("Open \"Men's Gold Series\" child category of the \"Icons\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryIcons_Men_GoldSeries();
//        });
//
//        step("Open \"Gold Series\" child category of the \"Icons\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategoryIcons_GoldSeries();
//        });
//
//        step("Open \"Sale\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategorySale();
//        });
//
//        step("Open \"Women\" child category of the \"Sale\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategorySale_Women();
//        });
//
//        step("Open \"Men\" child category of the \"Sale\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategorySale_Men();
//        });
//
//        step("Open \"Kids\" child category of the \"Sale\" main category and check URL", stepContext -> {
//            megamenuCategories.openCategorySale_Kids();
//        });
    }
}
