package classes;

import java.util.ArrayList;

public class FurniturePart {
    private String furnitureCode;
    private ArrayList<Part> neededParts;

    public FurniturePart(String furnitureCode, ArrayList<Part> neededParts) {
        this.furnitureCode = furnitureCode;
        this.neededParts = neededParts;
    }

    @Override
    public String toString() {
        return "FurniturePart{" +
                "furnitureCode='" + furnitureCode + '\'' +
                ", neededParts=" + neededParts +
                '}';
    }

    public String getFurnitureCode() {
        return furnitureCode;
    }

    public ArrayList<Part> getNeededParts() {
        return neededParts;
    }
}
