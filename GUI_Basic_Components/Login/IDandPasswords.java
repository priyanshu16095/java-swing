package GUI_Basic_Components.Login;

import java.util.HashMap;
import java.util.Map;

public class IDandPasswords {
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    IDandPasswords() {
        loginInfo.put("Priyanshu", "root");
        loginInfo.put("priyanshu", "root");
        loginInfo.put("Ram", "ram123");
        loginInfo.put("ram", "root");
        loginInfo.put("Bro", "bro123");
    } 
    HashMap getLoginInfo() {
        return loginInfo;
    }
}
