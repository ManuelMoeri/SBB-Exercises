package Java.grundlagen.j3.labs.zoo.enclosure;

public class Terrarium extends Enclosure{
    private String sweetOrSaltWater;
    private boolean waterDitch;

    public Terrarium(int enclosureNumber, String size, int temperatur, String humidity, String capacity, String sweetOrSaltWater, boolean waterDitch) {
        super(enclosureNumber, size, temperatur, humidity, capacity);
        this.sweetOrSaltWater = sweetOrSaltWater;
        this.waterDitch = waterDitch;
    }

    public static void main(String[] args) {

    }
}
