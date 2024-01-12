package procedure_level1;

public class Computer {

    static double calculateComputerPrice(String processor, int ram, int storage) {
        double basePrice = 800.0;
        double processorFactor = 1.2;
        double ramFactor = 0.01 * ram;
        double storageFactor = 0.05 * storage;

        return basePrice * processorFactor + basePrice * ramFactor + basePrice * storageFactor;
    }

    // Function to print computer details
    static void printComputerDetails(String processor, int ram, int storage) {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
    }

    public static void main(String[] args) {

        String computerProcessor = "Intel i5";
        int computerRAM = 8;
        int computerStorage = 256;

        printComputerDetails(computerProcessor, computerRAM, computerStorage);


        double computerPrice = calculateComputerPrice(computerProcessor, computerRAM, computerStorage);
        System.out.println("Price: $" + computerPrice);
    }


    }

