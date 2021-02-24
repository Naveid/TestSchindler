import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class BeTest {

    @Test
    public void print(){
        System.out.println("test run");

    }
    @Test(dataProvider = "naveid")
    public void add(String name,String country){
        System.out.println(name+country);
        Assert.assertEquals("abc",name+country);


    }
    @Test(dependsOnMethods = {"add"} )
    public void checkdp(){
        add("a","bc");

    }

//    public void check() {
//
//        Set<String> window = driver.getWindowHandles();
//        Iterator<String> itr = window.iterator();
//        String ParentWindow = itr.next();
//        for (String value : window) {
//            driver.switchTo().window(value);
//        }
//
//        Actions a = new Actions(driver);
//        a.contextClick(abcd.link).click().perform();
//        a.moveToElement(abcd.link2).perform();
//        Alert bh = driver.switchTo().alert();
//        bh.dismiss();
//        Select sel = new Select(driver.findElement(By.xpath("")));
//        List<WebElement> drop= sel.getOptions();
//        for(WebElement ab : drop){
//            ab.getText();
//        }
//        sel.selectByIndex(1);
//
//    }
    @DataProvider(name = "naveid")
    public static Object[][] getdata(){return new Object[][]{
            {"guru","India"}};
    }
}
