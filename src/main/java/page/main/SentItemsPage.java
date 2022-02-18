package page.main;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.AbstractPageObject;

import static config.ConfManager.conf;

public class SentItemsPage extends AbstractPageObject {
    //@FindBy(css = "[data-email='"+ conf().testemail() +"']")
    @FindBy(css = "[data-email='syvulkav@gmail.com']")
    private WebElement sentItemEmail;

    @FindBy(xpath = "//a[@class='msglist__row-address-name']/span")
    private WebElement sentItem;

    @Step
    public WebElement sentItemEmail() {
        return sentItemEmail;
    }

    @Step
    public String getSentItemEmail() {
        return sentItem.getText();
    }
}
