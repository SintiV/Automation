//package ProductionSmokeTest;
//
//import io.qameta.allure.Description;
//import io.qameta.allure.Owner;
//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//public class LocaleSwitcherPopupTests extends BaseTest {
//
//    @Test
//    @Order(1)
//    @DisplayName("Switch to CA-ENG locale on the site launch")
//    @Description("Ensure that the user can switch to CA-ENG locale on the site launch.\nVerify that the locale switcher button in navbar contains text 'CANADA (CAD) | ENGLISH' text, the site URL and title are correct")
//    @Owner("Sintija Vanaga")
//    public void LaunchCanadaEnglishLocaleTest() {
//        localeSwitcherOnSiteLaunch.LaunchCA_EN.click();
//
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Assert.assertTrue(wait.until(ExpectedConditions.textToBe(By.xpath("(//span[@class='text-white uppercase font-bold language-highlighter'])[1]"),
//                "CANADA (CAD) | ENGLISH")), "Locale switcher button text is incorrect");
//        Assert.assertEquals("https://www.mooseknucklescanada.com/ca-en", driver.getCurrentUrl());
//        Assert.assertEquals("Moose Knuckles | Official Website | Outerwear & Clothing", driver.getTitle());
//    }
//
//    @Test
//    @Order(2)
//    @DisplayName("Switch to CA-FR locale on the site launch")
//    @Description("Ensure that the user can switch to CA-FR locale on the site launch.\nVerify that the locale switcher button in navbar contains text 'CANADA (CAD) | FRANÇAIS' text, the site URL and title are correct")
//    @Owner("Sintija Vanaga")
//    public void LaunchCanadaFrenchLocaleTest() {
//        localeSwitcherOnSiteLaunch.LaunchCA_FR.click();
//
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Assert.assertTrue(wait.until(ExpectedConditions.textToBe(By.xpath("(//span[@class='text-white uppercase font-bold language-highlighter'])[1]"),
//                "CANADA (CAD) | FRANÇAIS")), "Locale switcher button text is incorrect");
//        Assert.assertEquals("https://www.mooseknucklescanada.com/ca-fr", driver.getCurrentUrl());
//        Assert.assertEquals("Moose Knuckles | Site officiel | Vêtements d'hiver et vêtements d'extérieur canadiens", driver.getTitle());
//    }
//
//    @Test
//    @Order(3)
//    @DisplayName("Switch to USA locale on the site launch")
//    @Description("Ensure that the user can switch to CA-FR locale on the site launch.\nVerify that the locale switcher button in navbar contains text 'USA (USD) | ENGLISH' text, the site URL and title are correct")
//    @Owner("Sintija Vanaga")
//    public void LaunchUSALocaleTest() {
//        localeSwitcherOnSiteLaunch.LaunchUSA.click();
//
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Assert.assertTrue(wait.until(ExpectedConditions.textToBe(By.xpath("(//span[@class='text-white uppercase font-bold language-highlighter'])[1]"),
//                "USA (USD) | ENGLISH")), "Locale switcher button text is incorrect");
//        Assert.assertEquals("https://www.mooseknucklescanada.com/us-en", driver.getCurrentUrl());
//        Assert.assertEquals("Moose Knuckles | Official Website | Outerwear & Clothing", driver.getTitle());
//    }
//
//    @Test
//    @Order(4)
//    @DisplayName("Switch to UK locale on the site launch")
//    @Description("Ensure that the user can switch to UK locale on the site launch.\nVerify that the locale switcher button in navbar contains text 'UK (GBP) | ENGLISH' text, the site URL and title are correct")
//    @Owner("Sintija Vanaga")
//    public void LaunchUKLocaleTest() {
//        localeSwitcherOnSiteLaunch.LaunchUK.click();
//
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Assert.assertTrue(wait.until(ExpectedConditions.textToBe(By.xpath("(//span[@class='text-white uppercase font-bold language-highlighter'])[1]"),
//                "UK (GBP) | ENGLISH")), "Locale switcher button text is incorrect");
//        Assert.assertEquals("https://www.mooseknucklescanada.com/gb-en", driver.getCurrentUrl());
//        Assert.assertEquals("Moose Knuckles Official Site | Outerwear & Clothing", driver.getTitle());
//    }
//
//    @Test
//    @Order(5)
//    @DisplayName("Switch to EU-DE locale on the site launch")
//    @Description("Ensure that the user can switch to EU-DE locale on the site launch.\nVerify that the locale switcher button in navbar contains text 'EUROPE (EUR) | DEUTSCH' text, the site URL and title are correct")
//    @Owner("Sintija Vanaga")
//    public void LaunchEuropeGermanLocaleTest() {
//        localeSwitcherOnSiteLaunch.LaunchEU_DE.click();
//
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Assert.assertTrue(wait.until(ExpectedConditions.textToBe(By.xpath("(//span[@class='text-white uppercase font-bold language-highlighter'])[1]"),
//                "EUROPE (EUR) | DEUTSCH")), "Locale switcher button text is incorrect");
//        Assert.assertEquals("https://www.mooseknucklescanada.com/eu-de", driver.getCurrentUrl());
//        Assert.assertEquals("Moose Knuckles | Offizielle Website | Winterkleidung und Outerwear", driver.getTitle());
//    }
//
//    @Test
//    @Order(6)
//    @DisplayName("Switch to EU-ENG locale on the site launch")
//    @Description("Ensure that the user can switch to EU-ENG locale on the site launch.\nVerify that the locale switcher button in navbar contains text 'EUROPE (EUR) | ENGLISH' text, the site URL and title are correct")
//    @Owner("Sintija Vanaga")
//    public void LaunchEuropeEnglishLocaleTest() {
//        localeSwitcherOnSiteLaunch.LaunchEU_EN.click();
//
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Assert.assertTrue(wait.until(ExpectedConditions.textToBe(By.xpath("(//span[@class='text-white uppercase font-bold language-highlighter'])[1]"),
//                "EUROPE (EUR) | ENGLISH")), "Locale switcher button text is incorrect");
//        Assert.assertEquals("https://www.mooseknucklescanada.com/eu-en", driver.getCurrentUrl());
//        Assert.assertEquals("Moose Knuckles Official Site | Outerwear & Clothing", driver.getTitle());
//    }
//
//    @Test
//    @Order(7)
//    @DisplayName("Switch to EU-FR locale on the site launch")
//    @Description("Ensure that the user can switch to EU-FR locale on the site launch.\nVerify that the locale switcher button in navbar contains text 'EUROPE (EUR) | FRANÇAIS' text, the site URL and title are correct")
//    @Owner("Sintija Vanaga")
//    public void LaunchEuropeFrenchLocaleTest() {
//        localeSwitcherOnSiteLaunch.LaunchEU_FR.click();
//
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Assert.assertTrue(wait.until(ExpectedConditions.textToBe(By.xpath("(//span[@class='text-white uppercase font-bold language-highlighter'])[1]"),
//                "EUROPE (EUR) | FRANÇAIS")), "Locale switcher button text is incorrect");
//        Assert.assertEquals("https://www.mooseknucklescanada.com/eu-fr", driver.getCurrentUrl());
//        Assert.assertEquals("Moose Knuckles | Site officiel | Vêtements d'hiver et vêtements d'extérieur canadiens", driver.getTitle());
//    }
//}
