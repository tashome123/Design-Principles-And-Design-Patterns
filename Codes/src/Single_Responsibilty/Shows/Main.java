package Single_Responsibilty.Shows;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "Software Engineer");
        EmployeePersistence persistence = new EmployeePersistence();

        persistence.saveToFile(emp, "employee.txt");

        System.out.println("Employee saved!");
        System.out.println("Details: " + emp.getDetails());
    }
}