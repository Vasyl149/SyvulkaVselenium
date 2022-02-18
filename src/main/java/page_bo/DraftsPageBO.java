package page_bo;

import org.testng.Assert;
import page.main.DraftsPage;

public class DraftsPageBO extends MainMenuBO {
    DraftsPage draftsPage = new DraftsPage();

    public DraftsPageBO verifySendDraft() throws InterruptedException {
        draftsPage.firstDraft();
        draftsPage.sendButton();
        draftsPage.closeAlert();
        draftsPage.emailField();
        Thread.sleep(1000);
        draftsPage.sendButton();
        Thread.sleep(4000);
        Assert.assertTrue(draftsPage.confirmMessage().isDisplayed());
        return this;
    }
}
