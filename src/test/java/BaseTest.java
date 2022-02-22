import driver.BrowserInstance;
import driver.DriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import page_bo.main_pages.commonBO.MainMenuBO;
import page_bo.main_pages.loginPageBO.LoginPageBO;

import static config.ConfigManager.conf;

public abstract class BaseTest {
    protected static final Logger logger = Logger.getLogger(MainMenuBO.class);
     private final String browser = "Edge";
    //private final String browser = System.getProperty("environment");

    @BeforeMethod
    @Parameters("browser")
    public void preCondition() {
        WebDriver driver = new BrowserInstance().createInstance(browser);
        DriverManager.setDriver(driver);
        DriverManager.getDriver().get(conf().url());

        new LoginPageBO().logIn();
    }

    @AfterMethod
    public void postCondition() {
        DriverManager.quit();
    }


}
