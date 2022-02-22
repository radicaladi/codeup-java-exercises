public class Person {
   private String name;

    public String getName (){
       return this.name;
   }
    public void setName(String name){
       this.name = name;
    }
    public String sayHello(){
        return String.format("Hello from %s!", name);
    }
    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Person phil = new Person("Phil");
        phil.setName("Phil");
        System.out.println(phil.sayHello());
        System.out.println(phil.getName());
        System.out.println();
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // note: this means the names are assigned the same value
//        System.out.println(person1 == person2); // note: false because the two instances are uniquely separate
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // note: true because person2 is assigned person1
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName()); // confusing but I believe it is because person 2 is assigned person 1 and thus anything set to either will set to the other
    }

}

//    public String firstName;
//    public String lastName;
//    private int age;
//    public String relationship;
//
//    public String sayHello() {
//        return String.format("Hello from %s %s!", firstName, lastName);
//    }

//        Person adrian = new Person();
//        adrian.firstName = "Adrian";
//        adrian.lastName = "Brown";
//        adrian.age = 31;
//        adrian.relationship = "It's complicated";
//
//        System.out.println("adrian.firstName = " + adrian.firstName);
//        System.out.println("adrian.lastName = " + adrian.lastName);
//        System.out.println("adrian.age = " + adrian.age);
//        System.out.println("adrian.relationship = " + adrian.relationship);
//        System.out.println(adrian.sayHello());