package classes;

public class RawMaterialProperty {
    private String materialCode;
    private int length;
    private int width;
    private int height;
    private int cost;

    public RawMaterialProperty(String materialCode, int length, int width, int height, int cost) {
        this.materialCode = materialCode;
        this.length = length;
        this.width = width;
        this.height = height;
        this.cost = cost;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getCost() {
        return cost;
    }


    @Override
    public String toString() {
        return "RawMaterialProperty{" +
                "materialCode='" + materialCode + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", cost=" + cost +
                '}';
    }
}
