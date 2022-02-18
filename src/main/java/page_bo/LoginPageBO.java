package page_bo;

import page.login.LoginPage;

public class LoginPageBO {
    LoginPage loginPage = new LoginPage();

    public LoginPageBO logIn() {

        loginPage.setCredentials();
        return this;
    }

    public MainMenuBO clickContinue(){
        loginPage.clickContinue();
        return new MainMenuBO();
    }


}
