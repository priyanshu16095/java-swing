package GUI_Basic_Components.Login;

public class main {
    public static void main(String[] args) {
        IDandPasswords idandPasswords = new IDandPasswords();
        login loginPage = new login(idandPasswords.getLoginInfo());
    }   
}
