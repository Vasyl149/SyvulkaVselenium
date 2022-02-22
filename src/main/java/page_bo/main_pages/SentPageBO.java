package page_bo.main_pages;

import org.testng.Assert;
import page.main.SentItemsPage;
import page_bo.main_pages.commonBO.MainMenuBO;

import static config.ConfigManager.conf;

public class SentPageBO extends MainMenuBO {
    SentItemsPage sentItemsPage = new SentItemsPage();

    public void verifySentMail() throws InterruptedException {
        logger.info("Verify sent mail");
        Thread.sleep(5000);
        logger.info(sentItemsPage.getSentItemEmail().equals(conf().testemail()));
        Assert.assertTrue(sentItemsPage.getSentItemEmail().equals(conf().testemail()));
    }
}
