import org.testng.annotations.Test;
import page_bo.main_pages.InboxPageBO;
import page_bo.main_pages.commonBO.MainMenuBO;

public class LeftMenuTest extends BaseTest {

    @Test
    public void menuListTest2() throws InterruptedException {

        int unreadLetters = new InboxPageBO().
                verifyUnreadLettersPresent().
                getUnreadLettersNumber();

        new MainMenuBO().verifyInboxIsSelected()
                .verifyNavigationMenu().
                verifyUnreadLettersNumber(unreadLetters);

    }

}
