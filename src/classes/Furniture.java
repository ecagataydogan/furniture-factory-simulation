package classes;

public abstract class Furniture {
    protected String furnitureCode;
    protected String name;

    public Furniture(String furnitureCode,String name) {
        this.furnitureCode = furnitureCode;
        this.name = name;

    }

    public String getFurnitureCode() {
        return furnitureCode;
    }

    public String getName() {
        return name;
    }
}
