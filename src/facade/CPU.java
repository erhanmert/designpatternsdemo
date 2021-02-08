package facade;

public class CPU {
    public void freeze(){
        System.out.println("computer freezing");
    }

    public void jump(long position){
        System.out.println("jumping to .."+position);
    }

    public void execute(){
        System.out.println("computer executing commands");
    }
}
