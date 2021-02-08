package command.model;

public class KirbyCharacterReceiver {
    private String name;

    public void moveUp(){
        System.out.println(getName()+ " kirby jumping up");
    }

    public void moveLeft(){
        System.out.println(getName()+ " kirby moving left");
    }

    public void moveRight(){
        System.out.println(getName()+ " kirby moving right");
    }

    public void moveDown(){
        System.out.println(getName()+ " kirby moving down");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
