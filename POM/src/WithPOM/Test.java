package WithPOM;

import WithPOM.Elements.LoginPage;

public class Test {

    public static void main(String[] args) {
        ForgotPasswordTest();
    }

    public static void ForgotPasswordTest() {

        String userData = "Test";
        String passwordData = "Ajiaco1";
        LoginPage loginPage = new LoginPage();
        loginPage.OpenPage(userData, passwordData);
        loginPage.ClickOnButton(userData, passwordData);
        loginPage.ForgotPassword(userData, passwordData);
    }

}
