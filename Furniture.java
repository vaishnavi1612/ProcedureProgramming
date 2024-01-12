package ProcedureProgramming;

public class Furniture {

    static double calculateDiscount(String material) {
        if (material.equalsIgnoreCase("wood")) {
            return 0.2; // 20% discount for wood furniture
        } else if (material.equalsIgnoreCase("metal")) {
            return 0.15; // 15% discount for metal furniture
        } else {
            return 0.1; // 10% discount for other materials
        }
    }
    static void printFurnitureDetails(String type, String material, double price) {
        double discount = calculateDiscount(material);
        double discountedPrice = price - (price * discount);

        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + discountedPrice);
    }

    public static void main(String[] args) {
        String furnitureType = "Table";
        String furnitureMaterial = "Wood";
        double furniturePrice = 200.0;


        printFurnitureDetails(furnitureType, furnitureMaterial, furniturePrice);
    }


}
