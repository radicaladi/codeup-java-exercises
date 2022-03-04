package grocery;

import jdk.jfr.Category;
import util.Input;

import java.util.HashMap;

public class GroceryListApplication {
    // method and prompts for grocery list input
    public static void addUserGroceries(HashMap<String, Integer> Category, String categoryName, Input Input){
        System.out.printf("%nAdd an item to %s%n", categoryName);
        System.out.println("Enter item: ");
        String itemInput = Input.getString();
        System.out.printf("Add a quantity of %s", itemInput);
        int itemQuantity = Input.getInt();
        addItems(Category, itemInput, itemQuantity);
        System.out.printf("%nYour %s list:%n", categoryName);
        System.out.println();
    }

    // adds item to list
    public static void addItems(HashMap<String, Integer> category, String item, int quantity){
        category.put(item, quantity);
    }

    // client side
    public static void GroceryListApp() {
        System.out.println("Welcome to GroceryListr!\n");

        Input input = new Input();

        // assigning each category its own hashmap of contents to pull from
        HashMap<String, Integer> Breads = new HashMap<>();
        HashMap<String, Integer> Fruits = new HashMap<>();
        HashMap<String, Integer> Vegetables = new HashMap<>();
        HashMap<String, Integer> Meats = new HashMap<>();
        HashMap<String, Integer> Other = new HashMap<>();


        System.out.println("Would you like to create a grocery list? [y/n]");
        boolean userInput = input.yesNo();

        if (userInput) {
            boolean confirm;
            System.out.println();
            System.out.println("ENTER a category #: \n" +
                    "1 - Breads \n" +
                    "2 - Fruits\n" +
                    "3 - Vegetables\n" +
                    "4 - Meats\n" +
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