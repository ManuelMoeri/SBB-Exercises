package Java.grundlagen.j2.labs.oop.amountOfWater;

import java.util.ArrayList;
import java.util.List;

public class Dam {

    private int waterIncoming;
    private int waterOutgoing;
    private boolean damOpen;

    public Dam(int waterIncoming, int waterOutgoing, boolean damOpen) {
        this.waterIncoming = waterIncoming;
        this.waterOutgoing = waterOutgoing;
        this.damOpen = damOpen;
    }

    public int getWaterIncoming() {
        return waterIncoming;
    }

    public int getWaterOutgoing() {
        return waterOutgoing;
    }

    public boolean getDamOpen() {
        return damOpen;
    }

    public static List<Dam> everyWaterObject = new ArrayList<>();

    public static void everyWaterObjectMethod(int incomingWaterOfCustomer, int outgoingWaterOfCustomer, boolean openDamYN) {

    }
}