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
}
