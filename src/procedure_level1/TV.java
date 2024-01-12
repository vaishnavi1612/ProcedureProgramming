package procedure_level1;

public class TV {

    static double calculateDiscount(int size) {
        if (size > 50) {
            return 0.1; // 10% discount for TVs larger than 50 inches
        } else {
            return 0.05; // 5% discount for other sizes
        }
    }

    static void printTVDetails(String brand, int size, double price) {
        double discount = calculateDiscount(size);
        double discountedPrice = price - (price * discount);

        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size + " inches");
        System.out.println("Original Price: $" + price);
        System.out.println("Discounted Price: $" + discountedPrice);
    }

    public static void main(String[] args) {
        String tvBrand = "Sony";
        int tvSize = 55;
        double tvPrice = 1200.0;

        printTVDetails(tvBrand, tvSize, tvPrice);
    }
}

    

