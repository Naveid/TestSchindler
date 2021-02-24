import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.*;
import java.util.Iterator;
import java.util.Set;

public class test {
    WebDriver driver;
    inventoryPage inventory;
    checkoutPage check;

    public test() {
    }

    public test(WebDriver driver) {
        this.driver = driver;
    }

    @BeforeSuite
    public void invokeDriver() {
        driver = new ChromeDriver();
        inventory=new inventoryPage(driver);
        check=new checkoutPage(driver);

    }


    @BeforeTest
    public void openWebPage() {
        driver.get("http://automationpractice.com");
        inventory = PageFactory.initElements(driver,inventoryPage.class);
    }


//    @Test
//    public void click() {
//        inventory.VwaitElementVisible(inventory.link);
//        inventory.link.click();
   // }

//    @Test( groups = "login")
//    public void click() {
//        abcd.link2.click();
//        abcd.link.click();
//        WebDriverWait wait1 = new WebDriverWait(driver, 30);
//        wait1.until(ExpectedConditions.visibilityOf(abcd.link3));
//        abcd.link3.click();
//    }

    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }
}
