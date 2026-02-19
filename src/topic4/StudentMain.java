package topic4;

import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {

        // Create a list of Student objects
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 85.5, "Computer Science", 2));
        students.add(new Student("Mary", 36.9, "Mathematics", 3));
        students.add(new Student("Bob", 42.3, "Physics", 1));
        students.add(new Student("Alice", 69.7, "History", 2));
        students.add(new Student("Jane", 70.1, "Chemistry", 1));

        // Initialize variables for statistics
        double totalScore = 0;
        double maxScore = Double.MIN_VALUE;
        double minScore = Double.MAX_VALUE;

        // Calculate total, maximum, and minimum scores
        for (Student s : students) {
            double grade = s.getGrade();
            totalScore += grade;
            if (grade > maxScore) maxScore = grade;
            if (grade < minScore) minScore = grade;
        }

        // Calculate average score
        double averageScore = totalScore / students.size();

        System.out.println("Student Information: ");
        System.out.println("----------------------------");

        // Display individual student details
        for (Student s : students) {
            System.out.println("Name: " + s.getName());
            System.out.println("Major: " + s.getMajor());
            System.out.println("Year: " + s.getAcademicYear());
            System.out.println("Grade: " + s.getGrade());
            System.out.println("Status: " + (s.isPassed() ? "Passed" : "Failed"));
            System.out.println("----------------------------");
        }

        // Display summary statistics
        System.out.println("Statistics: ");
        System.out.printf("Average Score: %.2f%n", averageScore);
        System.out.printf("Highest Score: %.2f%n", maxScore);
        System.out.printf("Lowest Score: %.2f%n", minScore);
    }
}
