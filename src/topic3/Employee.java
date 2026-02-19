package topic3;

public class Employee {

    // Private fields
    private String name;
    private double work_hours;
    private double salary;
    private double overtime_hours;

    // Constructor
    public Employee(String name, double work_hours, double salary, double overtime_hours) {
        this.name = name;
        this.work_hours = work_hours;
        this.salary = salary;
        this.overtime_hours = overtime_hours;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setWork_hours(double work_hours) {
        this.work_hours = work_hours;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setOvertime_hours(double overtime_hours) {
        this.overtime_hours = overtime_hours;
    }

    //  Getters

    public String getName() {
        return name;
    }

    public double getWork_hours() {
        return work_hours;
    }

    public double getSalary() {
        return salary;
    }

    public double getOvertime_hours() {
        return overtime_hours;
    }

    // Calculation methods

    public double calculateGross(){
        return (work_hours * salary) + (overtime_hours * (salary * 1.5));
    }

    public double calculateDeductions(){
        return calculateGross() * 0.6;
    }

    public double calculateNet(){
        return calculateGross() - calculateDeductions();
    }
}