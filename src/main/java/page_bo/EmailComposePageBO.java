package page_bo;

import org.testng.Assert;
import page.main.EmailComposePage;

public class EmailComposePageBO extends MainMenuBO {
    EmailComposePage emailComposePage = new EmailComposePage();

    public EmailComposePageBO createNewMail(){
        logger.info("Edit font style");
        emailComposePage.boldButton();
        emailComposePage.italicButton();
        logger.info("Switch to textarea frame");
        emailComposePage.textArea();
        logger.info("send text to textarea");
        emailComposePage.textField();
        return this;

    }

    public EmailComposePageBO verifyStyleEditingElements(){
        logger.info("Verify the style of the elements");
        Assert.assertEquals(emailComposePage.fontStyle(), "italic");
        Assert.assertEquals(emailComposePage.fontWeight(), "700");
        return this;
    }

    public EmailComposePageBO verifyFontsInDropdown(){
        logger.info("Switch to parent frame");
        emailComposePage.switchToParentFrame();
        emailComposePage.fontDropdown();
        logger.info("Verify fonts in the dropdown");
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
