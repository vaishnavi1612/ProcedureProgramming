package procedure_level1;

public class Dog {


    static int calculateHumanAge(int dogAge) {
        if (dogAge <= 2) {
            return dogAge * 11; // For the first two years, each dog year is equivalent to 11 human years
        } else {
            return 22 + (dogAge - 2) * 5; // After two years, each dog year is equivalent to 5 human years
        }
    }

    // Function to print dog details
    static void printDogDetails(String breed, int age, double weight) {
        System.out.println("Breed: " + breed);
        System.out.println("Age (in dog years): " + age);
        System.out.println("Age (in human years): " + calculateHumanAge(age));
        System.out.println("Weight: " + weight + " kg");
    }

    public static void main(String[] args) {
        // Example usage
        String dogBreed = "Labrador";
        int dogAge = 3;
        double dogWeight = 25.5;

        // Print dog details
        printDogDetails(dogBreed, dogAge, dogWeight);
    }

}