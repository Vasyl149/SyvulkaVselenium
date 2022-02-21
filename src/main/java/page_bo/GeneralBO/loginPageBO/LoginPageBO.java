package page_bo.GeneralBO.loginPageBO;

import page.login.LoginPage;
import page_bo.GeneralBO.GeneralBO;

public class LoginPageBO extends GeneralBO {
    LoginPage loginPage = new LoginPage();

    public void logIn(){
        loginPage.setCredentials();
        logger.info("Fill login and password");
        loginPage.clickContinue();
        logger.info("Click 'Continue' button");
    }


}
