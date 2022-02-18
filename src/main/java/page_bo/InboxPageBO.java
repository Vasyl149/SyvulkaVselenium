package page_bo;

import org.testng.Assert;
import page.main.InboxPage;

public class InboxPageBO {
    InboxPage inboxPage = new InboxPage();

    public int getUnreadLettersNumber(){
        return inboxPage.unreadMailList().size();
    }



    public InboxPageBO verifyUnreadLettersPresent() throws InterruptedException {
        //Check if there are new emails in the mailbox
        Assert.assertTrue(inboxPage.unreadMailList().size() > 0);
        return this;
    }
}
