package classes;

import java.util.ArrayList;

public class Factory {
    private Manufacturer manufacturer;
    private ArrayList<FurniturePart> furnitureParts;
    public Factory(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }


}
