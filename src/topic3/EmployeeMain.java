package topic3;

public class EmployeeMain {
    public static void main(String[] args) {
        // Create an array of Employee objects with sample data
        Employee[] employees = {
                new Employee("John", 40, 20, 20),
                new Employee("Mary", 35, 25, 15),
                new Employee("Bob", 45, 18, 0),
                new Employee("Alice", 38, 30, 12),
                new Employee("Jane", 30, 25, 18),
                new Employee("Peter", 32, 28, 10)
        };

        // Go through the array and print details for each employee
        for (Employee e : employees) {
            System.out.println("Employee: " + e.getName());
            System.out.println("Gross: " + e.calculateGross());
            System.out.println("Deductions: " + e.calculateDeductions());
            System.out.println("Net: " + e.calculateNet());
            System.out.println("-------------------------");
        }
    }
}
