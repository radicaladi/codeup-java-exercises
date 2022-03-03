package grades;

import java.util.HashMap;


public class GradesApplication {
    public static void main(String[] args){
        // HashMap needs import java util
        HashMap<String, String> students = new HashMap<>();

        // 4 students & grades
        Student Jens = new Student("Jens");
        Jens.addGrade(75);
        Jens.addGrade(70);
        Jens.addGrade(83);
        Student Kai = new Student("Kai");
        Kai.addGrade(80);
        Kai.addGrade(77);
        Kai.addGrade(88);
        Student Liam = new Student("Liam");
        Liam.addGrade(90);
        Liam.addGrade(86);
        Liam.addGrade(82);
        Student Maven = new Student("Maven");
        Maven.addGrade(98);
        Maven.addGrade(90);
        Maven.addGrade(94);

        // HashMap key:values
        students.put("JJ_onRails", Jens);
        students.put("RubyKingKai98", Kai);
        students.put("LlamasFortunate", Liam);
        students.put("guitarHeiress99", Maven);
    }
}
