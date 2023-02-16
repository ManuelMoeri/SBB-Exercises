package Java.grundlagen.j3.zoo.enclosure;

public class FishTank extends Enclosure{
    private String sweetOrSaltWater;
    private boolean waterDitch;

    public FishTank(int enclosureNumber, String size, int temperatur, String humidity, String capacity, String sweetOrSaltWater, boolean waterDitch) {
        super(enclosureNumber, size, temperatur, humidity, capacity);
        this.sweetOrSaltWater = sweetOrSaltWater;
        this.waterDitch = waterDitch;
    }

    public static void main(String[] args) {

    }
}
