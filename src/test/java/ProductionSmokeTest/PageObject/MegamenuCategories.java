package ProductionSmokeTest.PageObject;

import ProductionSmokeTest.PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MegamenuCategories extends PageObjectModel {

    public MegamenuCategories(WebDriver driver, Actions actions, WebDriverWait wait) {
        super(driver, actions, wait);
    }

    @FindBy(xpath = "(//a[contains(@href,'/c/new-arrivals')])[3]")
    public WebElement categoryNew;

    @FindBy(xpath = "(//a[contains(@href,'/c/the-bunny')])[4]")
    public WebElement categoryNew_Bunny;

    @FindBy(xpath = "(//a[contains(@href,'/c/lightweight-down-jackets')])[3]")
    public WebElement categoryNew_AirDown;

    @FindBy(xpath = "(//a[contains(@href,'/c/new-arrivals')])[5]")
    public WebElement categoryNew_SpringNewArrivals;

    @FindBy(xpath = "(//a[contains(@href,'/c/women')])[41]")
    public WebElement categoryWomen;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/new-arrivals/new-spring-arrivals')])[3]")
    public WebElement categoryWomen_NewArrivals;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/lightweights-down-jacket')])[3]")
    public WebElement categoryWomen_NewArrivals_LightweightDownJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/collections/the-bunny')])[3]")
    public WebElement categoryWomen_NewArrivals_Bunny;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/rain-jackets')])[3]")
    public WebElement categoryWomen_NewArrivals_RainJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/quilt-jackets')])[3]")
    public WebElement categoryWomen_NewArrivals_QuiltedJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/new-arrivals/new-spring-arrivals')])[4]")
    public WebElement categoryWomen_NewArrivals_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons')])[8]")
    public WebElement categoryWomen_Icons;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons/originals')])[2]")
    public WebElement categoryWomen_Icons_Originals;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons/cloud')])[2]")
    public WebElement categoryWomen_Icons_Cloud;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons/gold-series')])[2]")
    public WebElement categoryWomen_Icons_GoldSeries;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons/onyx-series')])[2]")
    public WebElement categoryWomen_Icons_OnyxSeries;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons')])[13]")
    public WebElement categoryWomen_Icons_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear')])[23]")
    public WebElement categoryWomen_Outerwear;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/lightweights')])[6]")
    public WebElement categoryWomen_Outerwear_LightweightJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/quilt-jackets')])[4]")
    public WebElement categoryWomen_Outerwear_QuiltedJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/vests')])[3]")
    public WebElement categoryWomen_Outerwear_Vests;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/collections/the-bunny')])[4]")
    public WebElement categoryWomen_Outerwear_Bunny;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/rain-jackets')])[4]")
    public WebElement categoryWomen_Outerwear_RainJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/bomber-jackets')])[3]")
    public WebElement categoryWomen_Outerwear_BomberJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/lightweights-down-jackets')])[4]")
    public WebElement categoryWomen_Outerwear_LightweightDownJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/parkas')])[3]")
    public WebElement categoryWomen_Outerwear_Parkas;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/coats-jackets')])[3]")
    public WebElement categoryWomen_Outerwear_CoatsAndJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear')])[32]")
    public WebElement categoryWomen_Outerwear_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/clothing')])[8]")
    public WebElement categoryWomen_Clothing;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/clothing/sweatshirts-and-hoodies')])[2]")
    public WebElement categoryWomen_Clothing_SweatshirtsAndHoodies;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/clothing/sherpa-and-fleece')])[2]")
    public WebElement categoryWomen_Clothing_SherpaAndFleece;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/clothing/polos-and-tees')])[2]")
    public WebElement categoryWomen_Clothing_PolosAndTees;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/clothing/pants-and-shorts')])[2]")
    public WebElement categoryWomen_Clothing_PantsAndShorts;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/clothing')])[13]")
    public WebElement categoryWomen_Clothing_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories')])[16]")
    public WebElement categoryWomen_Accessories;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/hats-and-caps')])[4]")
    public WebElement categoryWomen_Accessories_HatsAndCaps;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/spring-accessories')])[4]")
    public WebElement categoryWomen_Accessories_SpringAccessories;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/bags-belts')])[3]")
    public WebElement categoryWomen_Accessories_BagsBeltsAndAccessories;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories')])[20]")
    public WebElement categoryWomen_Accessories_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/men')])[39]")
    public WebElement categoryMen;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/new-arrivals')])[3]")
    public WebElement categoryMen_NewArrivals;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear/lightweight-down-jacket')])[3]")
    public WebElement categoryMen_NewArrivals_LightweightDownJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/collections/the-bunny')])[3]")
    public WebElement categoryMen_NewArrivals_Bunny;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear/rain-jackets')])[3]")
    public WebElement categoryMen_NewArrivals_RainJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/new-arrivals/new-spring-arrivals')])[4]")
    public WebElement categoryMen_NewArrivals_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons')])[8]")
    public WebElement categoryMen_Icons;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons/originals')])[2]")
    public WebElement categoryMen_Icons_Originals;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons/gold-series')])[2]")
    public WebElement categoryMen_Icons_GoldSeries;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons/cloud')])[2]")
    public WebElement categoryMen_Icons_Cloud;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons/onyx-series')])[2]")
    public WebElement categoryMen_Icons_OnyxSeries;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons')])[13]")
    public WebElement categoryMen_Icons_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear')])[20]")
    public WebElement categoryMen_Outerwear;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear/lightweights')])[3]")
    public WebElement categoryMen_Outerwear_LightweightJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear/vests')])[3]")
    public WebElement categoryMen_Outerwear_Vests;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/collections/the-bunny')])[4]")
    public WebElement categoryMen_Outerwear_Bunny;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear/rain-jackets')])[4]")
    public WebElement categoryMen_Outerwear_RainJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear/bomber-jackets')])[3]")
    public WebElement categoryMen_Outerwear_BomberJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear/lightweight-down-jackets')])[4]")
    public WebElement categoryMen_Outerwear_LightweightDownJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear/parkas')])[3]")
    public WebElement categoryMen_Outerwear_Parkas;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear/coats-jackets')])[3]")
    public WebElement categoryMen_Outerwear_CoatsAndJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear')])[28]")
    public WebElement categoryMen_Outerwear_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/clothing')])[8]")
    public WebElement categoryMen_Clothing;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/clothing/sweatshirts-and-hoodies')])[2]")
    public WebElement categoryMen_Clothing_SweatshirtsAndHoodies;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/clothing/sherpa-and-fleece')])[2]")
    public WebElement categoryMen_Clothing_SherpaAndFleece;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/clothing/tees')])[2]")
    public WebElement categoryMen_Clothing_PolosAndTees;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/clothing/trousers-and-shorts')])[2]")
    public WebElement categoryMen_Clothing_PantsAndShorts;

//    @FindBy(xpath = "(//a[contains(@href,'/c/men/clothing/unisex-essentials')])[2]")
//    public WebElement categoryMen_Clothing_UnisexClothing;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/clothing')])[13]")
    public WebElement categoryMen_Clothing_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories')])[21]")
    public WebElement categoryMen_Accessories;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/hats-and-caps')])[5]")
    public WebElement categoryMen_Accessories_HatsAndCaps;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/spring-accessories')])[5]")
    public WebElement categoryMen_Accessories_SpringAccessories;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/bags-belts')])[4]")
    public WebElement categoryMen_Accessories_BagsBeltsAndAccessories;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories')])[25]")
    public WebElement categoryMen_Accessories_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/kids')])[12]")
    public WebElement categoryKids;

    @FindBy(xpath = "(//a[contains(@href,'/c/kids/new-arrivals')])[4]")
    public WebElement categoryKids_NewArrivals;

    @FindBy(xpath = "(//a[contains(@href,'/c/kids/new-arrivals/new-spring-arrivals')])[2]")
    public WebElement categoryKids_NewArrivals_NewSpringArrivals;

    @FindBy(xpath = "(//a[contains(@href,'/c/kids/new-arrivals')])[6]")
    public WebElement categoryKids_NewArrivals_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/kids/outerwear')])[3]")
    public WebElement categoryKids_Outerwear;

    @FindBy(xpath = "(//a[contains(@href,'/c/kids/outerwear')])[4]")
    public WebElement categoryKids_Outerwear_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories')])[26]")
    public WebElement categoryAccessories;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/hats-and-caps')])[6]")
    public WebElement categoryAccessories_HatsAndCaps;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/spring-summer-accessories')])[2]")
    public WebElement categoryAccessories_SpringAccessories;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/spring-accessories')])[6]")
    public WebElement categoryAccessories_SocksBeltsAndBags;

    @FindBy(xpath = "(//a[contains(@href,'/c/pooch-knuckles')])[2]")
    public WebElement categoryAccessories_Pet;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories')])[30]")
    public WebElement categoryAccessories_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/iconics')])[7]")
    public WebElement categoryIcons;

    @FindBy(xpath = "(//a[contains(@href,'/e/explore-icons')])[4]")
    public WebElement categoryIcons_ExploreIcons;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons')])[14]")
    public WebElement categoryIcons_Men;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons')])[14]")
    public WebElement categoryIcons_Women;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons/originals')])[3]")
    public WebElement categoryIcons_Men_Originals;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons/originals')])[3]")
    public WebElement categoryIcons_Women_Originals;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons/onyx-series')])[3]")
    public WebElement categoryIcons_Women_OnyxSeries;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons/onyx-series')])[3]")
    public WebElement categoryIcons_Men_OnyxSeries;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons/cloud')])[3]")
    public WebElement categoryIcons_Men_Cloud;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons/cloud')])[3]")
    public WebElement categoryIcons_Women_Cloud;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons/gold-series')])[3]")
    public WebElement categoryIcons_Women_GoldSeries;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons/gold-series')])[3]")
    public WebElement categoryIcons_Men_GoldSeries;

    @FindBy(xpath = "(//a[contains(@href,'/c/iconics/originals')])[3]")
    public WebElement categoryIcons_Originals;

    @FindBy(xpath = "(//a[contains(@href,'/c/iconics/onyx-series')])[3]")
    public WebElement categoryIcons_OnyxSeries;

    @FindBy(xpath = "(//a[contains(@href,'/c/iconics/cloud')])[3]")
    public WebElement categoryIcons_Cloud;

    @FindBy(xpath = "(//a[contains(@href,'/c/iconics/gold-series')])[3]")
    public WebElement categoryIcons_GoldSeries;

    @FindBy(xpath = "(//a[contains(@href,'/c/the-bunny')])[6]")
    public WebElement categoryTheBunny;

    @FindBy(xpath = "(//a[contains(@href,'/e/explore-the-bunny')])[2]")
    public WebElement DiscoverTheBunny;

    @FindBy(xpath = "(//a[contains(@href,'/c/the-bunny')])[7]")
    public WebElement categoryTheBunny_ShopAll;

    public void openCategoryNew() {
        wait.withTimeout(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(@href,'/c/new-arrivals')])[3]")));
        categoryNew.click();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/new-arrivals")));
    }

    public void openCategoryNew_Bunny() {
        actions.moveToElement(categoryKids).pause(2000); //remove focus from "New" category
        actions.moveToElement(categoryNew).pause(2000);
        actions.moveToElement(categoryNew_Bunny);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/the-bunny")));
    }

    public void openCategoryNew_AirDown() {
        actions.moveToElement(categoryNew).pause(2000);
        actions.moveToElement(categoryNew_AirDown);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/lightweight-down-jackets")));
    }

    public void openCategoryNew_NewArrivals() {
        actions.moveToElement(categoryNew).pause(2000);
        actions.moveToElement(categoryNew_SpringNewArrivals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/new-arrivals")));
    }

    public void openCategoryWomen() {
//        wait.withTimeout(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(@href,'/c/women')])[37]")));
        actions.moveToElement(categoryWomen).pause(2000);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women")));
    }

    public void openCategoryWomen_NewArrivals() {
        actions.moveToElement(categoryNew).pause(2000);
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_NewArrivals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/new-arrivals/new-spring-arrivals")));
    }

    public void openCategoryWomen_NewArrivals_LightweightDownJackets() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_NewArrivals_LightweightDownJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/outerwear/lightweights-down-jackets")));
    }

    public void openCategoryWomen_NewArrivals_Bunny() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_NewArrivals_Bunny);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/collections/the-bunny")));
    }

    public void openCategoryWomen_NewArrivals_RainJackets() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_NewArrivals_RainJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/outerwear/rain-jackets")));
    }

    public void openCategoryWomen_NewArrivals_QuiltedJackets() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_NewArrivals_QuiltedJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/outerwear/quilt-jackets")));
    }

    public void openCategoryWomen_NewArrivals_ShopAll() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_NewArrivals_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/new-arrivals/new-spring-arrivals")));
    }

    public void openCategoryWomen_Icons() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Icons);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/icons")));
    }

    public void openCategoryWomen_Icons_Originals() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Icons_Originals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/icons/originals")));
    }

    public void openCategoryWomen_Icons_GoldSeries() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Icons_GoldSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/icons/gold-series")));
    }

    public void openCategoryWomen_Icons_Cloud() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Icons_Cloud);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/icons/cloud")));
    }

    public void openCategoryWomen_Icons_OnyxSeries() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Icons_OnyxSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/icons/onyx-series")));
    }

    public void openCategoryWomen_Icons_ShopAll() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Icons_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/icons")));
    }

    public void openCategoryWomen_Outerwear() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Outerwear);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/outerwear")));
    }

    public void openCategoryWomen_Outerwear_LightweightJackets() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Outerwear_LightweightJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/outerwear/lightweights")));
    }

    public void openCategoryWomen_Outerwear_QuiltedJackets() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Outerwear_QuiltedJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/outerwear/quilt-jackets")));
    }

    public void openCategoryWomen_Outerwear_Vests() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Outerwear_Vests);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/outerwear/vests")));
    }

    public void openCategoryWomen_Outerwear_Bunny() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Outerwear_Bunny);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/collections/the-bunny")));
    }

    public void openCategoryWomen_Outerwear_RainJackets() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Outerwear_RainJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/outerwear/rain-jackets")));
    }

    public void openCategoryWomen_Outerwear_BomberJackets() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Outerwear_BomberJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/outerwear/bomber-jackets")));
    }

    public void openCategoryWomen_Outerwear_LightweightDownJackets() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Outerwear_LightweightDownJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/outerwear/lightweights-down-jackets")));
    }

    public void openCategoryWomen_Outerwear_Parkas() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Outerwear_Parkas);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/outerwear/parkas")));
    }

    public void openCategoryWomen_Outerwear_CoatsAndJackets() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Outerwear_CoatsAndJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/outerwear/coats-jackets")));
    }

    public void openCategoryWomen_Outerwear_ShopAll() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Outerwear_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/outerwear")));
    }

    public void openCategoryWomen_Clothing() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Clothing);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/clothing")));
    }

    public void openCategoryWomen_Clothing_SweatshirtsAndHoodies() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Clothing_SweatshirtsAndHoodies);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/clothing/sweatshirts-and-hoodies")));
    }

    public void openCategoryWomen_Clothing_SherpaAndFleece() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Clothing_SherpaAndFleece);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/clothing/sherpa-and-fleece")));
    }

    public void openCategoryWomen_Clothing_PolosAndTees() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Clothing_PolosAndTees);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/clothing/polos-and-tees")));
    }

    public void openCategoryWomen_Clothing_PantsAndShorts() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Clothing_PantsAndShorts);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/clothing/pants-and-shorts")));
    }

    public void openCategoryWomen_Clothing_ShopAll() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Clothing_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/clothing")));
    }

    public void openCategoryWomen_Accessories() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Accessories);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/accessories")));
    }

    public void openCategoryWomen_Accessories_BeaniesAndHats() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Accessories_HatsAndCaps);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/accessories/hats-and-caps")));
    }

    public void openCategoryWomen_Accessories_WinterAccessories() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Accessories_SpringAccessories);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/accessories/spring-accessories")));
    }

    public void openCategoryWomen_Accessories_BagsBeltsAndAccessories() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Accessories_BagsBeltsAndAccessories);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/accessories/bags-belts")));
    }

    public void openCategoryWomen_Accessories_ShopAll() {
        actions.moveToElement(categoryWomen).pause(2000);
        actions.moveToElement(categoryWomen_Accessories_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/accessories")));
    }

    public void openCategoryMen() {
//        wait.withTimeout(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(@href,'/c/men')])[37]")));
//        categoryMen.click();
        actions.moveToElement(categoryMen).pause(2000);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men")));
    }

    public void openCategoryMen_NewArrivals() {
        actions.moveToElement(categoryNew).pause(2000);
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_NewArrivals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/new-arrivals/new-spring-arrivals")));
    }

    public void openCategoryMen_NewArrivals_LightweightDownJackets() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_NewArrivals_LightweightDownJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/outerwear/lightweight-down-jackets")));
    }

    public void openCategoryMen_NewArrivals_Bunny() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_NewArrivals_Bunny);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/collections/the-bunny")));
    }

    public void openCategoryMen_NewArrivals_RainJackets() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_NewArrivals_RainJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/outerwear/rain-jackets")));
    }

    public void openCategoryMen_NewArrivals_ShopAll() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_NewArrivals_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/new-arrivals/new-spring-arrivals")));
    }

    public void openCategoryMen_Icons() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Icons);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/icons")));
    }

    public void openCategoryMen_Icons_Originals() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Icons_Originals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/icons/originals")));
    }

    public void openCategoryMen_Icons_GoldSeries() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Icons_GoldSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/icons/gold-series")));
    }

    public void openCategoryMen_Icons_Cloud() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Icons_Cloud);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/icons/cloud")));
    }

    public void openCategoryMen_Icons_OnyxSeries() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Icons_OnyxSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/icons/onyx-series")));
    }

    public void openCategoryMen_Icons_ShopAll() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Icons_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/icons")));
    }

    public void openCategoryMen_Outerwear() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Outerwear);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/outerwear")));
    }

    public void openCategoryMen_Outerwear_LightweightJackets() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Outerwear_LightweightJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/outerwear/lightweights")));
    }

    public void openCategoryMen_Outerwear_Vests() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Outerwear_Vests);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/outerwear/vests")));
    }

    public void openCategoryMen_Outerwear_Bunny() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Outerwear_Bunny);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/collections/the-bunny")));
    }

    public void openCategoryMen_Outerwear_RainJackets() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Outerwear_RainJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/outerwear/rain-jackets")));
    }

    public void openCategoryMen_Outerwear_BomberJackets() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Outerwear_BomberJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/outerwear/bomber-jackets")));
    }

    public void openCategoryMen_Outerwear_LightweightDownJackets() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Outerwear_LightweightDownJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/outerwear/lightweight-down-jackets")));
    }

    public void openCategoryMen_Outerwear_Parkas() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Outerwear_Parkas);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/outerwear/parkas")));
    }
    public void openCategoryMen_Outerwear_CoatsAndJackets() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Outerwear_CoatsAndJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/outerwear/coats-jackets")));
    }

    public void openCategoryMen_Outerwear_ShopAll() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Outerwear_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/outerwear")));
    }

    public void openCategoryMen_Clothing() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Clothing);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/clothing")));
    }

    public void openCategoryMen_Clothing_SweatshirtsAndHoodies() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Clothing_SweatshirtsAndHoodies);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/clothing/sweatshirts-and-hoodies")));
    }

    public void openCategoryMen_Clothing_SherpaAndFleece() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Clothing_SherpaAndFleece);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/clothing/sherpa-and-fleece")));
    }

    public void openCategoryMen_Clothing_PolosAndTees() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Clothing_PolosAndTees);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/clothing/tees")));
    }

    public void openCategoryMen_Clothing_PantsAndShorts() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Clothing_PantsAndShorts);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/clothing/trousers-and-shorts")));
    }

//    public void openCategoryMen_Clothing_UnisexClothing() {
//        actions.moveToElement(categoryMen).pause(1000);
//        actions.moveToElement(categoryMen_Clothing_UnisexClothing);
//        actions.click().build().perform();
//        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/clothing/unisex-essentials")));
//    }

    public void openCategoryMen_Clothing_ShopAll() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Clothing_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/clothing")));
    }

    public void openCategoryMen_Accessories() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Accessories);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/accessories")));
    }

    public void openCategoryMen_Accessories_HatsAndCaps() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Accessories_HatsAndCaps);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/accessories/hats-and-caps")));
    }

    public void openCategoryMen_Accessories_SpringAccessories() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Accessories_SpringAccessories);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/accessories/spring-accessories")));
    }

    public void openCategoryMen_Accessories_BagsBeltsAndAccessories() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Accessories_BagsBeltsAndAccessories);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/accessories/bags-belts")));
    }

    public void openCategoryMen_Accessories_ShopAll() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryMen_Accessories_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/accessories")));
    }

    public void openCategoryKids() {
//        wait.withTimeout(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(@href,'/c/kids')])[13]")));
//        categoryKids.click();
        actions.moveToElement(categoryKids).pause(2000);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/kids")));
    }

    public void openCategoryKids_NewArrivals() {
        actions.moveToElement(categoryMen).pause(2000);
        actions.moveToElement(categoryKids).pause(2000);
        actions.moveToElement(categoryKids_NewArrivals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/kids/new-arrivals")));
    }

    public void openCategoryKids_NewArrivals_NewSpringArrivals() {
        actions.moveToElement(categoryKids).pause(2000);
        actions.moveToElement(categoryKids_NewArrivals_NewSpringArrivals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/kids/new-arrivals/new-spring-arrivals")));
    }

    public void openCategoryKids_NewArrivals_ShopAll() {
        actions.moveToElement(categoryKids).pause(2000);
        actions.moveToElement(categoryKids_NewArrivals_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/kids/new-arrivals")));
    }

    public void openCategoryKids_Outerwear() {
        actions.moveToElement(categoryKids).pause(2000);
        actions.moveToElement(categoryKids_Outerwear);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/kids/outerwear")));
    }

    public void openCategoryKids_Outerwear_ShopAll() {
        actions.moveToElement(categoryKids).pause(2000);
        actions.moveToElement(categoryKids_Outerwear_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/kids/outerwear")));
    }

    public void openCategoryAccessories() {
//        wait.withTimeout(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(@href,'/c/accessories')])[26]")));
//        categoryAccessories.click();
        actions.moveToElement(categoryAccessories).pause(2000);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/accessories")));
    }

    public void openCategoryAccessories_HatsAndCaps() {
        actions.moveToElement(categoryKids).pause(2000);
        actions.moveToElement(categoryAccessories).pause(2000);
        actions.moveToElement(categoryAccessories_HatsAndCaps);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/accessories/hats-and-caps")));
    }

    public void openCategoryAccessories_SpringAccessories() {
        actions.moveToElement(categoryAccessories).pause(2000);
        actions.moveToElement(categoryAccessories_SpringAccessories);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/accessories/spring-summer-accessories")));
    }

    public void openCategoryAccessories_SocksBeltsAndBags() {
        actions.moveToElement(categoryAccessories).pause(2000);
        actions.moveToElement(categoryAccessories_SocksBeltsAndBags);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/accessories/spring-accessories")));
    }

    public void openCategoryAccessories_Pet() {
        actions.moveToElement(categoryAccessories).pause(2000);
        actions.moveToElement(categoryAccessories_Pet);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/pooch-knuckles")));
    }

    public void openCategoryAccessories_ShopAll() {
        actions.moveToElement(categoryAccessories).pause(2000);
        actions.moveToElement(categoryAccessories_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/accessories")));
    }

    public void openCategoryIcons() {
//        wait.withTimeout(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(@href,'/c/iconics')])[7]")));
//        categoryIcons.click();
        actions.moveToElement(categoryIcons).pause(2000);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/iconics")));
    }

    public void openCategoryIcons_ExploreIcons() {
        actions.moveToElement(categoryKids).pause(2000);
        actions.moveToElement(categoryIcons).pause(2000);
        actions.moveToElement(categoryIcons_ExploreIcons);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/e/explore-icons")));
    }

    public void openCategoryIcons_Men() {
        actions.moveToElement(categoryIcons).pause(2000);
        actions.moveToElement(categoryIcons_Men);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/icons")));
    }

    public void openCategoryIcons_Women() {
        actions.moveToElement(categoryIcons).pause(2000);
        actions.moveToElement(categoryIcons_Women);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/icons")));
    }

    public void openCategoryIcons_Men_Originals() {
        actions.moveToElement(categoryIcons).pause(2000);
        actions.moveToElement(categoryIcons_Men_Originals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/icons/originals")));
    }

    public void openCategoryIcons_Women_Originals() {
        actions.moveToElement(categoryIcons).pause(2000);
        actions.moveToElement(categoryIcons_Women_Originals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/icons/originals")));
    }

    public void openCategoryIcons_Originals() {
        actions.moveToElement(categoryIcons).pause(2000);
        actions.moveToElement(categoryIcons_Originals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/iconics/originals")));
    }

    public void openCategoryIcons_Women_OnyxSeries() {
        actions.moveToElement(categoryIcons).pause(2000);
        actions.moveToElement(categoryIcons_Women_OnyxSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/icons/onyx-series")));
    }

    public void openCategoryIcons_Men_OnyxSeries() {
        actions.moveToElement(categoryIcons).pause(2000);
        actions.moveToElement(categoryIcons_Men_OnyxSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/icons/onyx-series")));
    }

    public void openCategoryIcons_OnyxSeries() {
        actions.moveToElement(categoryIcons).pause(2000);
        actions.moveToElement(categoryIcons_OnyxSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/icons/onyx-series")));
    }

    public void openCategoryIcons_Men_Cloud() {
        actions.moveToElement(categoryIcons).pause(2000);
        actions.moveToElement(categoryIcons_Men_Cloud);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/icons/cloud")));
    }

    public void openCategoryIcons_Women_Cloud() {
        actions.moveToElement(categoryIcons).pause(2000);
        actions.moveToElement(categoryIcons_Women_Cloud);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/icons/cloud")));
    }

    public void openCategoryIcons_Cloud() {
        actions.moveToElement(categoryIcons).pause(2000);
        actions.moveToElement(categoryIcons_Cloud);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/iconics/cloud")));
    }

    public void openCategoryIcons_Women_GoldSeries() {
        actions.moveToElement(categoryIcons).pause(2000);
        actions.moveToElement(categoryIcons_Women_GoldSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/women/icons/gold-series")));
    }

    public void openCategoryIcons_Men_GoldSeries() {
        actions.moveToElement(categoryIcons).pause(2000);
        actions.moveToElement(categoryIcons_Men_GoldSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/men/icons/gold-series")));
    }

    public void openCategoryIcons_GoldSeries() {
        actions.moveToElement(categoryIcons).pause(2000);
        actions.moveToElement(categoryIcons_GoldSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/iconics/gold-series")));
    }

    public void openCategoryTheBunny() {
//        wait.withTimeout(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(@href,'/c/the-bunny')])[6]")));
//        categoryTheBunny.click();
        actions.moveToElement(categoryTheBunny).pause(2000);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/the-bunny")));
    }

    public void openCategoryTheBunny_DiscoverTheBunny() {
        actions.moveToElement(categoryIcons).pause(2000);
        actions.moveToElement(categoryTheBunny).pause(2000);
        actions.moveToElement(DiscoverTheBunny);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/e/explore-the-bunny")));
    }

    public void openCategoryTheBunny_ShopAll() {
        actions.moveToElement(categoryTheBunny).pause(2000);
        actions.moveToElement(categoryTheBunny_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("/c/the-bunny")));
    }
}