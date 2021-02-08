package proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank {
    private RealBank realBank = new RealBank();
    private static List<String> bannedClients;

    static {
        bannedClients = new ArrayList<>();
        bannedClients.add("xxcs");
        bannedClients.add("me@me");
        bannedClients.add("@xmil.com");
    }
    @Override
    public void withdrawMoney(String clientName) throws Exception {
        if (bannedClients.contains(clientName.toLowerCase())){
            throw new Exception("Access denied");
        }

        realBank.withdrawMoney(clientName);
    }
}
