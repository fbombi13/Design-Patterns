package WithoutPOM;

public class Test2 {

    public static void main(String[] args) {
        TestForgot();
    }

    public static void TestForgot() {

        String userLocator = "Test";
        String password = "Ajiaco1";
        OpenPage(userLocator,password);
        ForgotPassword(userLocator,password);
    }

    public static void OpenPage(String user,String password){
        //Do something
    }

    public static void Login(String user,String password){
        //Do something
    }

    public static void ForgotPassword(String user,String password){
        //Do something
        String ForgotPasswordButton= "Click";
    }
}
