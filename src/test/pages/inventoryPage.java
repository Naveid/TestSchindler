import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class inventoryPage {

        WebDriver driver;
        public inventoryPage(WebDriver driver) {
            this.driver = driver;
        }
        @FindBy(xpath = "(//a[.='T-shirts'])[2]")
        WebElement link;
        @FindBy(xpath= "//div[@class='product-container']" )
        WebElement link2;
        @FindBy(xpath = "//span[.='Add to cart']")
        WebElement link3;
        @FindBy(xpath = "//span[@title='Continue shopping']")
        WebElement Button;
        @FindBy(xpath = "//a[@title='Proceed to checkout']")
        WebElement Button1;
        @FindBy(xpath = "(//a[@class='product-name'])[3]")
        WebElement ProductName;

        public void click(){
            System.out.println(link.getText());

        }
        public void VwaitElementVisible(WebElement element){

            WebDriverWait wait = new WebDriverWait(driver,100);
            wait.until(ExpectedConditions.visibilityOf(element));
        }
        public  void  VwaitElementClickable(WebElement element){
            WebDriverWait wait = new WebDriverWait(driver,100);
            wait.until(ExpectedConditions.elementToBeClickable(element));

        }

    }


