package adapter;

import adapter.interfaces.SocketAdapter;
import adapter.model.SocketAdapterImpl;
import adapter.model.SocketObjectAdapterImpl;
import adapter.model.Volt;

import java.net.URLEncoder;

public class Main {
    public static void main(String [] args){
        testingObjectAdapter();
        testingClassAdapter();
    }

    public static void testingObjectAdapter(){
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(socketAdapter,3);
        Volt v12 = getVolt(socketAdapter,12);
        Volt v120 = getVolt(socketAdapter,120);

        System.out.println("v3 volt using "+v3.getVolts());
        System.out.println("v12 volt using "+v12.getVolts());
        System.out.println("v120 volt using "+v120.getVolts());
    }

    private static void testingClassAdapter(){
        SocketAdapter socketAdapter = new SocketAdapterImpl();

        Volt v3 = getVolt(socketAdapter,3);
        Volt v12 = getVolt(socketAdapter,12);
        Volt v120 = getVolt(socketAdapter,120);

        System.out.println("v3 volt using "+v3.getVolts());
        System.out.println("v12 volt using "+v12.getVolts());
        System.out.println("v120 volt using "+v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i){
        switch (i){
            case 3: return socketAdapter.get3Volts();
            case 12: return socketAdapter.get120Volts();
            case 120: return socketAdapter.get120Volts();
            default:return socketAdapter.get12Volts();
        }
    }
}
