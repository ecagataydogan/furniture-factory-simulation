package classes;

import java.util.ArrayList;

public class Vendor {
    private ArrayList<RawMaterial> rawMaterials;
    public Vendor(ArrayList<RawMaterial> rawMaterials) {
        this.rawMaterials = rawMaterials;
    }

    public ArrayList<RawMaterial> getRawMaterials() {
        return rawMaterials;
    }
}
