package grades;

// ArrayList requires import java util
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
        double total = 0;
        double avg;
        for (Integer studentGrade : studentGrades) total = total + studentGrade;
        avg = total / studentGrades.size();
        return avg;
// traditional for-loop:
//        for(int i = 0; i<studentGrades.size(); i++)
//            total = total+studentGrades.get(i);
//        avg = total / studentGrades.size();
//        System.out.println("The Average IS:" + avg);
    }

    public static void main(String[] args){
        Student Markus = new Student("Markus");
        System.out.println(Markus.getName()); // Markus
        Markus.addGrade(80);
        Markus.addGrade(78);
        Markus.addGrade(95);
        Markus.addGrade(89);
        System.out.println(Markus.studentGrades); // [80,78,95,89]
        System.out.println("Student Grade Average: " + Markus.getGradeAverage()); // 85.5
    }
}
