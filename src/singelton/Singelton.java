package singelton;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Singelton {

    private volatile static Singelton instance;

    private Singelton(){

    }

    public static Singelton getInstance(){
        if(instance == null){
            synchronized ((Singelton.class)){
                if (instance == null){
                    instance = new Singelton();
                }
            }
        }
        return instance;

    }
}
