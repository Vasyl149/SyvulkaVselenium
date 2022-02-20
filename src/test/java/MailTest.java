import org.testng.annotations.Test;
import page_bo.MainMenuBO;


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

        new MainMenuBO().draftButton().
                verifySendDraft();

        new MainMenuBO().sentButton().
                verifySentMail();
    }


//    @Test(dependsOnMethods = "newMailWithoutRecipientTest")
//    public void sendDraftTest() throws InterruptedException {
//        new MainMenuBO().draftButton().
//                verifySendDraft();
//    }
//
//
//    @Test(dependsOnMethods = "sendDraftTest")
//    public void sentItems() {
//        new MainMenuBO().sentButton().
//                verifySentMail();
//    }

}
