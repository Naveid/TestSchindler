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
import java.io.FileReader;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;


public class test {
    WebDriver driver;

    inventoryPage inventory;
    checkoutPage check;
    Properties prop;



    public test() {
    }

    public test(WebDriver driver) {
        this.driver = driver;
    }

    @BeforeSuite
    public void invokeDriver() throws Exception{
        FileReader reader=new FileReader("./src/utils/general.properties");
        Properties p=new Properties();
        p.load(reader);
        this.prop=p;
        System.setProperty("webdriver.chrome.driver",
                p.getProperty("chromepath" ));
        driver = new ChromeDriver();
        inventory=new inventoryPage(driver);
        check=new checkoutPage(driver);

    }


    @BeforeTest
    public void openWebPage() {
        driver.get("http://automationpractice.com");
        inventory = PageFactory.initElements(driver,inventoryPage.class);
    }



    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }
}
