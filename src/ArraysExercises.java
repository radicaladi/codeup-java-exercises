import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person newPerson) {
        // static method accepting array of objects and person object
        Person[] newArray = Arrays.copyOf(people, people.length+1);
        // returning array +1 greater
        newArray[newArray.length - 1] = newPerson;
        // with newPerson inserted at end;
        for (Person person : newArray) {
            System.out.println(person.getName());
        }
        return newArray;
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3]; // an array containing 3 objects -- Person[] people is array; new Person[3] is objects

//        System.out.println(Arrays.toString(people)); // test if array populates anything
        people[0] = new Person("Amy");
        people[1] = new Person("Barry");
        people[2] = new Person("Cory");
//        System.out.println(people[0].getName()); // test if array stored Person object -- returning name of Person object

        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println(person.getName());
        }
        System.out.println(); // space in console

        // create 4th person, people array index 3
        Person dex = new Person("Dex");
        // add person to people array
        addPerson(people, dex);

    }
}
