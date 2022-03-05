package grocery;

import util.Input;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GroceryListApplication {
    // method and prompts for grocery list input
    public static void addUserGroceries(HashMap<String, Integer> Category, String categoryName, Input Input) {
        System.out.printf("%nAdd an item to %s%n", categoryName);
        System.out.println("Enter item: ");
        String itemInput = Input.getString();
        System.out.printf("Add a quantity of %s:%n", itemInput);
        int itemQuantity = Input.getInt();
        addItems(Category, itemInput, itemQuantity);
        System.out.printf("%nYour %s list:%n", categoryName);
        System.out.println();
        sorting(Category);
        System.out.println();
    }

    // adds item to list
    public static void addItems(HashMap<String, Integer> category, String item, int quantity) {
        category.put(item, quantity);
    }

    // sorts category items a-z
    public static void sorting(HashMap<String, Integer> Category) {
        TreeMap<String, Integer> sorted = new TreeMap<>(Category);
        for (Map.Entry<String, Integer> entry : sorted.entrySet())
            System.out.println(entry.getKey() + " x " + entry.getValue());
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
            do {
                boolean additional = false;
                do {
                    System.out.println();
                    System.out.println("ENTER a category #: \n" +
                            "1 - Breads \n" +
                            "2 - Fruits\n" +
                            "3 - Vegetables\n" +
                            "4 - Meats\n" +
                            "5 - Other\n"
                    );
                    int selection = input.getInt();

                    input.getString();             // need this otherwise addUserGroceries won't take a string input (the item to input)
                    switch (selection) {
                        case 1:
                            addUserGroceries(Breads, "Breads", input);
                            break;
                        case 2:
                            addUserGroceries(Fruits, "Fruits", input);
                            break;
                        case 3:
                            addUserGroceries(Vegetables, "Vegetables", input);
                            break;
                        case 4:
                            addUserGroceries(Meats, "Meats", input);
                            break;
                        case 5:
                            addUserGroceries(Other, "Other", input);
                            break;
                        default:
                            System.out.println("Invalid option");
                    }
                    System.out.println("Would you like to:\n1. Add another item to your list \n-or-\n2. Finalize your grocery list\n\tEnter [ 1 ] or [ 2 ]");
                    int userWantsMoreItems = input.getInt();
                    if (userWantsMoreItems == 1) {
                        additional = true;
                    } else if (userWantsMoreItems == 2) {
                        additional = false;
                    }
                } while (additional);

                System.out.println("\nYour final grocery list is: ");
                sorting(Breads);
                sorting(Fruits);
                sorting(Vegetables);
                sorting(Meats);
                sorting(Other);
                System.out.println();

                // Decides if user wants to continue or not
                input.getString();
                System.out.print("Do you want to make another list? [y/n] \n");
                confirm = input.yesNo();

                if (!confirm) {
                    System.out.println("Powering off...");
                }

            } while (confirm);

        } // end if-loop
    } // end GroceryListApp();

    public static void main(String[] args) {
        GroceryListApp();
    }
}