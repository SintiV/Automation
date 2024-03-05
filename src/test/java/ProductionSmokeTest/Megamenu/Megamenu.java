package ProductionSmokeTest.Megamenu;

import ProductionSmokeTest.BaseTest;
import ProductionSmokeTest.PageObject.LocaleSwitcherOnSiteLaunch;
import ProductionSmokeTest.PageObject.MegamenuCategories;
import org.testng.annotations.Test;

public class Megamenu extends BaseTest {
    LocaleSwitcherOnSiteLaunch localeSwitcherOnSiteLaunch;
    MegamenuCategories megamenuCategories;

    @Test(testName = "Test megamenu")
    public void MegamenuCA_ENTest() {
        localeSwitcherOnSiteLaunch = new LocaleSwitcherOnSiteLaunch(driver, actions, wait);
        megamenuCategories = new MegamenuCategories(driver, actions, wait);

        localeSwitcherOnSiteLaunch.LaunchCA_EN.click();

        megamenuCategories.openCategoryNew();
        megamenuCategories.openCategoryNew_Bunny();
        megamenuCategories.openCategoryNew_AirDown();
        megamenuCategories.openCategoryNew_NewArrivals();

        megamenuCategories.openCategoryWomen();
        megamenuCategories.openCategoryWomen_NewArrivals();
        megamenuCategories.openCategoryWomen_NewArrivals_LightweightDownJackets();
        megamenuCategories.openCategoryWomen_NewArrivals_Bunny();
        megamenuCategories.openCategoryWomen_NewArrivals_RainJackets();
        megamenuCategories.openCategoryWomen_NewArrivals_QuiltedJackets();
        megamenuCategories.openCategoryWomen_NewArrivals_ShopAll();
        megamenuCategories.openCategoryWomen_Icons();
        megamenuCategories.openCategoryWomen_Icons_Originals();
        megamenuCategories.openCategoryWomen_Icons_GoldSeries();
        megamenuCategories.openCategoryWomen_Icons_Cloud();
        megamenuCategories.openCategoryWomen_Icons_OnyxSeries();
        megamenuCategories.openCategoryWomen_Icons_ShopAll();
        megamenuCategories.openCategoryWomen_Outerwear();
        megamenuCategories.openCategoryWomen_Outerwear_LightweightJackets();
        megamenuCategories.openCategoryWomen_Outerwear_QuiltedJackets();
        megamenuCategories.openCategoryWomen_Outerwear_Vests();
        megamenuCategories.openCategoryWomen_Outerwear_Bunny();
        megamenuCategories.openCategoryWomen_Outerwear_RainJackets();
        megamenuCategories.openCategoryWomen_Outerwear_BomberJackets();
        megamenuCategories.openCategoryWomen_Outerwear_LightweightDownJackets();
        megamenuCategories.openCategoryWomen_Outerwear_Parkas();
        megamenuCategories.openCategoryWomen_Outerwear_CoatsAndJackets();
        megamenuCategories.openCategoryWomen_Outerwear_ShopAll();
        megamenuCategories.openCategoryWomen_Clothing();
        megamenuCategories.openCategoryWomen_Clothing_SweatshirtsAndHoodies();
        megamenuCategories.openCategoryWomen_Clothing_SherpaAndFleece();
        megamenuCategories.openCategoryWomen_Clothing_PolosAndTees();
        megamenuCategories.openCategoryWomen_Clothing_PantsAndShorts();
        megamenuCategories.openCategoryWomen_Clothing_ShopAll();
        megamenuCategories.openCategoryWomen_Accessories();
        megamenuCategories.openCategoryWomen_Accessories_BeaniesAndHats();
        megamenuCategories.openCategoryWomen_Accessories_WinterAccessories();
        megamenuCategories.openCategoryWomen_Accessories_BagsBeltsAndAccessories();
        megamenuCategories.openCategoryWomen_Accessories_ShopAll();

        megamenuCategories.openCategoryMen();
        megamenuCategories.openCategoryMen_NewArrivals();
        megamenuCategories.openCategoryMen_NewArrivals_LightweightDownJackets();
        megamenuCategories.openCategoryMen_NewArrivals_Bunny();
        megamenuCategories.openCategoryMen_NewArrivals_RainJackets();
        megamenuCategories.openCategoryMen_NewArrivals_ShopAll();
        megamenuCategories.openCategoryMen_Icons();
        megamenuCategories.openCategoryMen_Icons_Originals();
        megamenuCategories.openCategoryMen_Icons_GoldSeries();
        megamenuCategories.openCategoryMen_Icons_Cloud();
        megamenuCategories.openCategoryMen_Icons_OnyxSeries();
        megamenuCategories.openCategoryMen_Icons_ShopAll();
        megamenuCategories.openCategoryMen_Outerwear();
        megamenuCategories.openCategoryMen_Outerwear_LightweightJackets();
        megamenuCategories.openCategoryMen_Outerwear_Vests();
        megamenuCategories.openCategoryMen_Outerwear_Bunny();
        megamenuCategories.openCategoryMen_Outerwear_RainJackets();
        megamenuCategories.openCategoryMen_Outerwear_BomberJackets();
        megamenuCategories.openCategoryMen_Outerwear_LightweightDownJackets();
        megamenuCategories.openCategoryMen_Outerwear_Parkas();
        megamenuCategories.openCategoryMen_Outerwear_CoatsAndJackets();
        megamenuCategories.openCategoryMen_Outerwear_ShopAll();
        megamenuCategories.openCategoryMen_Clothing();
        megamenuCategories.openCategoryMen_Clothing_SweatshirtsAndHoodies();
        megamenuCategories.openCategoryMen_Clothing_SherpaAndFleece();
        megamenuCategories.openCategoryMen_Clothing_PolosAndTees();
        megamenuCategories.openCategoryMen_Clothing_PantsAndShorts();
        megamenuCategories.openCategoryMen_Clothing_ShopAll();
        megamenuCategories.openCategoryMen_Accessories();
        megamenuCategories.openCategoryMen_Accessories_HatsAndCaps();
        megamenuCategories.openCategoryMen_Accessories_SpringAccessories();
        megamenuCategories.openCategoryMen_Accessories_BagsBeltsAndAccessories();
        megamenuCategories.openCategoryMen_Accessories_ShopAll();

        megamenuCategories.openCategoryKids();
        megamenuCategories.openCategoryKids_NewArrivals();
        megamenuCategories.openCategoryKids_NewArrivals_NewSpringArrivals();
        megamenuCategories.openCategoryKids_NewArrivals_ShopAll();
        megamenuCategories.openCategoryKids_Outerwear();
        megamenuCategories.openCategoryKids_Outerwear_ShopAll();

        megamenuCategories.openCategoryAccessories();
        megamenuCategories.openCategoryAccessories_HatsAndCaps();
        megamenuCategories.openCategoryAccessories_SpringAccessories();
        megamenuCategories.openCategoryAccessories_SocksBeltsAndBags();
        megamenuCategories.openCategoryAccessories_Pet();
        megamenuCategories.openCategoryAccessories_ShopAll();

        megamenuCategories.openCategoryIcons();
        megamenuCategories.openCategoryIcons_ExploreIcons();
        megamenuCategories.openCategoryIcons_Men();
        megamenuCategories.openCategoryIcons_Women();
        megamenuCategories.openCategoryIcons_Men_Originals();
        megamenuCategories.openCategoryIcons_Women_Originals();
        megamenuCategories.openCategoryIcons_Originals();
        megamenuCategories.openCategoryIcons_Women_OnyxSeries();
        megamenuCategories.openCategoryIcons_Men_OnyxSeries();
        megamenuCategories.openCategoryIcons_OnyxSeries();
        megamenuCategories.openCategoryIcons_Men_Cloud();
        megamenuCategories.openCategoryIcons_Women_Cloud();
        megamenuCategories.openCategoryIcons_Cloud();
        megamenuCategories.openCategoryIcons_Women_GoldSeries();
        megamenuCategories.openCategoryIcons_Men_GoldSeries();
        megamenuCategories.openCategoryIcons_GoldSeries();

        megamenuCategories.openCategoryTheBunny();
        megamenuCategories.openCategoryTheBunny_DiscoverTheBunny();
        megamenuCategories.openCategoryTheBunny_ShopAll();
    }
}
