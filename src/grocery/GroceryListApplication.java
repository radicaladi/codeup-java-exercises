package grocery;

import util.Input;

public class GroceryListApplication {
    public static void GroceryListApp() {
        System.out.println("Welcome to GroceryListr!\n");

        Input input = new Input();

        System.out.println("Would you like to create a grocery list? [y/n]");
        boolean userInput = input.yesNo();

        if (userInput) {
            boolean confirm;
            System.out.println();
            System.out.println("Choose a category to add groceries to: \n" +
                    "1 - Breads \n" +
                    "2 - Fruits\n" +
                    "3 - Vegetables\n" +
                    "4 - Proteins\n" +
                    "5 - Other\n"
            );
            int selection = input.getInt();
            switch (selection){
                case 1:
                    System.out.println("something breads");
                    break;
                case 2:
                    System.out.println("something fruits");
                    break;
                case 3:
                    System.out.println("something vegetables");
                    break;
                case 4:
                    System.out.println("something meats");
                    break;
                case 5:
                    System.out.println("something other");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

    }
    public static void main(String[] args) {
        GroceryListApp();
    }
}