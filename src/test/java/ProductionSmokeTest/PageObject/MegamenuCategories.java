package ProductionSmokeTest.PageObject;

import ProductionSmokeTest.PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.locators.RelativeLocator;
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

    @FindBy(xpath = "(//a[contains(@href,'/c/lunar-new-year')])[4]")
    public WebElement categoryNew_LunarNY;

    @FindBy(xpath = "(//a[contains(@href,'/c/pleasures')])[3]")
    public WebElement categoryNew_Pleasures;

    @FindBy(xpath = "(//a[contains(@href,'/c/new-arrivals')])[5]")
    public WebElement categoryNew_NewArrivals;

    @FindBy(xpath = "(//a[contains(@href,'/c/women')])[35]")
    public WebElement categoryWomenENG; //ENG locales

    @FindBy(xpath = "(//a[contains(@href,'/c/women')])[36]")
    public WebElement categoryWomenNonENG; //FR, DE locales

    @FindBy(xpath = "(//a[contains(@href,'/c/women/new-arrivals')])[3]")
    public WebElement categoryWomen_NewArrivals;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/sale')])[3]")
    public WebElement categoryWomen_NewArrivals_Sale;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons/cloud')])[3]")
    public WebElement categoryWomen_NewArrivals_Cloud;

    @FindBy(xpath = "(//a[contains(@href,'herpa')])[5]")
    public WebElement categoryWomen_NewArrivals_SherpaAndFleece;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/collections/lightweights')])[2]")
    public WebElement categoryWomen_NewArrivals_LightweightDown;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/collections/the-bunny')])[3]")
    public WebElement categoryWomen_NewArrivals_Bunny;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/puffer-collection')])[3]")
    public WebElement categoryWomen_NewArrivals_Puffers;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/new-arrivals')])[4]")
    public WebElement categoryWomen_NewArrivals_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons')])[10]")
    public WebElement categoryWomen_Icons;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons/originals')])[2]")
    public WebElement categoryWomen_Icons_Originals;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons/cloud')])[4]")
    public WebElement categoryWomen_Icons_Cloud;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons/gold-series')])[2]")
    public WebElement categoryWomen_Icons_GoldSeries;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons/onyx-series')])[2]")
    public WebElement categoryWomen_Icons_OnyxSeries;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons')])[15]")
    public WebElement categoryWomen_Icons_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear')])[11]")
    public WebElement categoryWomen_Outerwear;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/collections/the-bunny')])[4]")
    public WebElement categoryWomen_Outerwear_Bunny;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/lightweights')])[2]")
    public WebElement categoryWomen_Outerwear_LightweightJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/coats-jackets')])[2]")
    public WebElement categoryWomen_Outerwear_CoatsAndJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/puffer-collection')])[4]")
    public WebElement categoryWomen_Outerwear_Puffers;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/bomber-jackets')])[2]")
    public WebElement categoryWomen_Outerwear_BomberJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/parkas')])[2]")
    public WebElement categoryWomen_Outerwear_Parkas;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear/vests')])[2]")
    public WebElement categoryWomen_Outerwear_Vests;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/outerwear')])[18]")
    public WebElement categoryWomen_Outerwear_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/clothing')])[8]")
    public WebElement categoryWomen_Clothing;

    @FindBy(xpath = "(//a[contains(@href,'herpa')])[6]")
    public WebElement categoryWomen_Clothing_SherpaAndFleece;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/clothing/sweatshirts-and-hoodies')])[2]")
    public WebElement categoryWomen_Clothing_SweatshirtsAndHoodies;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/clothing/trousers-and-shorts')])[2]")
    public WebElement categoryWomen_Clothing_PantsAndShorts;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/clothing')])[12]")
    public WebElement categoryWomen_Clothing_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories')])[14]")
    public WebElement categoryWomen_Accessories;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/hats-and-caps')])[3]")
    public WebElement categoryWomen_Accessories_BeaniesAndHats;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/beanies-and-scarves')])[3]")
    public WebElement categoryWomen_Accessories_WinterAccessories;

    @FindBy(xpath = "(//a[contains(@href,'/c/pooch-knuckles')])[3]")
    public WebElement categoryWomen_Accessories_Pet;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/spring-accessories')])[3]")
    public WebElement categoryWomen_Accessories_SocksBeltsAndBags;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories')])[18]")
    public WebElement categoryWomen_Accessories_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/men')])[36]")
    public WebElement categoryMenENG; //ENG locales

    @FindBy(xpath = "(//a[contains(@href,'/c/men')])[37]")
    public WebElement categoryMenNonENG; //FR, DE locales

    @FindBy(xpath = "(//a[contains(@href,'/c/men/new-arrivals')])[3]")
    public WebElement categoryMen_NewArrivals;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/sale')])[3]")
    public WebElement categoryMen_NewArrivals_Sale;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons/cloud')])[3]")
    public WebElement categoryMen_NewArrivals_Cloud;

    @FindBy(xpath = "(//a[contains(@href,'herpa')])[7]")
    public WebElement categoryMen_NewArrivals_SherpaAndFleece;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/collections/lightweights')])[2]")
    public WebElement categoryMen_NewArrivals_LightweightDown;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/collections/the-bunny')])[3]")
    public WebElement categoryMen_NewArrivals_Bunny;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear/puffer-collection')])[3]")
    public WebElement categoryMen_NewArrivals_Puffers;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/new-arrivals')])[4]")
    public WebElement categoryMen_NewArrivals_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons')])[10]")
    public WebElement categoryMen_Icons;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons/originals')])[2]")
    public WebElement categoryMen_Icons_Originals;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons/cloud')])[4]")
    public WebElement categoryMen_Icons_Cloud;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons/gold-series')])[2]")
    public WebElement categoryMen_Icons_GoldSeries;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons/onyx-series')])[2]")
    public WebElement categoryMen_Icons_OnyxSeries;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons')])[15]")
    public WebElement categoryMen_Icons_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear')])[11]")
    public WebElement categoryMen_Outerwear;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/collections/the-bunny')])[4]")
    public WebElement categoryMen_Outerwear_Bunny;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear/lightweights')])[2]")
    public WebElement categoryMen_Outerwear_LightweightJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear/coats-jackets')])[2]")
    public WebElement categoryMen_Outerwear_CoatsAndJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear/puffer-collection')])[4]")
    public WebElement categoryMen_Outerwear_Puffers;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear/bomber-jackets')])[2]")
    public WebElement categoryMen_Outerwear_BomberJackets;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear/parkas')])[2]")
    public WebElement categoryMen_Outerwear_Parkas;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear/vests')])[2]")
    public WebElement categoryMen_Outerwear_Vests;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/outerwear')])[18]")
    public WebElement categoryMen_Outerwear_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/clothing')])[9]")
    public WebElement categoryMen_Clothing;

    @FindBy(xpath = "(//a[contains(@href,'herpa')])[8]")
    public WebElement categoryMen_Clothing_SherpaAndFleece;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/clothing/tees')])[2]")
    public WebElement categoryMen_Clothing_PolosAndTees;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/clothing/sweatshirts-and-hoodies')])[2]")
    public WebElement categoryMen_Clothing_SweatshirtsAndHoodies;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/clothing/trousers-and-shorts')])[2]")
    public WebElement categoryMen_Clothing_PantsAndShorts;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/clothing/unisex-essentials')])[2]")
    public WebElement categoryMen_Clothing_UnisexClothing;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/clothing')])[14]")
    public WebElement categoryMen_Clothing_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories')])[19]")
    public WebElement categoryMen_Accessories;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/hats-and-caps')])[4]")
    public WebElement categoryMen_Accessories_BeaniesAndHats;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/beanies-and-scarves')])[4]")
    public WebElement categoryMen_Accessories_WinterAccessories;

    @FindBy(xpath = "(//a[contains(@href,'/c/pooch-knuckles')])[4]")
    public WebElement categoryMen_Accessories_Pet;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/spring-accessories')])[4]")
    public WebElement categoryMen_Accessories_SocksBeltsAndBags;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories')])[23]")
    public WebElement categoryMen_Accessories_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/kids')])[14]")
    public WebElement categoryKids;

    @FindBy(xpath = "(//a[contains(@href,'/c/kids/new-arrivals')])[3]")
    public WebElement categoryKids_NewArrivals;

    @FindBy(xpath = "(//a[contains(@href,'/c/kids/sale')])[3]")
    public WebElement categoryKids_NewArrivals_Sale;

    @FindBy(xpath = "(//a[contains(@href,'/c/kids/icons/originals')])[2]")
    public WebElement categoryKids_NewArrivals_Originals;

    @FindBy(xpath = "(//a[contains(@href,'/c/kids/icons/gold')])[2]")
    public WebElement categoryKids_NewArrivals_Gold;

    @FindBy(xpath = "(//a[contains(@href,'/c/kids/collections/lightweights')])[2]")
    public WebElement categoryKids_NewArrivals_Lightweights;

    @FindBy(xpath = "(//a[contains(@href,'/c/kids/clothing-and-accessories')])[4]")
    public WebElement categoryKids_NewArrivals_ClothingAndAccessories;

    @FindBy(xpath = "(//a[contains(@href,'/c/kids/new-arrivals')])[4]")
    public WebElement categoryKids_NewArrivals_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/kids/outerwear')])[3]")
    public WebElement categoryKids_Outerwear;

    @FindBy(xpath = "(//a[contains(@href,'/c/kids/outerwear')])[4]")
    public WebElement categoryKids_Outerwear_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories')])[26]")
    public WebElement categoryAccessories;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/hats-and-caps')])[6]")
    public WebElement categoryAccessories_BeaniesAndHats;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/beanies-and-scarves')])[6]")
    public WebElement categoryAccessories_WinterAccessories;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories/spring-accessories')])[6]")
    public WebElement categoryAccessories_SocksBeltsAndBags;

    @FindBy(xpath = "(//a[contains(@href,'/c/pooch-knuckles')])[6]")
    public WebElement categoryAccessories_Pet;

    @FindBy(xpath = "(//a[contains(@href,'/c/accessories')])[30]")
    public WebElement categoryAccessories_ShopAll;

    @FindBy(xpath = "(//a[contains(@href,'/c/iconics')])[7]")
    public WebElement categoryIcons;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons')])[16]")
    public WebElement categoryIcons_Men;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons')])[16]")
    public WebElement categoryIcons_Women;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons/originals')])[3]")
    public WebElement categoryIcons_Men_Originals;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons/originals')])[3]")
    public WebElement categoryIcons_Women_Originals;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons/onyx-series')])[3]")
    public WebElement categoryIcons_Women_OnyxSeries;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons/onyx-series')])[3]")
    public WebElement categoryIcons_Men_OnyxSeries;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/icons/cloud')])[5]")
    public WebElement categoryIcons_Men_Cloud;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/icons/cloud')])[5]")
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

    @FindBy(xpath = "(//a[contains(@href,'/c/sale')])[2]")
    public WebElement categorySale;

    @FindBy(xpath = "(//a[contains(@href,'/c/women/sale')])[4]")
    public WebElement categorySale_Women;

    @FindBy(xpath = "(//a[contains(@href,'/c/men/sale')])[4]")
    public WebElement categorySale_Men;

    @FindBy(xpath = "(//a[contains(@href,'/c/kids/sale')])[4]")
    public WebElement categorySale_Kids;

    public void openCategoryNew() {
        wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(@href,'/c/new-arrivals')])[3]")));
        categoryNew.click();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/new-arrivals")));
    }

    public void openCategoryNew_LunarNY() {
        actions.moveToElement(categoryKids).pause(1000); //remove focus from "New" category
        actions.moveToElement(categoryNew).pause(1000);
        actions.moveToElement(categoryNew_LunarNY);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/lunar-new-year")));
    }

    public void openCategoryNew_Pleasures() {
        actions.moveToElement(categoryNew).pause(1000);
        actions.moveToElement(categoryNew_Pleasures);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/pleasures")));
    }

    public void openCategoryNew_NewArrivals() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryNew).pause(1000);
        actions.moveToElement(categoryNew_NewArrivals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/new-arrivals")));
    }

    public void openCategoryWomenENG() {
        wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(@href,'/c/women')])[37]")));
        categoryWomenENG.click();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women")));
    }

    public void openCategoryWomenNonENG() {
        wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(@href,'/c/women')])[36]")));
        categoryWomenNonENG.click();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women")));
    }

    public void openCategoryWomenENG_NewArrivals() {
        actions.moveToElement(categoryNew).pause(1000);
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_NewArrivals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/new-arrivals")));
    }

    public void openCategoryWomenNonENG_NewArrivals() {
        actions.moveToElement(categoryNew).pause(1000);
        actions.moveToElement(categoryWomenNonENG).pause(1000);
        actions.moveToElement(categoryWomen_NewArrivals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/new-arrivals")));
    }

    public void openCategoryWomenENG_NewArrivals_Sale() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_NewArrivals_Sale);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/sale")));
    }

    public void openCategoryWomenNonENG_NewArrivals_Sale() {
        actions.moveToElement(categoryWomenNonENG).pause(1000);
        actions.moveToElement(categoryWomen_NewArrivals_Sale);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/sale")));
    }

    public void openCategoryWomenENG_NewArrivals_Cloud() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_NewArrivals_Cloud);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/icons/cloud")));
    }

    public void openCategoryWomenNonENG_NewArrivals_Cloud() {
        actions.moveToElement(categoryWomenNonENG).pause(1000);
        actions.moveToElement(categoryWomen_NewArrivals_Cloud);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/icons/cloud")));
    }

    public void openCategoryWomenENG_NewArrivals_SherpaAndFleece() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_NewArrivals_SherpaAndFleece);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/clothing/Sherpa-and-Fleece")));
    }

    public void openCategoryWomenNonENG_NewArrivals_SherpaAndFleece() {
        actions.moveToElement(categoryWomenNonENG).pause(1000);
        actions.moveToElement(categoryWomen_NewArrivals_SherpaAndFleece);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/clothing/Sherpa-and-Fleece")));
    }

    public void openCategoryWomenENG_NewArrivals_LightweightDown() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_NewArrivals_LightweightDown);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/collections/lightweights")));
    }

    public void openCategoryWomenNonENG_NewArrivals_LightweightDown() {
        actions.moveToElement(categoryWomenNonENG).pause(1000);
        actions.moveToElement(categoryWomen_NewArrivals_LightweightDown);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/collections/lightweights")));
    }

    public void openCategoryWomenENG_NewArrivals_Bunny() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_NewArrivals_Bunny);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/collections/the-bunny")));
    }

    public void openCategoryWomenENG_NewArrivals_Puffers() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_NewArrivals_Puffers);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/outerwear/puffer-collection")));
    }

    public void openCategoryWomenENG_NewArrivals_ShopAll() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_NewArrivals_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/new-arrivals")));
    }

    public void openCategoryWomenENG_Icons() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Icons);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/icons")));
    }

    public void openCategoryWomenENG_Icons_Originals() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Icons_Originals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/icons/originals")));
    }

    public void openCategoryWomenENG_Icons_Cloud() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Icons_Cloud);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/icons/cloud")));
    }

    public void openCategoryWomenENG_Icons_GoldSeries() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Icons_GoldSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/icons/gold-series")));
    }

    public void openCategoryWomenENG_Icons_OnyxSeries() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Icons_OnyxSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/icons/onyx-series")));
    }

    public void openCategoryWomenENG_Icons_ShopAll() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Icons_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/icons")));
    }

    public void openCategoryWomenENG_Outerwear() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Outerwear);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/outerwear")));
    }

    public void openCategoryWomenENG_Outerwear_Bunny() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Outerwear_Bunny);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/collections/the-bunny")));
    }

    public void openCategoryWomenENG_Outerwear_LightweightJackets() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Outerwear_LightweightJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/outerwear/lightweights")));
    }

    public void openCategoryWomenENG_Outerwear_CoatsAndJackets() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Outerwear_CoatsAndJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/outerwear/coats-jackets")));
    }

    public void openCategoryWomenENG_Outerwear_Puffers() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Outerwear_Puffers);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/outerwear/puffer-collection")));
    }

    public void openCategoryWomenENG_Outerwear_BomberJackets() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Outerwear_BomberJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/outerwear/bomber-jackets")));
    }

    public void openCategoryWomenENG_Outerwear_Parkas() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Outerwear_Parkas);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/outerwear/parkas")));
    }

    public void openCategoryWomenENG_Outerwear_Vests() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Outerwear_Vests);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/outerwear/vests")));
    }

    public void openCategoryWomenENG_Outerwear_ShopAll() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Outerwear_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/outerwear")));
    }

    public void openCategoryWomenENG_Clothing() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Clothing);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/clothing")));
    }

    public void openCategoryWomenENG_Clothing_SherpaAndFleece() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Clothing_SherpaAndFleece);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/clothing/Sherpa-and-Fleece")));
    }

    public void openCategoryWomenENG_Clothing_SweatshirtsAndHoodies() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Clothing_SweatshirtsAndHoodies);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/clothing/sweatshirts-and-hoodies")));
    }

    public void openCategoryWomenENG_Clothing_PantsAndShorts() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Clothing_PantsAndShorts);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/clothing/trousers-and-shorts")));
    }

    public void openCategoryWomenENG_Clothing_ShopAll() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Clothing_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/clothing")));
    }

    public void openCategoryWomenENG_Accessories() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Accessories);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/accessories")));
    }

    public void openCategoryWomenENG_Accessories_BeaniesAndHats() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Accessories_BeaniesAndHats);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/accessories/hats-and-caps")));
    }

    public void openCategoryWomenENG_Accessories_WinterAccessories() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Accessories_WinterAccessories);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/accessories/beanies-and-scarves")));
    }

    public void openCategoryWomenENG_Accessories_Pet() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Accessories_Pet);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/pooch-knuckles")));
    }

    public void openCategoryWomenENG_Accessories_SocksBeltsAndBags() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Accessories_SocksBeltsAndBags);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/accessories/spring-accessories")));
    }

    public void openCategoryWomenENG_Accessories_ShopAll() {
        actions.moveToElement(categoryWomenENG).pause(1000);
        actions.moveToElement(categoryWomen_Accessories_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/accessories")));
    }

    public void openCategoryMenENG() {
        categoryMenENG.click();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men")));
    }

    public void openCategoryMenNonENG() {
        categoryMenNonENG.click();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men")));
    }

    public void openCategoryMenENG_NewArrivals() {
        actions.moveToElement(categoryNew).pause(1000);
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_NewArrivals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/new-arrivals")));
    }

    public void openCategoryMenENG_NewArrivals_Sale() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_NewArrivals_Sale);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/sale")));
    }

    public void openCategoryMenENG_NewArrivals_Cloud() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_NewArrivals_Cloud);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/icons/cloud")));
    }

    public void openCategoryMenENG_NewArrivals_SherpaAndFleece() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_NewArrivals_SherpaAndFleece);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/clothing/Sherpa-and-Fleece")));
    }

    public void openCategoryMenENG_NewArrivals_LightweightDown() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_NewArrivals_LightweightDown);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/collections/lightweights")));
    }

    public void openCategoryMenENG_NewArrivals_Bunny() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_NewArrivals_Bunny);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/collections/the-bunny")));
    }

    public void openCategoryMenENG_NewArrivals_Puffers() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_NewArrivals_Puffers);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/outerwear/puffer-collection")));
    }

    public void openCategoryMenENG_NewArrivals_ShopAll() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_NewArrivals_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/new-arrivals")));
    }

    public void openCategoryMenENG_Icons() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Icons);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/icons")));
    }

    public void openCategoryMenENG_Icons_Originals() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Icons_Originals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/icons/originals")));
    }

    public void openCategoryMenENG_Icons_Cloud() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Icons_Cloud);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/icons/cloud")));
    }

    public void openCategoryMenENG_Icons_GoldSeries() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Icons_GoldSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/icons/gold-series")));
    }

    public void openCategoryMenENG_Icons_OnyxSeries() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Icons_OnyxSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/icons/onyx-series")));
    }

    public void openCategoryMenENG_Icons_ShopAll() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Icons_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/icons")));
    }

    public void openCategoryMenENG_Outerwear() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Outerwear);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/outerwear")));
    }

    public void openCategoryMenENG_Outerwear_Bunny() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Outerwear_Bunny);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/collections/the-bunny")));
    }

    public void openCategoryMenENG_Outerwear_LightweightJackets() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Outerwear_LightweightJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/outerwear/lightweights")));
    }

    public void openCategoryMenENG_Outerwear_CoatsAndJackets() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Outerwear_CoatsAndJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/outerwear/coats-jackets")));
    }

    public void openCategoryMenENG_Outerwear_Puffers() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Outerwear_Puffers);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/outerwear/puffer-collection")));
    }

    public void openCategoryMenENG_Outerwear_BomberJackets() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Outerwear_BomberJackets);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/outerwear/bomber-jackets")));
    }

    public void openCategoryMenENG_Outerwear_Parkas() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Outerwear_Parkas);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/outerwear/parkas")));
    }

    public void openCategoryMenENG_Outerwear_Vests() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Outerwear_Vests);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/outerwear/vests")));
    }

    public void openCategoryMenENG_Outerwear_ShopAll() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Outerwear_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/outerwear")));
    }

    public void openCategoryMenENG_Clothing() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Clothing);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/clothing")));
    }

    public void openCategoryMenENG_Clothing_SherpaAndFleece() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Clothing_SherpaAndFleece);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/clothing/Sherpa-and-Fleece")));
    }

    public void openCategoryMenENG_Clothing_PolosAndTees() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Clothing_PolosAndTees);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/clothing/tees")));
    }

    public void openCategoryMenENG_Clothing_SweatshirtsAndHoodies() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Clothing_SweatshirtsAndHoodies);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/clothing/sweatshirts-and-hoodies")));
    }

    public void openCategoryMenENG_Clothing_PantsAndShorts() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Clothing_PantsAndShorts);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/clothing/trousers-and-shorts")));
    }

    public void openCategoryMenENG_Clothing_UnisexClothing() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Clothing_UnisexClothing);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/clothing/unisex-essentials")));
    }

    public void openCategoryMenENG_Clothing_ShopAll() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Clothing_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/clothing")));
    }

    public void openCategoryMenENG_Accessories() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Accessories);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/accessories")));
    }

    public void openCategoryMenENG_Accessories_BeaniesAndHats() {
        actions.moveToElement(categoryMenENG).pause(1000);
        actions.moveToElement(categoryMen_Accessories_BeaniesAndHats);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/accessories/hats-and-caps")));
    }

//    public void openCategoryMen_Accessories_WinterAccessories() {
//        actions.moveToElement(categoryMen).pause(1000);
//        actions.moveToElement(categoryMen_Accessories_WinterAccessories);
//        actions.click().build().perform();
//        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/accessories/beanies-and-scarves")));
//    }
//
//    public void openCategoryMen_Accessories_Pet() {
//        actions.moveToElement(categoryMen).pause(1000);
//        actions.moveToElement(categoryMen_Accessories_Pet);
//        actions.click().build().perform();
//        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/pooch-knuckles")));
//    }
//
//    public void openCategoryMen_Accessories_SocksBeltsAndBags() {
//        actions.moveToElement(categoryMen).pause(1000);
//        actions.moveToElement(categoryMen_Accessories_SocksBeltsAndBags);
//        actions.click().build().perform();
//        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/accessories/spring-accessories")));
//    }
//
//    public void openCategoryMen_Accessories_ShopAll() {
//        actions.moveToElement(categoryMen).pause(1000);
//        actions.moveToElement(categoryMen_Accessories_ShopAll);
//        actions.click().build().perform();
//        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/accessories")));
//    }
//
//    public void openCategoryKids() {
//        categoryKids.click();
//        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/kids")));
//    }
//
//    public void openCategoryKids_NewArrivals() {
//        actions.moveToElement(categoryMen).pause(1000);
//        actions.moveToElement(categoryKids).pause(1000);
//        actions.moveToElement(categoryKids_NewArrivals);
//        actions.click().build().perform();
//        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/kids/new-arrivals")));
//    }

    public void openCategoryKids_NewArrivals_Sale() {
        actions.moveToElement(categoryKids).pause(1000);
        actions.moveToElement(categoryKids_NewArrivals_Sale);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/kids/sale")));
    }

    public void openCategoryKids_NewArrivals_Originals() {
        actions.moveToElement(categoryKids).pause(1000);
        actions.moveToElement(categoryKids_NewArrivals_Originals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/kids/icons/originals")));
    }

    public void openCategoryKids_NewArrivals_Gold() {
        actions.moveToElement(categoryKids).pause(1000);
        actions.moveToElement(categoryKids_NewArrivals_Gold);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/kids/icons/gold")));
    }

    public void openCategoryKids_NewArrivals_Lightweights() {
        actions.moveToElement(categoryKids).pause(1000);
        actions.moveToElement(categoryKids_NewArrivals_Lightweights);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/kids/collections/lightweights")));
    }

    public void openCategoryKids_NewArrivals_ClothingAndAccessories() {
        actions.moveToElement(categoryKids).pause(1000);
        actions.moveToElement(categoryKids_NewArrivals_ClothingAndAccessories);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/kids/clothing-and-accessories")));
    }

    public void openCategoryKids_NewArrivals_ShopAll() {
        actions.moveToElement(categoryKids).pause(1000);
        actions.moveToElement(categoryKids_NewArrivals_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/kids/new-arrivals")));
    }

    public void openCategoryKids_Outerwear() {
        actions.moveToElement(categoryKids).pause(1000);
        actions.moveToElement(categoryKids_Outerwear);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/kids/outerwear")));
    }

    public void openCategoryKids_Outerwear_ShopAll() {
        actions.moveToElement(categoryKids).pause(1000);
        actions.moveToElement(categoryKids_Outerwear_ShopAll);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/kids/outerwear")));
    }

    public void openCategoryAccessories() {
        categoryAccessories.click();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/accessories")));
    }

    public void openCategoryAccessories_BeaniesAndHats() {
        categoryAccessories.click();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/accessories/hats-and-caps")));
    }

    public void openCategoryAccessories_WinterAccessories() {
        categoryAccessories.click();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/accessories/beanies-and-scarves")));
    }

    public void openCategoryAccessories_SocksBeltsAndBags() {
        categoryAccessories.click();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/accessories/spring-accessories")));
    }

    public void openCategoryAccessories_Pet() {
        categoryAccessories.click();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/pooch-knuckles")));
    }

    public void openCategoryAccessories_ShopAll() {
        categoryAccessories.click();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/accessories")));
    }

    public void openCategoryIcons() {
        categoryIcons.click();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/iconics")));
    }

    public void openCategoryIcons_Men() {
        actions.moveToElement(categoryKids).pause(1000);
        actions.moveToElement(categoryIcons).pause(1000);
        actions.moveToElement(categoryIcons_Men);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/icons")));
    }

    public void openCategoryIcons_Women() {
        actions.moveToElement(categoryIcons).pause(1000);
        actions.moveToElement(categoryIcons_Women);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/icons")));
    }

    public void openCategoryIcons_Men_Originals() {
        actions.moveToElement(categoryIcons).pause(1000);
        actions.moveToElement(categoryIcons_Men_Originals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/icons/originals")));
    }

    public void openCategoryIcons_Women_Originals() {
        actions.moveToElement(categoryIcons).pause(1000);
        actions.moveToElement(categoryIcons_Women_Originals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/icons/originals")));
    }

    public void openCategoryIcons_Originals() {
        actions.moveToElement(categoryIcons).pause(1000);
        actions.moveToElement(categoryIcons_Originals);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/iconics/originals")));
    }

    public void openCategoryIcons_Women_OnyxSeries() {
        actions.moveToElement(categoryIcons).pause(1000);
        actions.moveToElement(categoryIcons_Women_OnyxSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/icons/onyx-series")));
    }

    public void openCategoryIcons_Men_OnyxSeries() {
        actions.moveToElement(categoryIcons).pause(1000);
        actions.moveToElement(categoryIcons_Men_OnyxSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/icons/onyx-series")));
    }

    public void openCategoryIcons_OnyxSeries() {
        actions.moveToElement(categoryIcons).pause(1000);
        actions.moveToElement(categoryIcons_OnyxSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/icons/onyx-series")));
    }

    public void openCategoryIcons_Men_Cloud() {
        actions.moveToElement(categoryIcons).pause(1000);
        actions.moveToElement(categoryIcons_Men_Cloud);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/icons/cloud")));
    }

    public void openCategoryIcons_Women_Cloud() {
        actions.moveToElement(categoryIcons).pause(1000);
        actions.moveToElement(categoryIcons_Women_Cloud);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/icons/cloud")));
    }

    public void openCategoryIcons_Cloud() {
        actions.moveToElement(categoryIcons).pause(1000);
        actions.moveToElement(categoryIcons_Cloud);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/iconics/cloud")));
    }

    public void openCategoryIcons_Women_GoldSeries() {
        actions.moveToElement(categoryIcons).pause(1000);
        actions.moveToElement(categoryIcons_Women_GoldSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/icons/gold-series")));
    }

    public void openCategoryIcons_Men_GoldSeries() {
        actions.moveToElement(categoryIcons).pause(1000);
        actions.moveToElement(categoryIcons_Men_GoldSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/icons/gold-series")));
    }

    public void openCategoryIcons_GoldSeries() {
        actions.moveToElement(categoryIcons).pause(1000);
        actions.moveToElement(categoryIcons_GoldSeries);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/iconics/gold-series")));
    }

    public void openCategorySale() {
        categorySale.click();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/sale")));
    }

    public void openCategorySale_Women() {
        actions.moveToElement(categoryIcons).pause(1000);
        actions.moveToElement(categorySale).pause(1000);
        actions.moveToElement(categorySale_Women);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/women/sale")));
    }

    public void openCategorySale_Men() {
        actions.moveToElement(categorySale).pause(1000);
        actions.moveToElement(categorySale_Men);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/men/sale")));
    }

    public void openCategorySale_Kids() {
        actions.moveToElement(categorySale).pause(1000);
        actions.moveToElement(categorySale_Kids);
        actions.click().build().perform();
        Assert.assertTrue(wait.withTimeout(Duration.ofSeconds(1)).until(ExpectedConditions.urlContains("/c/kids/sale")));
    }
}