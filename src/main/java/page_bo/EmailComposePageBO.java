package page_bo;

import org.testng.Assert;
import page.main.EmailComposePage;

public class EmailComposePageBO extends MainMenuBO {
    EmailComposePage emailComposePage = new EmailComposePage();

    public EmailComposePageBO createNewMail(){
        emailComposePage.boldButton();
        emailComposePage.italicButton();
        emailComposePage.textArea();
        emailComposePage.textField();
        return this;

    }

    public EmailComposePageBO verifyStyleEditingElements(){
        Assert.assertEquals(emailComposePage.fontStyle(), "italic");
        Assert.assertEquals(emailComposePage.fontWeight(), "700");
        return this;
    }

    public EmailComposePageBO verifyFontsInDropdown(){
        emailComposePage.switchToParentFrame();
        emailComposePage.fontDropdown();
        emailComposePage.fontList().forEach(font -> Assert.assertTrue(font.isDisplayed()));
        return this;
    }

    public EmailComposePageBO verifyFileAddition(){
        emailComposePage.fileInput();
        return this;
    }

    public UnreadPageBO clickUnreadButton() throws InterruptedException {
        Thread.sleep(3000);
        mainMenuList.unreadButton();
        return new UnreadPageBO();
    }


}
