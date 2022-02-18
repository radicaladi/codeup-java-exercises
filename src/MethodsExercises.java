public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(userName("Adi"));
        System.out.println(addition(5, 3));
        System.out.println(subtraction(5, 3));
        System.out.println(multiplication(5, 3));
        System.out.println(division(5, 3));
        System.out.println(modulus(5, 3));
    }

    // class mini ex:
    public static String userName(String user){
        return "Hello, " + user;
    }

    // Basic Arithmetic

    public static int addition(int number1, int number2) {
        return number1 + number2;
    }
    public static int subtraction(int number1, int number2) {
        return number1 - number2;
    }
    public static int multiplication(int number1, int number2) {
        return number1 * number2;
    }
    public static int division(int number1, int number2) {
        return number1 / number2;
    }
    public static int modulus(int number1, int number2) {
        return number1 % number2;
    }


}
