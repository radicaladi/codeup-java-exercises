package grades;

import java.util.ArrayList;

public class Student {
    private final String studentName;
    private final ArrayList<Integer> studentGrades;

    public Student (String name){
        this.studentName = name;
        this.studentGrades = new ArrayList<>();
    }

    public String getName() {
        return studentName;
    }

    public void addGrade(int grade) {
        studentGrades.add(grade);
    }

    // returns the student's grade
    public ArrayList<Integer> getStudentGrades() {
        return studentGrades;
    }

    public double getGradeAverage() {
        double total = 0;
        double avg;
        for (int studentGrade : studentGrades) total = total + studentGrade;
        avg = total / studentGrades.size();
        return avg;
    }

    public static void main(String[] args){
        Student Markus = new Student("Markus");
        System.out.println(Markus.getName()); // Markus
        Markus.addGrade(80);
        Markus.addGrade(78);
        Markus.addGrade(95);
        Markus.addGrade(89);
        System.out.println("Student Grades: " + Markus.getStudentGrades()); //[80,78,95,89]
        System.out.println("Student Grade Average: " + Markus.getGradeAverage()); // 85.5
    }
}
