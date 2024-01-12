package ProcedureProgramming;

public class Shirt {

    static double calculateDiscount(String size) {
        if (size.equalsIgnoreCase("small")) {
            return 0.1; // 10% discount for small shirts
        } else if (size.equalsIgnoreCase("medium")) {
            return 0.05; // 5% discount for medium shirts
        } else {
            return 0.0; // No discount for large or other sizes
        }
    }
    
    static void printShirtDetails(String size, String color, double price) {
        double discount = calculateDiscount(size);
        double discountedPrice = price - (price * discount);

        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + discountedPrice);
    }

    public static void main(String[] args) {
        // Example usage
        String shirtSize = "Medium";
        String shirtColor = "Blue";
        double shirtPrice = 25.0;

        // Print shirt details
        printShirtDetails(shirtSize, shirtColor, shirtPrice);
    }
}
