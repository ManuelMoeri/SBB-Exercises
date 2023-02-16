package Java.grundlagen.j3.zoo.enclosure;

public class Enclosure {
    private int enclosureNumber;
    private String size;
    private int temperatur;
    private String humidity;
    private String capacity;

    public Enclosure (int enclosureNumber, String size, int temperatur, String humidity, String capacity) {
        this.enclosureNumber = enclosureNumber;
        this.size = size;
        this.temperatur = temperatur;
        this.humidity = humidity;
        this.capacity = capacity;
    }
}

