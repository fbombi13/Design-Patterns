package WithoutPOM;

public class Test1 {

    public static void main(String[] args) {
        LoginTest();
    }

    public static void LoginTest() {

        String userLocator = "Test";
        String password = "Ajiaco1";
        OpenPage(userLocator,password);
        ClickOnButton(userLocator,password);
    }

    public static void OpenPage(String user,String password){
        //Do something
    }

    public static void ClickOnButton(String user,String password){
        //Do something
        String LoginButton= "Click";
    }

    public static void ForgotPassword(String user,String password){
        //Do something
        String ForgotPasswordButton= "Click";
    }
}
