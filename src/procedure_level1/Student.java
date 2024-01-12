package procedure_level1;
public class Student {

    static void printNameAge(String name,int age, int id){
        System.out.println("Name " +name);
        System.out.println("Age "+age);
        System.out.println("ID "+id);

    }

    public static void main(String[] args) {
        printNameAge("Vaishnavi",21,120);
    }
}
