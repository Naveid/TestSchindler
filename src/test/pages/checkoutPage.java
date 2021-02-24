import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;

public class checkoutPage {
    WebDriver driver;

    public checkoutPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//span[.='Your shopping cart']")
    WebElement CartLabel;
    @FindBy(xpath = "//a[.='Faded Short Sleeve T-shirts']")
    WebElement productName;
    @FindBy(xpath = "//a[.='Color : Orange, Size : S']")
    WebElement productColor;
    @FindBy(xpath = "//input[@class='cart_quantity_input form-control grey']")
WebElement productQuantity;
    @FindBy(xpath = "//td[@class='cart_unit']/span[@class='price']")
    WebElement productperunitprice;



    public void VwaitElementVisible(WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void VwaitElementClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.elementToBeClickable(element));


    }
}
