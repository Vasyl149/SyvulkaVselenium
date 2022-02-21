package page_bo;

import org.testng.Assert;
import page.main.SentItemsPage;

import static config.ConfigManager.conf;

public class SentPageBO extends MainMenuBO {
    SentItemsPage sentItemsPage = new SentItemsPage();

    public void verifySentMail() {
        logger.info("Verify sent mail");
        Assert.assertTrue(sentItemsPage.getSentItemEmail().equals(conf().testemail()));
    }
}
