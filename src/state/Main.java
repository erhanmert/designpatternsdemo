package state;

import state.antipattern.SodaMachine;
import state.model.SodaVendingMachine;

public class Main {

    public static void main(String [] args){
        SodaMachine sodaMachine = new SodaMachine(10);
        sodaMachine.insertMoney();
        sodaMachine.selectSoda();

        SodaVendingMachine sodaVendingMachine = new SodaVendingMachine(10);
        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();

    }
}
