package grades;

import java.util.HashMap;

import util.Input;


public class GradesApplication {
    public static void main(String[] args) {
        // HashMap needs import java util
        HashMap<String, Student> students = new HashMap<>();

        Input adminInput = new Input();

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

        // student grades program

        boolean loop = true; // continues until user exits main menu
        do {
            // main menu
            System.out.println();
            System.out.println("Welcome admin, ");
            System.out.println();
            System.out.println("Please select an option: \n" +
                    "0 - Exit \n1 - View a Student's Information \n2 - All Student Grades \n" +
                    "3 - View Class Average\n4 - Create a CSV File");
            int adminChoice = adminInput.getInt();
            System.out.println();

            // response to user input
            if (adminChoice == 0) {
                System.out.println("powering off...");
                return; // exits grades program
            } else if (adminChoice == 1) {
                boolean studentLoop = true; // loops option 1 until user exits
                do {
                    System.out.println("Select username: ");
                    System.out.println();
                    for (String key : students.keySet()) { // loops HashMap and prints usernames to console
                        System.out.printf("| %s \n", key);
                    }
                    System.out.println();
                    String selection = adminInput.getString(); // user must type input username exact
                    Student choice = students.get(selection);
                    try {                                     // prints selected student info to console
                        System.out.printf("Github name: %s%n"
                                        + "Real name: %s%n"
                                        + "Current average: %.1f%n ",
                                selection, choice.getName(), choice.getGradeAverage());

                        System.out.println();
                        System.out.println("Would you like to continue? [y/n]"); // loops option 1 or exits to main menu
                        studentLoop = adminInput.yesNo();
                    } catch (Exception e) {
                        System.out.println("Sorry, that user does not exist...");
                    }
                }
                while (studentLoop); // catches any user error and loops option 1 on error

            } else if (adminChoice == 2) // prints all student grades to console
            {
                for (String student : students.keySet()) {
                    System.out.printf("Name: %s%nGrades: %s%n", students.get(student).getName(), students.get(student).getStudentGrades());
                }
                System.out.println();
                System.out.println("Would you like to continue? [y/n]"); // loops option 1 or exits to main menu
                loop = adminInput.yesNo();
                if (!loop) {                                            // breaks loop, displays message, exits program
                    System.out.println("powering off...");
                }
            } else if (adminChoice == 3) // calculates class averages and prints to console
            {
                double classAvg = 0;
                for (String student : students.keySet()) {
                    classAvg += students.get(student).getGradeAverage();
                }
                classAvg /= students.size();
                System.out.printf("The class average is: %.2f%n", classAvg);
                System.out.println();
                System.out.println("Would you like to continue? [y/n]"); // loops to main menu or exits program
                loop = adminInput.yesNo();
                if (!loop) {                                            // breaks loop, displays message, exits program
                    System.out.println("powering off...");
                }
            } else if (adminChoice == 4)
            {
                System.out.println("name, github_username, average");
                for (String student : students.keySet()) {
                    System.out.printf("%s,%s,%.2f%n", students.get(student).getName(), student, students.get(student).getGradeAverage());
                }
                System.out.println();
                System.out.println("Would you like to continue? [y/n]"); // loops to main menu or exits program
                loop = adminInput.yesNo();
                if (!loop) {                                            // breaks loop, displays message, exits program
                    System.out.println("powering off...");
                }
            }
        }
        while (loop);//<--- while-loop end


    } //<--- main end
} //<--- GradesApp end
