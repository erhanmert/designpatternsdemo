package proxy;

public class Main {

    public static void main(String [] args){
        Bank bank = new ProxyBank();

        try {
            bank.withdrawMoney("erhan");
            bank.withdrawMoney("xXcs");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
