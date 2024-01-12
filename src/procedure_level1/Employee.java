package procedure_level1;

public class Employee {
    static double calculateYearlySalary(double monthlySalary){
        return monthlySalary*12;
    }
    static void printNameSalaryId(String name,double monthlysalary, int id){
        System.out.println("Name "+name);
        System.out.println("YearlySalary "+calculateYearlySalary(monthlysalary));
        System.out.println("Id "+id);
    }

    public static void main(String[] args) {
        printNameSalaryId("Vaishnavi",70000,120);


    }

}



