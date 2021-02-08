package builder;

public class Main {
    public static void main(String [] args){
        User erhan = new User.UserBuilder("erhan","mert")
                .address("ankara")
                .age(32)
                .phoneNumber("123123")
                .build();

        System.out.println(erhan);
    }
}
