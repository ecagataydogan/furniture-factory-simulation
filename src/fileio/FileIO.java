package fileio;

import classes.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    public static ArrayList<Order> getOrders(String path) {
        ArrayList<String[]> data = getData(path);
        ArrayList<Order> orders = new ArrayList<>();

        for (String[] lineData : data) {
            ArrayList<OrderMaterial> orderMaterials = new ArrayList<>();
            for (int i = 1; i < lineData.length ; i+= 2) {
                String materialCode = lineData[i];
                int count = Integer.parseInt(lineData[i+1]);
                OrderMaterial orderMaterial = new OrderMaterial(materialCode,count);
                orderMaterials.add(orderMaterial);
            }
            Order order = new Order(orderMaterials);
            orders.add(order);
        }
        return orders;


    }


    public static ArrayList<FurniturePart> getFurnitureParts(String path) {
        ArrayList<String[]> data = getData(path);
        ArrayList<FurniturePart> furnitureParts = new ArrayList<>();
        for (String[] lineData : data) {
            ArrayList<Part> parts = new ArrayList<>();
            String furnitureCode = lineData[0];
            for (int i = 1; i < lineData.length; i+= 2) {
                String materialCode = lineData[i];
                int count = Integer.parseInt(lineData[i+1]);
                Part part = new Part(materialCode,count);
                parts.add(part);
            }
            FurniturePart furniturePart = new FurniturePart(furnitureCode,parts);
            furnitureParts.add(furniturePart);
        }
        return furnitureParts;
    }


    public static ArrayList<RawMaterial> getVendorPossessions(String vendorPossessionsPath, String rawMaterialPropertiesPath) {
        ArrayList<RawMaterialProperty> rawMaterialProperties = getRawMaterialProperties(rawMaterialPropertiesPath);
        ArrayList<String[]> vendorPossessionsData = getData(vendorPossessionsPath);
        ArrayList<RawMaterial> vendorPossessions = new ArrayList<>();
        for (String[] lineData : vendorPossessionsData) {
            String materialCode = lineData[0];
            int quality = Integer.parseInt(lineData[1]);
            for (RawMaterialProperty rawMaterialProperty : rawMaterialProperties) {
                if (rawMaterialProperty.getMaterialCode().equals(materialCode)) {
                    RawMaterial rawMaterial = new RawMaterial(materialCode,quality,rawMaterialProperty);
                    vendorPossessions.add(rawMaterial);
                }
            }
        }
        return vendorPossessions;
    }


    private static ArrayList<RawMaterialProperty> getRawMaterialProperties(String path) {
        ArrayList<String[]> rawMaterialPropertiesData = getData(path);
        ArrayList<RawMaterialProperty> rawMaterialProperties = new ArrayList<>();
        for (String[] lineData : rawMaterialPropertiesData) {
            String materialCode = lineData[0];
            int length = Integer.parseInt(lineData[1]);
            int width = Integer.parseInt(lineData[1]);
            int height = Integer.parseInt(lineData[1]);
            int cost = Integer.parseInt(lineData[1]);
            RawMaterialProperty rawMaterialProperty = new RawMaterialProperty(materialCode, length, width, height, cost);
            rawMaterialProperties.add(rawMaterialProperty);
        }
        return rawMaterialProperties;
    }


    //HELPER METHOD FOR READ DATA
    private static ArrayList<String[]> getData(String path) {
        ArrayList<String[]> data = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(path));
            while (scanner.hasNextLine()) {
                String[] lineData = scanner.nextLine().split(",");
                data.add(lineData);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        return data;
    }

}
