package singelton;

public class MyClass {

    private static MyClass myClass;

    String name;
    private MyClass() {

    }

    public static synchronized MyClass getInstance(){
        if(myClass == null){
            myClass = new MyClass();
        }
        return myClass;
    }
}
