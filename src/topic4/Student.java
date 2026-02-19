package topic4;

public class Student {

    // Private fields
    private String name;
    private double grade;
    private String major;
    private int academicYear;

    // Constructor
    public Student(String name, double grade, String major, int academicYear) {
        setName(name);
        setGrade(grade);
        setMajor(major);
        setAcademicYear(academicYear);
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        this.grade = grade;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setAcademicYear(int academicYear) {
        if (academicYear < 1) {
            throw new IllegalArgumentException("Academic year must be greater than 1");
        }
        this.academicYear = academicYear;
    }

    // Getters

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public String getMajor() {
        return major;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    // Grade Pass method
    public boolean isPassed() {
        if (grade >= 40) {
            return true;
        } else {
            return false;
        }
    }
}