import driver.BrowserInstance;
import driver.DriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page_bo.MainMenuBO;
import page_bo.loginPageBO.LoginPageBO;

import static config.ConfManager.conf;

public abstract class BaseTest {
    protected static final Logger logger = Logger.getLogger(MainMenuBO.class);
   // private final String env = "Chrome";
    private  final String browser = System.getProperty("environment");
    @BeforeMethod
 //     @Parameters("browser")
    public void preCondition() {
        WebDriver driver = new BrowserInstance().createInstance(browser);
        DriverManager.setDriver(driver);

        DriverManager.getDriver().get(conf().url());

        LoginPageBO loginPageBO = new LoginPageBO();
        loginPageBO.logIn().
                clickContinue().getComposeButton();


        MainMenuBO mainMenuBO = new MainMenuBO();
        Assert.assertTrue(mainMenuBO.getComposeButton());
    }

    @AfterMethod
    public void postCondition() {
        DriverManager.quit();
    }


}
