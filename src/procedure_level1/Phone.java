package procedure_level1;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

public class Phone {
    static double calculatePhonePrice(String make, String model, int storage) {
        double basePrice = 300.0;
        double makeFactor = 1.2;
        double modelFactor = 1.1;
        double storageFactor = 0.1 * storage;
        return basePrice * makeFactor * modelFactor + storageFactor;
    }

    // Function to print phone details
    static void printPhoneDetails(String make, String model, int storage) {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: $" + calculatePhonePrice(make, model, storage));
    }

    public static void main(String[] args) {
        String phoneMake = "Samsung";
        String phoneModel = "Galaxy S20";
        int phoneStorage = 128;

        printPhoneDetails(phoneMake, phoneModel, phoneStorage);
    }


}

