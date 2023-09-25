package classes;

public class RawMaterial {
    private String materialCode;
    private int quality;
    private RawMaterialProperty rawMaterialProperty;

    public RawMaterial(String materialCode, int quality, RawMaterialProperty rawMaterialProperty) {
        this.materialCode = materialCode;
        this.quality = quality;
        this.rawMaterialProperty = rawMaterialProperty;
    }

    @Override
    public String toString() {
        return "RawMaterial{" +
                "materialCode='" + materialCode + '\'' +
                ", quality=" + quality +
                ", rawMaterialProperty=" + rawMaterialProperty +
                '}';
    }


    public String getMaterialCode() {
        return materialCode;
    }

    public int getQuality() {
        return quality;
    }

    public RawMaterialProperty getRawMaterialProperty() {
        return rawMaterialProperty;
    }
}
