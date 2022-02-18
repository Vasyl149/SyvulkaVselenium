import org.testng.annotations.Test;
import page_bo.InboxPageBO;
import page_bo.MainMenuBO;

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
