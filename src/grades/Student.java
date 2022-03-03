package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer> studentGrades;

    // constructor
    public Student (String name){
        this.studentName = name;
        this.studentGrades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return studentName;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        studentGrades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int total = 0;
        int avg;
        for (Integer studentGrade : studentGrades) total = total + studentGrade;
        avg = total / studentGrades.size();
        System.out.println("Student Grade Average: " + avg);
        return avg;
// traditional for-loop:
//        for(int i = 0; i<studentGrades.size(); i++)
//            total = total+studentGrades.get(i);
//        avg = total / studentGrades.size();
//        System.out.println("The Average IS:" + avg);
    }
}
