package Java.grundlagen.j3.zoo.enclosure;

public class Terrain extends Enclosure{
    private String fenceHeight;

    public Terrain(int enclosureNumber, String size, int temperatur, String humidity, String capacity, String fenceHeight) {
        super(enclosureNumber, size, temperatur, humidity, capacity);
        this.fenceHeight = fenceHeight;
    }

    public static void main(String[] args) {

    }
}
