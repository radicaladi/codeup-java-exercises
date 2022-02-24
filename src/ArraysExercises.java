import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person Amy = new Person("Amy");
        Person Barry = new Person("Barry");
        Person Cory = new Person("Cory");

        String[] persons = {Amy.getName(), Barry.getName(), Cory.getName()};
//        System.out.println(Arrays.toString(persons)); // testing
        for (int i = 0; i < persons.length; i += 1) {
            System.out.println(persons[i]);
        }
    }
}
