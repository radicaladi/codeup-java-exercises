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

    public static void main(String[] args) {
        Person phil = new Person();
        phil.setName("Phil");
        System.out.println(phil.sayHello());
        System.out.println(phil.getName());
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