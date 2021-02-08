package state.model;

public class SoldState implements State {

    SodaVendingMachine sodaVendingMachine;

    public SoldState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("soda is coming");
    }

    @Override
    public void ejectMoney() {
        System.out.println("sorry soda is comming");
    }

    @Override
    public void select() {
        System.out.println("nope you can not eject  money");
    }

    @Override
    public void dispense() {
        System.out.println("stop tryin to get second soda for free");
        if(sodaVendingMachine.getCount() > 0){
            sodaVendingMachine.setState(sodaVendingMachine.getNoMoneyState());
        }else{
            System.out.println("sorry out of soda");
            sodaVendingMachine.setState(sodaVendingMachine.getSoldOutState());
        }
    }
}
