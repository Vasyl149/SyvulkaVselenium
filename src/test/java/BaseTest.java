import driver.BrowserInstance;
import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import page.common.Header;
import page.common.MainMenuList;
import page_bo.LoginPageBO;
import page_bo.MainMenuBO;

import java.io.*;
import java.time.Duration;

import static config.ConfManager.conf;

public abstract class BaseTest {

    @BeforeClass
    @Parameters("browser")
    public void preCondition(String browser) {
        WebDriver driver = new BrowserInstance().createInstance(browser);
        DriverManager.setDriver(driver);

        DriverManager.getDriver().get(conf().url());

        LoginPageBO loginPageBO = new LoginPageBO();
        loginPageBO.logIn().
                clickContinue().getComposeButton();


        MainMenuBO mainMenuBO = new MainMenuBO();
        Assert.assertTrue(mainMenuBO.getComposeButton());
    }

    @AfterClass
    public void postCondition() throws IOException {
        Header header = new Header();
        header.controlButton();
        header.logoutButton();
        DriverManager.quit();
    }


}
