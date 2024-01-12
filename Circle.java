package ProcedureProgramming;

public class Circle {
    static void calculateArea(double radius) {
        System.out.println( Math.PI * radius * radius);
    }
    static void calculateCircumference(double radius) {
        System.out.println(2 * Math.PI * radius);
    }

    public static void main(String[] args) {
        calculateArea(12);
        calculateCircumference(12);
    }



}
