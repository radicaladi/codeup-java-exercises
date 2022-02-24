import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3]; // an array containing 3 objects -- Person[] people is array; new Person[3] is objects

//        System.out.println(Arrays.toString(people)); // test if array populates anything
        people[0] = new Person("Amy");
        people[1] = new Person("Barry");
        people[2] = new Person("Cory");
//        System.out.println(people[0].getName()); // test if array stored Person object -- returning name of Person object

        for (Person person : people) {
            System.out.println(person.getName());
        }

    }
}
