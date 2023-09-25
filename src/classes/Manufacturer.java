package classes;

import java.util.ArrayList;

public class Manufacturer {
    private String howToUseRawMaterials;
    private String howToProduceFurnitures;
    private ArrayList<Order> orderMaterials;
    private ArrayList<Order> orderFurnitures;
    private ArrayList<Furniture> furnitures;
    private ArrayList<RawMaterial> rawMaterials;

    public Manufacturer(String howToUseRawMaterials, String howToProduceFurnitures, ArrayList<Order> orderMaterials,
                        ArrayList<Order> orderFurnitures) {
        this.howToUseRawMaterials = howToUseRawMaterials;
        this.howToProduceFurnitures = howToProduceFurnitures;
        this.orderMaterials = orderMaterials;
        this.orderFurnitures = orderFurnitures;
        this.furnitures = new ArrayList<>();
        this.rawMaterials = new ArrayList<>();
    }

    public void buyRawMaterials(int day,Vendor vendor) {
         Order order = orderMaterials.get(day);
         ArrayList<RawMaterial> vendorsRawMaterials = vendor.getRawMaterials();
         ArrayList<RawMaterial> copyVendorsRawMaterials = new ArrayList<>(vendorsRawMaterials);
         for (OrderMaterial orderMaterial : order.getOrder()) {
             String rawMaterialCode = orderMaterial.getMaterialCode();
             int count = orderMaterial.getCount();
             for (RawMaterial rawMaterial : vendorsRawMaterials) {
                 if (count == 0) break;
                 if (rawMaterial.getMaterialCode().equals(rawMaterialCode)) {
                     this.rawMaterials.add(rawMaterial);
                     copyVendorsRawMaterials.remove(rawMaterial);
                     count--;
                 }
             }

         }
         vendorsRawMaterials.clear();
         vendorsRawMaterials.addAll(copyVendorsRawMaterials);

    }

    public ArrayList<RawMaterial> getRawMaterials() {
        return rawMaterials;
    }




//GETTERS
    public String getHowToUseRawMaterials() {
        return howToUseRawMaterials;
    }

    public String getHowToProduceFurnitures() {
        return howToProduceFurnitures;
    }

    public ArrayList<Order> getOrderMaterials() {
        return orderMaterials;
    }

    public ArrayList<Order> getOrderFurnitures() {
        return orderFurnitures;
    }

    public ArrayList<Furniture> getFurnitures() {
        return furnitures;
    }
}
