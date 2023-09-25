package simulationmanager;

import classes.Factory;
import classes.Manufacturer;
import classes.Vendor;
import fileio.FileIO;

public class SimulationManager {
    public static void main(String[] args) {
        Vendor vendor = new Vendor(FileIO.getVendorPossessions("files/VendorPossessions.csv",
                "files/RawMaterialProperties.csv"));

        Manufacturer manufacturer1 = new Manufacturer("FIFO","LIFO",
                FileIO.getOrders("files/Manufacturer1Materials.csv"),FileIO.getOrders("files/Manufacturer1Furnitures.csv"));
        Manufacturer manufacturer2 = new Manufacturer("LIFO","FIFO",
                FileIO.getOrders("files/Manufacturer1Materials.csv"),FileIO.getOrders("files/Manufacturer1Furnitures.csv"));

        for(int i = 0; i < 3; i++) {
            manufacturer1.buyRawMaterials(i,vendor);
            manufacturer2.buyRawMaterials(i,vendor);
            Factory factory1 = new Factory(manufacturer1);
            Factory factory2 = new Factory(manufacturer2);
            


//            factory1.produceFurnitures();
//            factory2.produceFurnitures();

//            Furniture quality will be calculate for produced Furnitures, and will display,
//            Furniture cost and income will be calculate for produced Furnitures, and will display
//            Produced furnitures will be display
//            Unproduced furnitures will be display


        }







    }
}
