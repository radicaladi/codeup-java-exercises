import java.util.Arrays;

public class ArraysExercises {
    public void Person (String name) {
        System.out.println("Name is: " + name);
    }
    public static void main(String[] args) {
        Person a = new Person("Anton");
        Person b = new Person("Barry");
        Person c = new Person("Cory");

        String[] persons = { a, b, c};

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
    }
}
