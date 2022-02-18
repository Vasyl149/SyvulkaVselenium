package page;

import driver.DriverManager;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public abstract class AbstractPageObject {

    protected AbstractPageObject(){
        initElements(new AjaxElementLocatorFactory(DriverManager.getDriver(),3), this);
    }
}
