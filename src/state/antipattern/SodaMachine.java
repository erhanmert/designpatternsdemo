package state.antipattern;

public class SodaMachine {
    final static int SOLD_OUT = 0;
    final static int NO_MONEY = 1;
    final static int HAS_MONEY = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public SodaMachine(int count) {
        this.count = count;

        if(count > 0){
            state = NO_MONEY;
        }
    }

    public void insertMoney(){
        if(state == HAS_MONEY){
            System.out.println("you can not insert another money");
        }else if(state == NO_MONEY){
            state = HAS_MONEY;
            System.out.println("you inserted money");
        }else if(state == SOLD_OUT){
            System.out.println("the machine is sold out");
        }else if(state == SOLD){
            System.out.println("Please wait we are already giving soda");
        }
    }

    public void ejectMoney(){
        if(state == HAS_MONEY){
            System.out.println("returning money");
            state = NO_MONEY;
        }else if(state == NO_MONEY){
            System.out.println("you have not inserted money");
        }else if(state == SOLD){
            System.out.println("already selected soda");
        }else if(state == SOLD_OUT){
            System.out.println("machine sold out");
        }

    }

    public void selectSoda(){
        if(state == SOLD){
            System.out.println("dispensing your soda");
            state = NO_MONEY;
        }else if(state == NO_MONEY){
            System.out.println("you selected soda but money first");
        }else if(state == SOLD_OUT){
            System.out.println("no soda left");
        }else if(state == HAS_MONEY){
            System.out.println("you selected soda");
            state = SOLD;
            dispense();
        }
    }

    public void dispense(){
        if(state == SOLD){
            System.out.println("dispensing your soda");
            count--;
            if(count == 0){
                state =SOLD_OUT;
            }else{
                state = NO_MONEY;
            }
        }else if(state == NO_MONEY){
            System.out.println("please insert money");
        }else if(state == SOLD_OUT){
            System.out.println("machine sold out");
        }else if(state == HAS_MONEY){
            System.out.println("no soda dispensed");
        }
    }
}
