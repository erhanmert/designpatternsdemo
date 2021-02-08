package proxy;

public class RealBank implements Bank {
    @Override
    public void withdrawMoney(String clientName) throws Exception {
        System.out.println("withdrawing from the atm");
    }
}
