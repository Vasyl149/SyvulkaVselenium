package page_bo.loginPageBO;

import page.login.LoginPage;
import page_bo.GeneralBO.GeneralBO;
import page_bo.MainMenuBO;

public class LoginPageBO extends GeneralBO {
    LoginPage loginPage = new LoginPage();

    public LoginPageBO logIn() {

        loginPage.setCredentials();
        logger.info("Fill login and password");
        return this;
    }

    public MainMenuBO clickContinue(){
        loginPage.clickContinue();
        logger.info("Click 'Continue' button");
        return new MainMenuBO();
    }


}
