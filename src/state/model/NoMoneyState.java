package state.model;

public class NoMoneyState implements State {

    SodaVendingMachine sodaVendingMachine;

    public NoMoneyState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("you insert money");
        sodaVendingMachine.setState(sodaVendingMachine.getHasMoneyState());
    }

    @Override
    public void ejectMoney() {
        System.out.println("you have not inserted money");
    }

    @Override
    public void select() {
        System.out.println("there is no money");
    }

    @Override
    public void dispense() {
        System.out.println("pay first");
    }

    @Override
    public String toString() {
        return "waiting for money...";
    }
}
