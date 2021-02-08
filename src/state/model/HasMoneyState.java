package state.model;

public class HasMoneyState implements State {

    SodaVendingMachine sodaVendingMachine;

    public HasMoneyState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("no need to insert another money");
    }

    @Override
    public void ejectMoney() {
        System.out.println("returning your money");
        sodaVendingMachine.setState(sodaVendingMachine.getNoMoneyState());
    }

    @Override
    public void select() {
        System.out.println("selected item...");
        sodaVendingMachine.setState(sodaVendingMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("no soda dispensed");
    }

    @Override
    public String toString() {
        return "waiting for selection";
    }
}
