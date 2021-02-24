import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class checkout extends test {
    //checkoutPage check = new checkoutPage(driver);
    String productname = "";

    @Test
    public void testLabel() {
        check = PageFactory.initElements(driver, checkoutPage.class);
        check.VwaitElementVisible(check.CartLabel);
        Assert.assertEquals(check.CartLabel.getText(),"Your shopping cart");
        Assert.assertEquals(check.productName.getText(),"Faded Short Sleeve T-shirts");
        //Assert.assertEquals(check.productName.getText(),productname);
        String color = check.productColor.getText();
        Assert.assertTrue(color.contains("Orange"));
        Assert.assertEquals(check.productQuantity.getAttribute("value"),"2");
        Assert.assertEquals(check.productperunitprice.getText(),"$16.51");
    }

        @BeforeMethod
        public void addProduct() throws Exception{
            inventory = PageFactory.initElements(driver,inventoryPage.class);
            inventory.VwaitElementVisible(inventory.link);
            inventory.link.click();

            inventory.VwaitElementVisible(inventory.link2);
            Actions actions = new Actions(driver);
            actions.moveToElement(inventory.link2).perform();
            //this.productname = inventory.ProductName.getText();
            //System.out.println(inventory.ProductName.getText());
            Thread.sleep(1000);
            inventory.VwaitElementVisible(inventory.link3);
            inventory.link3.click();
            System.out.println("adding product 1");
            inventory.VwaitElementVisible(inventory.Button);
            inventory.Button.click();
            actions.moveToElement(inventory.link2).perform();
            inventory.VwaitElementClickable(inventory.link3);
            System.out.println("adding product 2");
            inventory.link3.click();
            Thread.sleep(1000);
            inventory.VwaitElementClickable(inventory.Button1);
            Assert.assertEquals(inventory.Button1.getText(),"Proceed to checkout","not matching");
            inventory.VwaitElementVisible(inventory.Button1);
            inventory.Button1.click();
            System.out.println("Product added to cart");
            Thread.sleep(1000);
        }



    }

