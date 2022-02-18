package page_bo;

import fileReader.Reader;
import org.testng.Assert;
import page.common.MainMenuList;

import java.util.ArrayList;
import java.util.List;

public class MainMenuBO {
    MainMenuList mainMenuList = new MainMenuList();

    public EmailComposePageBO openComposePage(){
        mainMenuList.composeButton();
        return new EmailComposePageBO();
    }

    public DraftsPageBO draftButton() {
        mainMenuList.draftsButton();
        return new DraftsPageBO();
    }

    public SentPageBO sentButton() {
        mainMenuList.sentItemsButton();
        return new SentPageBO();
    }

    public boolean getComposeButton() {
        return mainMenuList.getComposeButton().isDisplayed();
    }


    public MainMenuBO verifyInboxIsSelected(){
        // Check if 'вхідні' tab is selected
        Assert.assertTrue(mainMenuList.inboxTab().getAttribute("Class").contains("current"));
        return this;
    }

    public MainMenuBO verifyNavigationMenu(){
        // Check if menu list contains 8 items
        Assert.assertEquals(mainMenuList.menuList2().size(), 8);
        // Check if menu consist of  'Вхідні', 'Чернетки', 'Надіслані', 'Спам' etc.
        List<String> menuListNames = new ArrayList<>();
        mainMenuList.menuList2().forEach(el -> menuListNames.add(el.getText()));
        Reader reader = new Reader();
        Assert.assertTrue(reader.readFile().equals(menuListNames));
        //Check if icons are displayed
        mainMenuList.iconList().forEach(ic -> Assert.assertTrue(ic.isDisplayed()));
        return this;
    }

    public MainMenuBO verifyUnreadLettersNumber(int expectedNumber){
        //Check if message counter is equal to the number of messages
        Assert.assertTrue(mainMenuList.counter().equals(String.valueOf(expectedNumber)));
        return this;
    }

    public int getDraftsNumber(){
        return mainMenuList.countOfDrafts();
    }

    public UnreadPageBO verifyDraftsNumber(int newValue, int oldValue){
        Assert.assertTrue(newValue==(oldValue+1));
        return new UnreadPageBO();
    }
}
