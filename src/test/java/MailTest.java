import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.common.MainMenuList;
import page.main.*;
import page_bo.EmailComposePageBO;
import page_bo.MainMenuBO;

import static config.ConfManager.conf;


public class MailTest extends BaseTest {


    @Test
    public void newMailWithoutRecipientTest() throws InterruptedException {
        int draftsNumber = new MainMenuBO().getDraftsNumber();
        System.out.println(draftsNumber);

        new MainMenuBO().openComposePage().
                createNewMail().
                verifyStyleEditingElements().
                verifyFontsInDropdown().
                verifyFileAddition().
                clickUnreadButton();

        int newDraftsNumber = new MainMenuBO().getDraftsNumber();

        new MainMenuBO().verifyDraftsNumber(newDraftsNumber, draftsNumber);


    }


    @Test(dependsOnMethods = "newMailWithoutRecipientTest")
    public void sendDraftTest() throws InterruptedException {
        new MainMenuBO().draftButton().
                verifySendDraft();
    }


    @Test(dependsOnMethods = "sendDraftTest")
    public void sentItems() {
        new MainMenuBO().sentButton().
                verifySentEmail();
    }

}
